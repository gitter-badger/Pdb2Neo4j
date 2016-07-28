package org.wallerlab.service;

import org.wallerlab.domain.*;
import org.wallerlab.pdbml.v40.generated.AtomSiteType;
import org.wallerlab.pdbml.v40.generated.DatablockType;

import javax.xml.bind.JAXBElement;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;
import static java.util.stream.Collectors.toSet;

@Service
public class Translator {

    public MolecularSystem translate(JAXBElement<DatablockType> item) {
        Set<Molecule> molecules = translateToMolecule(item);
        return new MolecularSystem(item.getValue().getDatablockName(), molecules);
    }

    public Set<Molecule> translateToMolecule(JAXBElement<DatablockType> item) {
        Integer solventCounter = 0;
        Integer singleAtomCounter = 0;
        Set<Atom> atoms = translateToAtom(item);
        Set<Molecule> molecules = new HashSet<>();
        Molecule molecule = new Molecule("test", atoms);
        molecules.add(molecule);
        return molecules;
    }

    public Set<Atom> translateToAtom(JAXBElement<DatablockType> item) {
        return IntStream.range(0, item.getValue().getAtomSiteCategory().getAtomSite().size())
                .mapToObj(i -> {
                    AtomSiteType.AtomSite atom = item.getValue().getAtomSiteCategory().getAtomSite().get(i);
                    Double x = atom.getCartnX().getValue().getValue().doubleValue();
                    Double y = atom.getCartnY().getValue().getValue().doubleValue();
                    Double z = atom.getCartnZ().getValue().getValue().doubleValue();
                    return new Atom(atom.getTypeSymbol(), x, y, z, atom.getLabelCompId(), atom.getGroupPDB().getValue().toString(), atom.getTypeSymbol());
                })
                .collect(toSet());
    }
}