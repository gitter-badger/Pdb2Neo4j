package org.wallerlab.domain

import spock.lang.Specification

/**
 * Created by waller on 29/07/16.
 */
class MolecularSystemSpec extends Specification{

    def "atom domain model"(){
        when:
        def molecule = Mock(Molecule)
        def molecules = [molecule] as Set

        def atom = Mock(Atom)
        def atom2 = Mock(Atom)

        def atoms = [atom,atom2] as Set
        molecule.getAtoms() >> atoms
        def ms = new MolecularSystem("test", molecules)

        then:
        ms.getMolecules().size() == 1

    }
}
