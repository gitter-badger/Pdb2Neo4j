//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the ATOM_SITES_ALT_ENS category record details
 * about the ensemble structure generated from atoms with various
 * alternative conformation IDs.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:atom_sites_alt_ensCategory>
 *    <PDBx:atom_sites_alt_ens id="Ensemble 1-A">
 *       <PDBx:details> The inhibitor binds to the enzyme in two, roughly twofold
 * symmetric alternative conformations.
 * This conformational ensemble includes the more populated
 * conformation of the inhibitor (ID=1) and the amino-acid
 * side chains and solvent structure that correlate with this
 * inhibitor conformation.
 * Also included are one set (ID=3) of side chains with
 * alternative conformations when the conformations are not
 * correlated with the inhibitor conformation.</PDBx:details>
 *    </PDBx:atom_sites_alt_ens>
 *    <PDBx:atom_sites_alt_ens id="Ensemble 1-B">
 *       <PDBx:details> The inhibitor binds to the enzyme in two, roughly twofold
 * symmetric alternative conformations.
 * This conformational ensemble includes the more populated
 * conformation of the inhibitor (ID=1) and the amino-acid
 * side chains and solvent structure that correlate with
 * this inhibitor conformation.
 * Also included are one set (ID=4) of side chains with
 * alternative conformations when the conformations are not
 * correlated with the inhibitor conformation.</PDBx:details>
 *    </PDBx:atom_sites_alt_ens>
 *    <PDBx:atom_sites_alt_ens id="Ensemble 2-A">
 *       <PDBx:details> The inhibitor binds to the enzyme in two, roughly twofold
 * symmetric alternative conformations.
 * This conformational ensemble includes the less populated
 * conformation of the inhibitor (ID=2) and the amino-acid
 * side chains and solvent structure that correlate with this
 * inhibitor conformation.
 * Also included are one set (ID=3) of side chains with
 * alternative conformations when the conformations are not
 * correlated with the inhibitor conformation.</PDBx:details>
 *    </PDBx:atom_sites_alt_ens>
 *    <PDBx:atom_sites_alt_ens id="Ensemble 2-B">
 *       <PDBx:details> The inhibitor binds to the enzyme in two, roughly twofold
 * symmetric alternative conformations.
 * This conformational ensemble includes the less populated
 * conformation of the inhibitor (ID=2) and the amino-acid
 * side chains and solvent structure that correlate with this
 * inhibitor conformation.
 * Also included are one set (ID=4) of side chains with
 * alternative conformations when the conformations are not
 * correlated with the inhibitor conformation.</PDBx:details>
 *    </PDBx:atom_sites_alt_ens>
 * </PDBx:atom_sites_alt_ensCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for atom_sites_alt_ensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atom_sites_alt_ensType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atom_sites_alt_ens" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atom_sites_alt_ensType", propOrder = {
    "atomSitesAltEns"
})
public class AtomSitesAltEnsType {

    @XmlElement(name = "atom_sites_alt_ens")
    protected List<AtomSitesAltEnsType.AtomSitesAltEns> atomSitesAltEns;

    /**
     * Gets the value of the atomSitesAltEns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomSitesAltEns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomSitesAltEns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomSitesAltEnsType.AtomSitesAltEns }
     * 
     * 
     */
    public List<AtomSitesAltEnsType.AtomSitesAltEns> getAtomSitesAltEns() {
        if (atomSitesAltEns == null) {
            atomSitesAltEns = new ArrayList<AtomSitesAltEnsType.AtomSitesAltEns>();
        }
        return this.atomSitesAltEns;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AtomSitesAltEns {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDetails(JAXBElement<String> value) {
            this.details = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
