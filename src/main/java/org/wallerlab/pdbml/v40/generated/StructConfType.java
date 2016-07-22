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
 * Data items in the STRUCT_CONF category record details about
 * the backbone conformation of a segment of polymer.
 * 
 * Data items in the STRUCT_CONF_TYPE category define the
 * criteria used to identify the backbone conformations.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_confCategory>
 *    <PDBx:struct_conf id="HELX1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ARG</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>87</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>HELX_RH_AL_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>GLN</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>92</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="HELX2">
 *       <PDBx:beg_label_asym_id>B</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ARG</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>287</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>HELX_RH_AL_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>B</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>GLN</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>292</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="STRN1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>PRO</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>1</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>STRN_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>LEU</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>5</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="STRN2">
 *       <PDBx:beg_label_asym_id>B</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>CYS</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>295</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>STRN_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>B</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>PHE</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>299</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="STRN3">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>CYS</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>95</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>STRN_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>PHE</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>299</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="STRN4">
 *       <PDBx:beg_label_asym_id>B</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>PRO</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>201</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>STRN_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>B</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>LEU</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>205</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="TURN1">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ILE</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>15</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>TURN_TY1P_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>GLN</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>18</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="TURN2">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>GLY</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>49</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>TURN_TY2_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>GLY</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>52</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="TURN3">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>ILE</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>55</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>TURN_TY1P_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>HIS</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>69</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 *    <PDBx:struct_conf id="TURN4">
 *       <PDBx:beg_label_asym_id>A</PDBx:beg_label_asym_id>
 *       <PDBx:beg_label_comp_id>THR</PDBx:beg_label_comp_id>
 *       <PDBx:beg_label_seq_id>91</PDBx:beg_label_seq_id>
 *       <PDBx:conf_type_id>TURN_TY1_P</PDBx:conf_type_id>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:end_label_asym_id>A</PDBx:end_label_asym_id>
 *       <PDBx:end_label_comp_id>GLY</PDBx:end_label_comp_id>
 *       <PDBx:end_label_seq_id>94</PDBx:end_label_seq_id>
 *    </PDBx:struct_conf>
 * </PDBx:struct_confCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_confType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_confType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_conf" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beg_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="beg_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="conf_type_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="end_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="pdbx_PDB_helix_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_PDB_helix_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_PDB_helix_length" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="pdbx_beg_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_end_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "struct_confType", propOrder = {
    "structConf"
})
public class StructConfType {

    @XmlElement(name = "struct_conf")
    protected List<StructConfType.StructConf> structConf;

    /**
     * Gets the value of the structConf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structConf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructConfType.StructConf }
     * 
     * 
     */
    public List<StructConfType.StructConf> getStructConf() {
        if (structConf == null) {
            structConf = new ArrayList<StructConfType.StructConf>();
        }
        return this.structConf;
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
     *         &lt;element name="beg_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beg_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="beg_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="conf_type_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_asym_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_auth_seq_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_label_asym_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_label_comp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="end_label_seq_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="pdbx_PDB_helix_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_PDB_helix_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_PDB_helix_length" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="pdbx_beg_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_end_PDB_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class StructConf {

        @XmlElementRef(name = "beg_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthAsymId;
        @XmlElementRef(name = "beg_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthCompId;
        @XmlElementRef(name = "beg_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> begAuthSeqId;
        @XmlElement(name = "beg_label_asym_id", required = true)
        protected String begLabelAsymId;
        @XmlElement(name = "beg_label_comp_id", required = true)
        protected String begLabelCompId;
        @XmlElement(name = "beg_label_seq_id", required = true)
        protected BigInteger begLabelSeqId;
        @XmlElement(name = "conf_type_id", required = true)
        protected String confTypeId;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "end_auth_asym_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthAsymId;
        @XmlElementRef(name = "end_auth_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthCompId;
        @XmlElementRef(name = "end_auth_seq_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> endAuthSeqId;
        @XmlElement(name = "end_label_asym_id", required = true)
        protected String endLabelAsymId;
        @XmlElement(name = "end_label_comp_id", required = true)
        protected String endLabelCompId;
        @XmlElement(name = "end_label_seq_id", required = true)
        protected BigInteger endLabelSeqId;
        @XmlElementRef(name = "pdbx_PDB_helix_class", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPDBHelixClass;
        @XmlElementRef(name = "pdbx_PDB_helix_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPDBHelixId;
        @XmlElementRef(name = "pdbx_PDB_helix_length", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxPDBHelixLength;
        @XmlElementRef(name = "pdbx_beg_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxBegPDBInsCode;
        @XmlElementRef(name = "pdbx_end_PDB_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxEndPDBInsCode;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the begAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthAsymId() {
            return begAuthAsymId;
        }

        /**
         * Sets the value of the begAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthAsymId(JAXBElement<String> value) {
            this.begAuthAsymId = value;
        }

        /**
         * Gets the value of the begAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthCompId() {
            return begAuthCompId;
        }

        /**
         * Sets the value of the begAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthCompId(JAXBElement<String> value) {
            this.begAuthCompId = value;
        }

        /**
         * Gets the value of the begAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBegAuthSeqId() {
            return begAuthSeqId;
        }

        /**
         * Sets the value of the begAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBegAuthSeqId(JAXBElement<String> value) {
            this.begAuthSeqId = value;
        }

        /**
         * Gets the value of the begLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelAsymId() {
            return begLabelAsymId;
        }

        /**
         * Sets the value of the begLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelAsymId(String value) {
            this.begLabelAsymId = value;
        }

        /**
         * Gets the value of the begLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegLabelCompId() {
            return begLabelCompId;
        }

        /**
         * Sets the value of the begLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegLabelCompId(String value) {
            this.begLabelCompId = value;
        }

        /**
         * Gets the value of the begLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBegLabelSeqId() {
            return begLabelSeqId;
        }

        /**
         * Sets the value of the begLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBegLabelSeqId(BigInteger value) {
            this.begLabelSeqId = value;
        }

        /**
         * Gets the value of the confTypeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfTypeId() {
            return confTypeId;
        }

        /**
         * Sets the value of the confTypeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfTypeId(String value) {
            this.confTypeId = value;
        }

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
         * Gets the value of the endAuthAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthAsymId() {
            return endAuthAsymId;
        }

        /**
         * Sets the value of the endAuthAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthAsymId(JAXBElement<String> value) {
            this.endAuthAsymId = value;
        }

        /**
         * Gets the value of the endAuthCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthCompId() {
            return endAuthCompId;
        }

        /**
         * Sets the value of the endAuthCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthCompId(JAXBElement<String> value) {
            this.endAuthCompId = value;
        }

        /**
         * Gets the value of the endAuthSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEndAuthSeqId() {
            return endAuthSeqId;
        }

        /**
         * Sets the value of the endAuthSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEndAuthSeqId(JAXBElement<String> value) {
            this.endAuthSeqId = value;
        }

        /**
         * Gets the value of the endLabelAsymId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelAsymId() {
            return endLabelAsymId;
        }

        /**
         * Sets the value of the endLabelAsymId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelAsymId(String value) {
            this.endLabelAsymId = value;
        }

        /**
         * Gets the value of the endLabelCompId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndLabelCompId() {
            return endLabelCompId;
        }

        /**
         * Sets the value of the endLabelCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndLabelCompId(String value) {
            this.endLabelCompId = value;
        }

        /**
         * Gets the value of the endLabelSeqId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEndLabelSeqId() {
            return endLabelSeqId;
        }

        /**
         * Sets the value of the endLabelSeqId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEndLabelSeqId(BigInteger value) {
            this.endLabelSeqId = value;
        }

        /**
         * Gets the value of the pdbxPDBHelixClass property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPDBHelixClass() {
            return pdbxPDBHelixClass;
        }

        /**
         * Sets the value of the pdbxPDBHelixClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPDBHelixClass(JAXBElement<String> value) {
            this.pdbxPDBHelixClass = value;
        }

        /**
         * Gets the value of the pdbxPDBHelixId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPDBHelixId() {
            return pdbxPDBHelixId;
        }

        /**
         * Sets the value of the pdbxPDBHelixId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPDBHelixId(JAXBElement<String> value) {
            this.pdbxPDBHelixId = value;
        }

        /**
         * Gets the value of the pdbxPDBHelixLength property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxPDBHelixLength() {
            return pdbxPDBHelixLength;
        }

        /**
         * Sets the value of the pdbxPDBHelixLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxPDBHelixLength(JAXBElement<BigInteger> value) {
            this.pdbxPDBHelixLength = value;
        }

        /**
         * Gets the value of the pdbxBegPDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxBegPDBInsCode() {
            return pdbxBegPDBInsCode;
        }

        /**
         * Sets the value of the pdbxBegPDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxBegPDBInsCode(JAXBElement<String> value) {
            this.pdbxBegPDBInsCode = value;
        }

        /**
         * Gets the value of the pdbxEndPDBInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxEndPDBInsCode() {
            return pdbxEndPDBInsCode;
        }

        /**
         * Sets the value of the pdbxEndPDBInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxEndPDBInsCode(JAXBElement<String> value) {
            this.pdbxEndPDBInsCode = value;
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
