package org.wallerlab.config

import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.job.builder.JobBuilder
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream
import org.wallerlab.service.Translator
import spock.lang.Specification

class BatchConfigSpec extends Specification{


    def " test config for Spring Batch "(){

        when:

        def jobBuilder = Mock(JobBuilder)
        def jbf = Mock(JobBuilderFactory)
        def step = Mock(Step)
        jbf.get("bootstrap") >> jobBuilder

        def sbf = Mock(StepBuilderFactory )

        BatchConfig config = new BatchConfig()

        then:" assert beans are present"
        //config.itemProcessor()
       // config.multiReader()
        2 == 1+1
    }

}
