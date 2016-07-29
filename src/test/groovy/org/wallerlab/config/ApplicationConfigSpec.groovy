package org.wallerlab.config

import org.neo4j.ogm.session.SessionFactory
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager
import spock.lang.Specification

/**
 * Created by waller on 29/07/16.
 */
class ApplicationConfigSpec extends Specification{


    def " test neo4j setup has a valid SessionFactory"(){

        when:
        ApplicationConfig appConfig = new ApplicationConfig()

        then:
        SessionFactory sessionFactory = appConfig.sessionFactory()

    }

    def " test neo4j setup has a valid TM"(){

        when:
        ApplicationConfig appConfig = new ApplicationConfig()

        then:
        Neo4jTransactionManager transactionManager = appConfig.transactionManager()
    }

}
