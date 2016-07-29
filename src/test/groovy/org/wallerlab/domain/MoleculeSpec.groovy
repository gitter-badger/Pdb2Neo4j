package org.wallerlab.domain

import spock.lang.Specification

/**
 * Created by waller on 29/07/16.
 */
class MoleculeSpec extends Specification{

    def "atom domain model"(){
        when:
        def atom = Mock(Atom)

        def atoms = [atom,atom] as Set
        def molecule = new Molecule("Test", atoms)

        then:
        molecule.getName() == "Test"
        molecule.getAtoms().size() == 1

    }
}
