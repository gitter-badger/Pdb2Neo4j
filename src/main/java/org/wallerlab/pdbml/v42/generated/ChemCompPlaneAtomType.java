//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * Data items in the CHEM_COMP_PLANE_ATOM category enumerate the
 * atoms in a plane within a chemical component.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:chem_comp_plane_atomCategory>
 *    <PDBx:chem_comp_plane_atom atom_id="CB" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 *    <PDBx:chem_comp_plane_atom atom_id="CG" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 *    <PDBx:chem_comp_plane_atom atom_id="CD1" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 *    <PDBx:chem_comp_plane_atom atom_id="CE1" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 *    <PDBx:chem_comp_plane_atom atom_id="CZ" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 *    <PDBx:chem_comp_plane_atom atom_id="CE2" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 *    <PDBx:chem_comp_plane_atom atom_id="CD2" comp_id="phe" plane_id="phe1"></PDBx:chem_comp_plane_atom>
 * </PDBx:chem_comp_plane_atomCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for chem_comp_plane_atomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chem_comp_plane_atomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chem_comp_plane_atom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="dist_esd" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="plane_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "chem_comp_plane_atomType", propOrder = {
    "chemCompPlaneAtom"
})
public class ChemCompPlaneAtomType {

    @XmlElement(name = "chem_comp_plane_atom")
    protected List<ChemCompPlaneAtomType.ChemCompPlaneAtom> chemCompPlaneAtom;

    /**
     * Gets the value of the chemCompPlaneAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemCompPlaneAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemCompPlaneAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChemCompPlaneAtomType.ChemCompPlaneAtom }
     * 
     * 
     */
    public List<ChemCompPlaneAtomType.ChemCompPlaneAtom> getChemCompPlaneAtom() {
        if (chemCompPlaneAtom == null) {
            chemCompPlaneAtom = new ArrayList<ChemCompPlaneAtomType.ChemCompPlaneAtom>();
        }
        return this.chemCompPlaneAtom;
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
     *         &lt;element name="dist_esd" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="atom_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="plane_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ChemCompPlaneAtom {

        @XmlElementRef(name = "dist_esd", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ChemCompPlaneAtomType.ChemCompPlaneAtom.DistEsd> distEsd;
        @XmlAttribute(name = "atom_id", required = true)
        protected String atomId;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "plane_id", required = true)
        protected String planeId;

        /**
         * Gets the value of the distEsd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ChemCompPlaneAtomType.ChemCompPlaneAtom.DistEsd }{@code >}
         *     
         */
        public JAXBElement<ChemCompPlaneAtomType.ChemCompPlaneAtom.DistEsd> getDistEsd() {
            return distEsd;
        }

        /**
         * Sets the value of the distEsd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ChemCompPlaneAtomType.ChemCompPlaneAtom.DistEsd }{@code >}
         *     
         */
        public void setDistEsd(JAXBElement<ChemCompPlaneAtomType.ChemCompPlaneAtom.DistEsd> value) {
            this.distEsd = value;
        }

        /**
         * Gets the value of the atomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId() {
            return atomId;
        }

        /**
         * Sets the value of the atomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId(String value) {
            this.atomId = value;
        }

        /**
         * Gets the value of the compId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId() {
            return compId;
        }

        /**
         * Sets the value of the compId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId(String value) {
            this.compId = value;
        }

        /**
         * Gets the value of the planeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaneId() {
            return planeId;
        }

        /**
         * Sets the value of the planeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaneId(String value) {
            this.planeId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DistEsd {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "units")
            protected String units;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                if (units == null) {
                    return "angstroms";
                } else {
                    return units;
                }
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

        }

    }

}
