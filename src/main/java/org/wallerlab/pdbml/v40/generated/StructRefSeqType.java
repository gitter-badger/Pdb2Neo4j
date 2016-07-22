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
 * Data items in the STRUCT_REF_SEQ category provide a mechanism
 * for indicating and annotating a region (or regions) of alignment
 * between the sequence of an entity or biological unit described
 * in the data block and the sequence in the referenced database
 * entry.
 * 
 *     Example 1 - based on the sequence alignment of CHER from M. xantus
 *                 (36 to 288) and CHER from S. typhimurium (18 to 276).
 * <PDBx:struct_ref_seqCategory>
 *    <PDBx:struct_ref_seq align_id="alg1">
 *       <PDBx:db_align_beg>18</PDBx:db_align_beg>
 *       <PDBx:db_align_end>276</PDBx:db_align_end>
 *       <PDBx:details> The alignment contains 3 gaps larger than 2 residues</PDBx:details>
 *       <PDBx:ref_id>seqdb1</PDBx:ref_id>
 *       <PDBx:seq_align_beg>36</PDBx:seq_align_beg>
 *       <PDBx:seq_align_end>288</PDBx:seq_align_end>
 *    </PDBx:struct_ref_seq>
 * </PDBx:struct_ref_seqCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_ref_seqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_ref_seqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_ref_seq" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="db_align_beg" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="db_align_end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_PDB_id_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_auth_seq_align_beg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_auth_seq_align_end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_db_accession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_db_align_beg_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_db_align_end_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_align_beg_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_seq_align_end_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ref_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="seq_align_beg" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="seq_align_end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *                 &lt;attribute name="align_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_ref_seqType", propOrder = {
    "structRefSeq"
})
public class StructRefSeqType {

    @XmlElement(name = "struct_ref_seq")
    protected List<StructRefSeqType.StructRefSeq> structRefSeq;

    /**
     * Gets the value of the structRefSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structRefSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructRefSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructRefSeqType.StructRefSeq }
     * 
     * 
     */
    public List<StructRefSeqType.StructRefSeq> getStructRefSeq() {
        if (structRefSeq == null) {
            structRefSeq = new ArrayList<StructRefSeqType.StructRefSeq>();
        }
        return this.structRefSeq;
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
     *         &lt;element name="db_align_beg" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="db_align_end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_PDB_id_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_auth_seq_align_beg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_auth_seq_align_end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_db_accession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_db_align_beg_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_db_align_end_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_align_beg_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_seq_align_end_ins_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_strand_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ref_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="seq_align_beg" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="seq_align_end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/all>
     *       &lt;attribute name="align_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructRefSeq {

        @XmlElement(name = "db_align_beg", required = true)
        protected BigInteger dbAlignBeg;
        @XmlElement(name = "db_align_end", required = true)
        protected BigInteger dbAlignEnd;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "pdbx_PDB_id_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxPDBIdCode;
        @XmlElementRef(name = "pdbx_auth_seq_align_beg", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAuthSeqAlignBeg;
        @XmlElementRef(name = "pdbx_auth_seq_align_end", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAuthSeqAlignEnd;
        @XmlElementRef(name = "pdbx_db_accession", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDbAccession;
        @XmlElementRef(name = "pdbx_db_align_beg_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDbAlignBegInsCode;
        @XmlElementRef(name = "pdbx_db_align_end_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxDbAlignEndInsCode;
        @XmlElementRef(name = "pdbx_seq_align_beg_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqAlignBegInsCode;
        @XmlElementRef(name = "pdbx_seq_align_end_ins_code", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxSeqAlignEndInsCode;
        @XmlElementRef(name = "pdbx_strand_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxStrandId;
        @XmlElement(name = "ref_id", required = true)
        protected String refId;
        @XmlElement(name = "seq_align_beg", required = true)
        protected BigInteger seqAlignBeg;
        @XmlElement(name = "seq_align_end", required = true)
        protected BigInteger seqAlignEnd;
        @XmlAttribute(name = "align_id", required = true)
        protected String alignId;

        /**
         * Gets the value of the dbAlignBeg property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDbAlignBeg() {
            return dbAlignBeg;
        }

        /**
         * Sets the value of the dbAlignBeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDbAlignBeg(BigInteger value) {
            this.dbAlignBeg = value;
        }

        /**
         * Gets the value of the dbAlignEnd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDbAlignEnd() {
            return dbAlignEnd;
        }

        /**
         * Sets the value of the dbAlignEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDbAlignEnd(BigInteger value) {
            this.dbAlignEnd = value;
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
         * Gets the value of the pdbxPDBIdCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxPDBIdCode() {
            return pdbxPDBIdCode;
        }

        /**
         * Sets the value of the pdbxPDBIdCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxPDBIdCode(JAXBElement<String> value) {
            this.pdbxPDBIdCode = value;
        }

        /**
         * Gets the value of the pdbxAuthSeqAlignBeg property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAuthSeqAlignBeg() {
            return pdbxAuthSeqAlignBeg;
        }

        /**
         * Sets the value of the pdbxAuthSeqAlignBeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAuthSeqAlignBeg(JAXBElement<String> value) {
            this.pdbxAuthSeqAlignBeg = value;
        }

        /**
         * Gets the value of the pdbxAuthSeqAlignEnd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAuthSeqAlignEnd() {
            return pdbxAuthSeqAlignEnd;
        }

        /**
         * Sets the value of the pdbxAuthSeqAlignEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAuthSeqAlignEnd(JAXBElement<String> value) {
            this.pdbxAuthSeqAlignEnd = value;
        }

        /**
         * Gets the value of the pdbxDbAccession property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDbAccession() {
            return pdbxDbAccession;
        }

        /**
         * Sets the value of the pdbxDbAccession property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDbAccession(JAXBElement<String> value) {
            this.pdbxDbAccession = value;
        }

        /**
         * Gets the value of the pdbxDbAlignBegInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDbAlignBegInsCode() {
            return pdbxDbAlignBegInsCode;
        }

        /**
         * Sets the value of the pdbxDbAlignBegInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDbAlignBegInsCode(JAXBElement<String> value) {
            this.pdbxDbAlignBegInsCode = value;
        }

        /**
         * Gets the value of the pdbxDbAlignEndInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxDbAlignEndInsCode() {
            return pdbxDbAlignEndInsCode;
        }

        /**
         * Sets the value of the pdbxDbAlignEndInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxDbAlignEndInsCode(JAXBElement<String> value) {
            this.pdbxDbAlignEndInsCode = value;
        }

        /**
         * Gets the value of the pdbxSeqAlignBegInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqAlignBegInsCode() {
            return pdbxSeqAlignBegInsCode;
        }

        /**
         * Sets the value of the pdbxSeqAlignBegInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqAlignBegInsCode(JAXBElement<String> value) {
            this.pdbxSeqAlignBegInsCode = value;
        }

        /**
         * Gets the value of the pdbxSeqAlignEndInsCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxSeqAlignEndInsCode() {
            return pdbxSeqAlignEndInsCode;
        }

        /**
         * Sets the value of the pdbxSeqAlignEndInsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxSeqAlignEndInsCode(JAXBElement<String> value) {
            this.pdbxSeqAlignEndInsCode = value;
        }

        /**
         * Gets the value of the pdbxStrandId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxStrandId() {
            return pdbxStrandId;
        }

        /**
         * Sets the value of the pdbxStrandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxStrandId(JAXBElement<String> value) {
            this.pdbxStrandId = value;
        }

        /**
         * Gets the value of the refId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefId() {
            return refId;
        }

        /**
         * Sets the value of the refId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefId(String value) {
            this.refId = value;
        }

        /**
         * Gets the value of the seqAlignBeg property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeqAlignBeg() {
            return seqAlignBeg;
        }

        /**
         * Sets the value of the seqAlignBeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeqAlignBeg(BigInteger value) {
            this.seqAlignBeg = value;
        }

        /**
         * Gets the value of the seqAlignEnd property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeqAlignEnd() {
            return seqAlignEnd;
        }

        /**
         * Sets the value of the seqAlignEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeqAlignEnd(BigInteger value) {
            this.seqAlignEnd = value;
        }

        /**
         * Gets the value of the alignId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlignId() {
            return alignId;
        }

        /**
         * Sets the value of the alignId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlignId(String value) {
            this.alignId = value;
        }

    }

}
