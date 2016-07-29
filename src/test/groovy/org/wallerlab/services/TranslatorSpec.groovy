package org.wallerlab.services

import org.wallerlab.pdbml.v40.generated.AtomSiteType
import org.wallerlab.pdbml.v40.generated.DatablockType
import org.wallerlab.service.Translator
import spock.lang.Specification

import javax.xml.bind.JAXBElement


class TranslatorSpec extends Specification{

    def " test translator"(){

        when:
        def atom = Mock(AtomSiteType.AtomSite)

        def x = Mock(JAXBElement)
        def y = Mock(JAXBElement)
        def z = Mock(JAXBElement)

        atom.getCartnX() >> x
        atom.getCartnY() >> y
        atom.getCartnZ() >> z

        def cartx = Mock(AtomSiteType.AtomSite.CartnX)
        def carty = Mock(AtomSiteType.AtomSite.CartnY)
        def cartz = Mock(AtomSiteType.AtomSite.CartnZ)

        x.getValue() >> cartx
        y.getValue() >> carty
        z.getValue() >> cartz

        cartx.getValue() >> new BigDecimal(0);
        carty.getValue() >> new BigDecimal(0);
        cartz.getValue() >> new BigDecimal(0);

        atom.getLabelCompId() >> "test"

        def pdb = Mock(JAXBElement)
        atom.getGroupPDB() >> pdb
        pdb.getValue() >> "test"

        def datablock = Mock(DatablockType)
        datablock.getDatablockName() >> "name"
        def asc = Mock(AtomSiteType)
        datablock.getAtomSiteCategory() >> asc

        def atomSites = [atom,atom]
        asc.getAtomSite() >> atomSites
        asc.getAtomSite().get(0) >> atom
        asc.getAtomSite().get(1) >> atom


        def item = Mock(JAXBElement)
        item.getValue() >> datablock


        Translator translator = new Translator()


        then:
        translator.translate(item)
    }

}
