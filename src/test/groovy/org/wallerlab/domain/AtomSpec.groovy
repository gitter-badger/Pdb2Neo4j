package org.wallerlab.domain

import spock.lang.Specification

/**
 * Created by waller on 29/07/16.
 */
class AtomSpec extends Specification{

    def "atom domain model"(){
        when:
        def atom = new Atom("C",0.1,0.2,0.3,"test","test1","test2")

        then:
        atom.getElement() == "C"
        atom.getX() == 0.1;
        atom.getY() == 0.2;
        atom.getZ() == 0.3;
        atom.getResId() == "test"
        atom.getChain() == "test1"
        atom.getGroup() == "test2"
        atom.toString()
        atom.getId() == null //neo4j
    }

}
