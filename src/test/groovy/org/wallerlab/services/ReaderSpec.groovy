package org.wallerlab.services

import org.springframework.core.io.Resource
import org.wallerlab.service.Reader
import spock.lang.*

class ReaderSpec  extends Specification {

    def "test resource setter"(){
        when:
        Reader reader = new Reader()
        reader.setResource(Mock(Resource))

        then:
        reader.resource != null
    }


    def "test null resource"(){
        when:
        Reader reader = new Reader()
        reader.setResource(null)

        then:
        !reader.read()
    }


}