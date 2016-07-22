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
 * 
 * Items in the pdbx_nmr_constraint_file category record the name of the constraint file, the software used 
 * to calculate conformers with the constraint file, and the characteristics of the constraints in the constraint file.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_constraint_fileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_constraint_fileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_constraint_file" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="constraint_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="software_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="software_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="constraint_filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="constraint_subtype" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Not applicable"/>
 *                       &lt;enumeration value="NOE"/>
 *                       &lt;enumeration value="NOE buildup"/>
 *                       &lt;enumeration value="NOE not seen"/>
 *                       &lt;enumeration value="general distance"/>
 *                       &lt;enumeration value="alignment tensor"/>
 *                       &lt;enumeration value="chirality"/>
 *                       &lt;enumeration value="prochirality"/>
 *                       &lt;enumeration value="disulfide bond"/>
 *                       &lt;enumeration value="hydrogen bond"/>
 *                       &lt;enumeration value="symmetry"/>
 *                       &lt;enumeration value="ROE"/>
 *                       &lt;enumeration value="peptide"/>
 *                       &lt;enumeration value="ring"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="constraint_type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="distance"/>
 *                       &lt;enumeration value="dipolar coupling"/>
 *                       &lt;enumeration value="protein dihedral angle"/>
 *                       &lt;enumeration value="nucleic acid dihedral angle"/>
 *                       &lt;enumeration value="coupling constant"/>
 *                       &lt;enumeration value="chemical shift"/>
 *                       &lt;enumeration value="other angle"/>
 *                       &lt;enumeration value="chemical shift anisotropy"/>
 *                       &lt;enumeration value="hydrogen exchange"/>
 *                       &lt;enumeration value="line broadening"/>
 *                       &lt;enumeration value="pseudocontact shift"/>
 *                       &lt;enumeration value="intervector projection angle"/>
 *                       &lt;enumeration value="protein peptide planarity"/>
 *                       &lt;enumeration value="protein other kinds of constraints"/>
 *                       &lt;enumeration value="nucleic acid base planarity"/>
 *                       &lt;enumeration value="nucleic acid other kinds of constraints"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_constraint_fileType", propOrder = {
    "pdbxNmrConstraintFile"
})
public class PdbxNmrConstraintFileType {

    @XmlElement(name = "pdbx_nmr_constraint_file")
    protected List<PdbxNmrConstraintFileType.PdbxNmrConstraintFile> pdbxNmrConstraintFile;

    /**
     * Gets the value of the pdbxNmrConstraintFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrConstraintFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrConstraintFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrConstraintFileType.PdbxNmrConstraintFile }
     * 
     * 
     */
    public List<PdbxNmrConstraintFileType.PdbxNmrConstraintFile> getPdbxNmrConstraintFile() {
        if (pdbxNmrConstraintFile == null) {
            pdbxNmrConstraintFile = new ArrayList<PdbxNmrConstraintFileType.PdbxNmrConstraintFile>();
        }
        return this.pdbxNmrConstraintFile;
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
     *         &lt;element name="constraint_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="software_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="software_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="constraint_filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="constraint_subtype" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Not applicable"/>
     *             &lt;enumeration value="NOE"/>
     *             &lt;enumeration value="NOE buildup"/>
     *             &lt;enumeration value="NOE not seen"/>
     *             &lt;enumeration value="general distance"/>
     *             &lt;enumeration value="alignment tensor"/>
     *             &lt;enumeration value="chirality"/>
     *             &lt;enumeration value="prochirality"/>
     *             &lt;enumeration value="disulfide bond"/>
     *             &lt;enumeration value="hydrogen bond"/>
     *             &lt;enumeration value="symmetry"/>
     *             &lt;enumeration value="ROE"/>
     *             &lt;enumeration value="peptide"/>
     *             &lt;enumeration value="ring"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="constraint_type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="distance"/>
     *             &lt;enumeration value="dipolar coupling"/>
     *             &lt;enumeration value="protein dihedral angle"/>
     *             &lt;enumeration value="nucleic acid dihedral angle"/>
     *             &lt;enumeration value="coupling constant"/>
     *             &lt;enumeration value="chemical shift"/>
     *             &lt;enumeration value="other angle"/>
     *             &lt;enumeration value="chemical shift anisotropy"/>
     *             &lt;enumeration value="hydrogen exchange"/>
     *             &lt;enumeration value="line broadening"/>
     *             &lt;enumeration value="pseudocontact shift"/>
     *             &lt;enumeration value="intervector projection angle"/>
     *             &lt;enumeration value="protein peptide planarity"/>
     *             &lt;enumeration value="protein other kinds of constraints"/>
     *             &lt;enumeration value="nucleic acid base planarity"/>
     *             &lt;enumeration value="nucleic acid other kinds of constraints"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrConstraintFile {

        @XmlElementRef(name = "constraint_number", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> constraintNumber;
        @XmlElementRef(name = "id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> id;
        @XmlElementRef(name = "software_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> softwareName;
        @XmlElementRef(name = "software_ordinal", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> softwareOrdinal;
        @XmlAttribute(name = "constraint_filename", required = true)
        protected String constraintFilename;
        @XmlAttribute(name = "constraint_subtype", required = true)
        protected String constraintSubtype;
        @XmlAttribute(name = "constraint_type", required = true)
        protected String constraintType;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the constraintNumber property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getConstraintNumber() {
            return constraintNumber;
        }

        /**
         * Sets the value of the constraintNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setConstraintNumber(JAXBElement<BigInteger> value) {
            this.constraintNumber = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setId(JAXBElement<BigInteger> value) {
            this.id = value;
        }

        /**
         * Gets the value of the softwareName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSoftwareName() {
            return softwareName;
        }

        /**
         * Sets the value of the softwareName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSoftwareName(JAXBElement<String> value) {
            this.softwareName = value;
        }

        /**
         * Gets the value of the softwareOrdinal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getSoftwareOrdinal() {
            return softwareOrdinal;
        }

        /**
         * Sets the value of the softwareOrdinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setSoftwareOrdinal(JAXBElement<BigInteger> value) {
            this.softwareOrdinal = value;
        }

        /**
         * Gets the value of the constraintFilename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConstraintFilename() {
            return constraintFilename;
        }

        /**
         * Sets the value of the constraintFilename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConstraintFilename(String value) {
            this.constraintFilename = value;
        }

        /**
         * Gets the value of the constraintSubtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConstraintSubtype() {
            return constraintSubtype;
        }

        /**
         * Sets the value of the constraintSubtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConstraintSubtype(String value) {
            this.constraintSubtype = value;
        }

        /**
         * Gets the value of the constraintType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConstraintType() {
            return constraintType;
        }

        /**
         * Sets the value of the constraintType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConstraintType(String value) {
            this.constraintType = value;
        }

        /**
         * Gets the value of the entryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryId() {
            return entryId;
        }

        /**
         * Sets the value of the entryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryId(String value) {
            this.entryId = value;
        }

    }

}
