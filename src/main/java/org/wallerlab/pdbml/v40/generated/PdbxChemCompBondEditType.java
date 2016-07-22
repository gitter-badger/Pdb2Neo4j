//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.pdbml.v40.generated;

import java.math.BigInteger;
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
 * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
 * bond level editing instructions to be applied to imported
 * chemical components. 
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_bond_editCategory>
 *    <PDBx:pdbx_chem_comp_bond_edit atom_id_1="OXT" atom_id_2="HXT" comp_id="LYS" edit_op="DELETE">
 *       <PDBx:ordinal>1</PDBx:ordinal>
 *    </PDBx:pdbx_chem_comp_bond_edit>
 * </PDBx:pdbx_chem_comp_bond_editCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_bond_editType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_bond_editType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_bond_edit" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="edit_bond_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="edit_op" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="DELETE"/>
 *                       &lt;enumeration value="ADD"/>
 *                       &lt;enumeration value="VALUE_ORDER"/>
 *                       &lt;enumeration value="VALUE_DIST"/>
 *                       &lt;enumeration value="STEREO_CONFIG"/>
 *                       &lt;enumeration value="AROMATIC_FLAG"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "pdbx_chem_comp_bond_editType", propOrder = {
    "pdbxChemCompBondEdit"
})
public class PdbxChemCompBondEditType {

    @XmlElement(name = "pdbx_chem_comp_bond_edit")
    protected List<PdbxChemCompBondEditType.PdbxChemCompBondEdit> pdbxChemCompBondEdit;

    /**
     * Gets the value of the pdbxChemCompBondEdit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompBondEdit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompBondEdit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompBondEditType.PdbxChemCompBondEdit }
     * 
     * 
     */
    public List<PdbxChemCompBondEditType.PdbxChemCompBondEdit> getPdbxChemCompBondEdit() {
        if (pdbxChemCompBondEdit == null) {
            pdbxChemCompBondEdit = new ArrayList<PdbxChemCompBondEditType.PdbxChemCompBondEdit>();
        }
        return this.pdbxChemCompBondEdit;
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
     *         &lt;element name="edit_bond_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
     *       &lt;attribute name="atom_id_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_id_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="edit_op" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="DELETE"/>
     *             &lt;enumeration value="ADD"/>
     *             &lt;enumeration value="VALUE_ORDER"/>
     *             &lt;enumeration value="VALUE_DIST"/>
     *             &lt;enumeration value="STEREO_CONFIG"/>
     *             &lt;enumeration value="AROMATIC_FLAG"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class PdbxChemCompBondEdit {

        @XmlElementRef(name = "edit_bond_value", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> editBondValue;
        @XmlElement(required = true)
        protected BigInteger ordinal;
        @XmlAttribute(name = "atom_id_1", required = true)
        protected String atomId1;
        @XmlAttribute(name = "atom_id_2", required = true)
        protected String atomId2;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "edit_op", required = true)
        protected String editOp;

        /**
         * Gets the value of the editBondValue property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEditBondValue() {
            return editBondValue;
        }

        /**
         * Sets the value of the editBondValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEditBondValue(JAXBElement<String> value) {
            this.editBondValue = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdinal(BigInteger value) {
            this.ordinal = value;
        }

        /**
         * Gets the value of the atomId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId1() {
            return atomId1;
        }

        /**
         * Sets the value of the atomId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId1(String value) {
            this.atomId1 = value;
        }

        /**
         * Gets the value of the atomId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtomId2() {
            return atomId2;
        }

        /**
         * Sets the value of the atomId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtomId2(String value) {
            this.atomId2 = value;
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
         * Gets the value of the editOp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditOp() {
            return editOp;
        }

        /**
         * Sets the value of the editOp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditOp(String value) {
            this.editOp = value;
        }

    }

}
