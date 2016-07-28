package org.wallerlab.config;

import java.io.IOException;

import org.springframework.batch.item.adapter.ItemProcessorAdapter;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * In this class all the batch jobs and steps are configured.
 *  - bootstrap job: adding, updating data from local files to neo4j database
 *  - master job: sending messages containing the id of one or all database entries to a
 *   jms queue (request)
 * 
 * @author Christian Ouali Turki
 *
 */
@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@ComponentScan("org.wallerlab")
public class BatchConfig{

	/**
	 * getting copy of application context
	 */
	 @Autowired
	 ConfigurableApplicationContext context;

	private static final String xml_directory = "file:/Users/waller/pdb/**/*.xml";

	@Autowired
	@Qualifier("bootstrapStep")
	private Step bootstrapStep;

	/**
	 * Bean for building the bootstrap job executing bootstrapStep.
	 *
	 * @param jbf, JobBuilderFactory
	 * @return bootstrap
	 * @throws IOException
	 */
	@Bean
	public Job bootstrapJob(JobBuilderFactory jbf) throws IOException {
		return jbf.get("bootstrap")
				  .incrementer(new RunIdIncrementer())
				  .flow(bootstrapStep)
				  .end()
				  .build();
	}

	/**
	 * Bean for building the bootstrap step.
	 *
	 * @param sbf, StepBuilderFactory
	 * @return bootstrapStep
	 * @throws IOException
	 */
	@Bean
	public Step bootstrapStep(StepBuilderFactory sbf) throws IOException {
		return sbf.get("bootstrapStep").chunk(1)
				.reader(multiReader())
				.processor(itemProcessor())
				.writer((ItemWriter)context.getBean("writer"))
				.build();
	}

	/**
	 * Setting ItemReader for bootstrapStep as a MultiResourceItemReader. Use
	 * PathMatchingResourcePatternResolver for setting the file path. Delegates
	 * to the PdbmlFileReader to handle the pdbml files.
	 *
	 * @return reader
	 * @throws IOException
	 */
	@Bean
	public MultiResourceItemReader multiReader() throws IOException {
		MultiResourceItemReader reader = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = pathMatchinResolver.getResources(xml_directory);
		for(Resource resource :resources)
			System.out.println("Resource found: " + resource);
		reader.setResources(resources);
		reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("reader"));
		return reader;
	}

	@Bean
	ItemProcessor itemProcessor(){
		ItemProcessorAdapter processor = new ItemProcessorAdapter<>();
		processor.setTargetObject(context.getBean("translator"));
		processor.setTargetMethod("translate");
		return (ItemProcessor) processor;
	}

}