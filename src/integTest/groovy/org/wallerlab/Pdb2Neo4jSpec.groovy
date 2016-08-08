package org.wallerlab

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ActiveProfiles("test")
@IntegrationTest
@ContextConfiguration(loader = SpringApplicationContextLoader.class,classes = [org.wallerlab.Pdb2Neo4j.class] )
class Pdb2Neo4jSpec extends Specification{

    def " assert app can function"(){
        expect:
        Pdb2Neo4j.main()
    }

}

