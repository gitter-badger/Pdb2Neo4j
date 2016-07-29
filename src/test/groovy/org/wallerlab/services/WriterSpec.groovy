package org.wallerlab.services

import org.wallerlab.domain.MolecularSystem
import org.wallerlab.repo.MolecularSystemRepo
import org.wallerlab.service.Writer
import spock.lang.Specification

class WriterSpec extends Specification {

    def "test writer"(){
        when:

        MolecularSystemRepo msr = Mock(MolecularSystemRepo)
        Writer writer = new Writer()
        writer.msr = msr

        def items = [Mock(MolecularSystem),Mock(MolecularSystem)]

        then:
        writer.write(items)

    }

    def "test writer with null repo"(){
        when:

        Writer writer = new Writer()
        writer.msr = null

        def items = [Mock(MolecularSystem),Mock(MolecularSystem)]
        writer.write(items)

        then :
        thrown(NullPointerException)
    }

    def "test writer with null items"(){
        when:

        MolecularSystemRepo msr = Mock(MolecularSystemRepo)
        Writer writer = new Writer()
        writer.msr = msr

        def items = null
        writer.write(items)

        then :
        thrown(NullPointerException)
    }


}