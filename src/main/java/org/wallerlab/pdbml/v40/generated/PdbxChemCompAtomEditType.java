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
 * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
 * atom level editing instructions to be applied to imported
 * chemical components. 
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_atom_editCategory>
 *    <PDBx:pdbx_chem_comp_atom_edit ordinal="1">
 *       <PDBx:atom_id>HN2</PDBx:atom_id>
 *       <PDBx:comp_id>LYS</PDBx:comp_id>
 *       <PDBx:edit_op>DELETE</PDBx:edit_op>
 *    </PDBx:pdbx_chem_comp_atom_edit>
 * </PDBx:pdbx_chem_comp_atom_editCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_atom_editType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_atom_editType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_atom_edit" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="edit_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="edit_atom_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="edit_op">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="RENAME"/>
 *                         &lt;enumeration value="DELETE"/>
 *                         &lt;enumeration value="ADD"/>
 *                         &lt;enumeration value="CHARGE"/>
 *                         &lt;enumeration value="PARTIAL_CHARGE"/>
 *                         &lt;enumeration value="MODEL_CARTN_X"/>
 *                         &lt;enumeration value="MODEL_CARTN_Y"/>
 *                         &lt;enumeration value="MODEL_CARTN_Z"/>
 *                         &lt;enumeration value="STEREO_CONFIG"/>
 *                         &lt;enumeration value="AROMATIC_FLAG"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_chem_comp_atom_editType", propOrder = {
    "pdbxChemCompAtomEdit"
})
public class PdbxChemCompAtomEditType {

    @XmlElement(name = "pdbx_chem_comp_atom_edit")
    protected List<PdbxChemCompAtomEditType.PdbxChemCompAtomEdit> pdbxChemCompAtomEdit;

    /**
     * Gets the value of the pdbxChemCompAtomEdit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompAtomEdit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompAtomEdit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompAtomEditType.PdbxChemCompAtomEdit }
     * 
     * 
     */
    public List<PdbxChemCompAtomEditType.PdbxChemCompAtomEdit> getPdbxChemCompAtomEdit() {
        if (pdbxChemCompAtomEdit == null) {
            pdbxChemCompAtomEdit = new ArrayList<PdbxChemCompAtomEditType.PdbxChemCompAtomEdit>();
        }
        return this.pdbxChemCompAtomEdit;
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
     *         &lt;element name="atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="edit_atom_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="edit_atom_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="edit_op">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="RENAME"/>
     *               &lt;enumeration value="DELETE"/>
     *               &lt;enumeration value="ADD"/>
     *               &lt;enumeration value="CHARGE"/>
     *               &lt;enumeration value="PARTIAL_CHARGE"/>
     *               &lt;enumeration value="MODEL_CARTN_X"/>
     *               &lt;enumeration value="MODEL_CARTN_Y"/>
     *               &lt;enumeration value="MODEL_CARTN_Z"/>
     *               &lt;enumeration value="STEREO_CONFIG"/>
     *               &lt;enumeration value="AROMATIC_FLAG"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxChemCompAtomEdit {

        @XmlElement(name = "atom_id", required = true)
        protected String atomId;
        @XmlElement(name = "comp_id", required = true)
        protected String compId;
        @XmlElement(name = "edit_atom_id", required = true)
        protected String editAtomId;
        @XmlElementRef(name = "edit_atom_value", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> editAtomValue;
        @XmlElement(name = "edit_op", required = true)
        protected String editOp;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

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
         * Gets the value of the editAtomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditAtomId() {
            return editAtomId;
        }

        /**
         * Sets the value of the editAtomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditAtomId(String value) {
            this.editAtomId = value;
        }

        /**
         * Gets the value of the editAtomValue property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEditAtomValue() {
            return editAtomValue;
        }

        /**
         * Sets the value of the editAtomValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEditAtomValue(JAXBElement<String> value) {
            this.editAtomValue = value;
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

    }

}
