//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * Data items in the PDBX_VALIDATE_POLYMER_LINKAGE category list the
 * polymer linkages within the entry that are outside of typlical 
 * covalent distances.
 * 
 * 
 *     Example 1 
 * <PDBx:pdbx_validate_polymer_linkageCategory>
 *    <PDBx:pdbx_validate_polymer_linkage id="1">
 *       <PDBx:PDB_ins_code_1 xsi:nil="true" />
 *       <PDBx:PDB_ins_code_2 xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id_1>B</PDBx:auth_asym_id_1>
 *       <PDBx:auth_asym_id_2>B</PDBx:auth_asym_id_2>
 *       <PDBx:auth_atom_id_1 xsi:nil="true" />
 *       <PDBx:auth_atom_id_2 xsi:nil="true" />
 *       <PDBx:auth_comp_id_1>VAL</PDBx:auth_comp_id_1>
 *       <PDBx:auth_comp_id_2>ARG</PDBx:auth_comp_id_2>
 *       <PDBx:auth_seq_id_1>107</PDBx:auth_seq_id_1>
 *       <PDBx:auth_seq_id_2>108</PDBx:auth_seq_id_2>
 *       <PDBx:dist>3.16</PDBx:dist>
 *       <PDBx:label_alt_id_1 xsi:nil="true" />
 *       <PDBx:label_alt_id_2 xsi:nil="true" />
 *    </PDBx:pdbx_validate_polymer_linkage>
 *    <PDBx:pdbx_validate_polymer_linkage id="2">
 *       <PDBx:PDB_ins_code_1 xsi:nil="true" />
 *       <PDBx:PDB_ins_code_2 xsi:nil="true" />
 *       <PDBx:PDB_model_num>1</PDBx:PDB_model_num>
 *       <PDBx:auth_asym_id_1>B</PDBx:auth_asym_id_1>
 *       <PDBx:auth_asym_id_2>B</PDBx:auth_asym_id_2>
 *       <PDBx:auth_atom_id_1 xsi:nil="true" />
 *       <PDBx:auth_atom_id_2 xsi:nil="true" />
 *       <PDBx:auth_comp_id_1>ARG</PDBx:auth_comp_id_1>
 *       <PDBx:auth_comp_id_2>LYS</PDBx:auth_comp_id_2>
 *       <PDBx:auth_seq_id_1>110</PDBx:auth_seq_id_1>
 *       <PDBx:auth_seq_id_2>110</PDBx:auth_seq_id_2>
 *       <PDBx:dist>2.95</PDBx:dist>
 *       <PDBx:label_alt_id_1 xsi:nil="true" />
 *       <PDBx:label_alt_id_2 xsi:nil="true" />
 *    </PDBx:pdbx_validate_polymer_linkage>
 * </PDBx:pdbx_validate_polymer_linkageCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_validate_polymer_linkageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_validate_polymer_linkageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_validate_polymer_linkage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PDB_ins_code_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_ins_code_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="auth_asym_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_asym_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_atom_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_atom_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_comp_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_comp_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auth_seq_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dist">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="label_alt_id_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label_alt_id_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_validate_polymer_linkageType", propOrder = {
    "pdbxValidatePolymerLinkage"
})
public class PdbxValidatePolymerLinkageType {

    @XmlElement(name = "pdbx_validate_polymer_linkage")
    protected List<PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage> pdbxValidatePolymerLinkage;

    /**
     * Gets the value of the pdbxValidatePolymerLinkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxValidatePolymerLinkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxValidatePolymerLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage }
     * 
     * 
     */
    public List<PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage> getPdbxValidatePolymerLinkage() {
        if (pdbxValidatePolymerLinkage == null) {
            pdbxValidatePolymerLinkage = new ArrayList<PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage>();
        }
        return this.pdbxValidatePolymerLinkage;
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
     *         &lt;element name="PDB_ins_code_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PDB_ins_code_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PDB_model_num" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="auth_asym_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_asym_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_atom_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_atom_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_comp_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_comp_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auth_seq_id_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dist">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="label_alt_id_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label_alt_id_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxValidatePolymerLinkage {

        @XmlElementRef(name = "PDB_ins_code_1", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode1;
        @XmlElementRef(name = "PDB_ins_code_2", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbInsCode2;
        @XmlElement(name = "PDB_model_num", required = true)
        protected BigInteger pdbModelNum;
        @XmlElement(name = "auth_asym_id_1", required = true)
        protected String authAsymId1;
        @XmlElement(name = "auth_asym_id_2", required = true)
        protected String authAsymId2;
        @XmlElement(name = "auth_atom_id_1", required = true)
        protected String authAtomId1;
        @XmlElement(name = "auth_atom_id_2", required = true)
        protected String authAtomId2;
        @XmlElement(name = "auth_comp_id_1", required = true)
        protected String authCompId1;
        @XmlElement(name = "auth_comp_id_2", required = true)
        protected String authCompId2;
        @XmlElement(name = "auth_seq_id_1", required = true)
        protected String authSeqId1;
        @XmlElement(name = "auth_seq_id_2", required = true)
        protected String authSeqId2;
        @XmlElement(required = true)
        protected PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage.Dist dist;
        @XmlElementRef(name = "label_alt_id_1", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId1;
        @XmlElementRef(name = "label_alt_id_2", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> labelAltId2;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the pdbInsCode1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPDBInsCode1() {
            return pdbInsCode1;
        }

        /**
         * Sets the value of the pdbInsCode1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPDBInsCode1(JAXBElement<String> value) {
            this.pdbInsCode1 = value;
        }

        /**
         * Gets the value of the pdbInsCode2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPDBInsCode2() {
            return pdbInsCode2;
        }

        /**
         * Sets the value of the pdbInsCode2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPDBInsCode2(JAXBElement<String> value) {
            this.pdbInsCode2 = value;
        }

        /**
         * Gets the value of the pdbModelNum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPDBModelNum() {
            return pdbModelNum;
        }

        /**
         * Sets the value of the pdbModelNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPDBModelNum(BigInteger value) {
            this.pdbModelNum = value;
        }

        /**
         * Gets the value of the authAsymId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAsymId1() {
            return authAsymId1;
        }

        /**
         * Sets the value of the authAsymId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAsymId1(String value) {
            this.authAsymId1 = value;
        }

        /**
         * Gets the value of the authAsymId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAsymId2() {
            return authAsymId2;
        }

        /**
         * Sets the value of the authAsymId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAsymId2(String value) {
            this.authAsymId2 = value;
        }

        /**
         * Gets the value of the authAtomId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAtomId1() {
            return authAtomId1;
        }

        /**
         * Sets the value of the authAtomId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAtomId1(String value) {
            this.authAtomId1 = value;
        }

        /**
         * Gets the value of the authAtomId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthAtomId2() {
            return authAtomId2;
        }

        /**
         * Sets the value of the authAtomId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthAtomId2(String value) {
            this.authAtomId2 = value;
        }

        /**
         * Gets the value of the authCompId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthCompId1() {
            return authCompId1;
        }

        /**
         * Sets the value of the authCompId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthCompId1(String value) {
            this.authCompId1 = value;
        }

        /**
         * Gets the value of the authCompId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthCompId2() {
            return authCompId2;
        }

        /**
         * Sets the value of the authCompId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthCompId2(String value) {
            this.authCompId2 = value;
        }

        /**
         * Gets the value of the authSeqId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthSeqId1() {
            return authSeqId1;
        }

        /**
         * Sets the value of the authSeqId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthSeqId1(String value) {
            this.authSeqId1 = value;
        }

        /**
         * Gets the value of the authSeqId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthSeqId2() {
            return authSeqId2;
        }

        /**
         * Sets the value of the authSeqId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthSeqId2(String value) {
            this.authSeqId2 = value;
        }

        /**
         * Gets the value of the dist property.
         * 
         * @return
         *     possible object is
         *     {@link PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage.Dist }
         *     
         */
        public PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage.Dist getDist() {
            return dist;
        }

        /**
         * Sets the value of the dist property.
         * 
         * @param value
         *     allowed object is
         *     {@link PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage.Dist }
         *     
         */
        public void setDist(PdbxValidatePolymerLinkageType.PdbxValidatePolymerLinkage.Dist value) {
            this.dist = value;
        }

        /**
         * Gets the value of the labelAltId1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAltId1() {
            return labelAltId1;
        }

        /**
         * Sets the value of the labelAltId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAltId1(JAXBElement<String> value) {
            this.labelAltId1 = value;
        }

        /**
         * Gets the value of the labelAltId2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabelAltId2() {
            return labelAltId2;
        }

        /**
         * Sets the value of the labelAltId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabelAltId2(JAXBElement<String> value) {
            this.labelAltId2 = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
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
        public static class Dist {

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
