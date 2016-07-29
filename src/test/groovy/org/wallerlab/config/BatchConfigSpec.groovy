package org.wallerlab.config

import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.job.builder.JobBuilder
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream
import org.wallerlab.service.Translator
import spock.lang.Specification


//@IntegrationTest
//@ContextConfiguration(loader = SpringApplicationContextLoader.class,classes = [BatchConfig.class] )
class BatchConfigSpec extends Specification{


    def " test config for Spring Batch "(){


        when:

        def jbf = Mock(JobBuilderFactory)
        def jobBuilder = Mock(JobBuilder)
        def step = Mock(Step)
        jbf.get("bootstrap") >> jobBuilder

        def sbf = Mock(StepBuilderFactory )



        BatchConfig config = new BatchConfig()
        config.bootstrapStep = step
        config.translator = Mock(Translator)
        config.itemReader = Mock(ResourceAwareItemReaderItemStream)
        then:" assert beans are present"
        config.bootstrapStep == step
        config.itemProcessor()
        config.multiReader()

    }

}
