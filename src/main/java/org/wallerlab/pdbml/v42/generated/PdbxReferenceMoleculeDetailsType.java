//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

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
 * Data items in the PDBX_REFERENCE_MOLECULE_DETAILS category records 
 * textual details about small polymer molecules.
 * 
 *     Example: 1  Actinomycin
 * <PDBx:pdbx_reference_molecule_detailsCategory>
 *    <PDBx:pdbx_reference_molecule_details family_prd_id="FAM_000001" ordinal="1">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>Wikipedia</PDBx:source>
 *       <PDBx:text> Actinomycin D is primarily used as an investigative tool in cell biology to inhibit transcription. It does this by
 * binding DNA at the transcription initiation complex and preventing elongation by RNA polymerase. Because it can bind
 * DNA duplexes, it can also interfere with DNA replication, although other chemicals such as hydroxyurea are
 * better suited for use in the laboratory as inhibitors of DNA synthesis.</PDBx:text>
 *    </PDBx:pdbx_reference_molecule_details>
 *    <PDBx:pdbx_reference_molecule_details family_prd_id="FAM_000001" ordinal="2">
 *       <PDBx:prd_id>PRD_000001</PDBx:prd_id>
 *       <PDBx:source>DrugBank</PDBx:source>
 *       <PDBx:text> A compound composed of a two cyclic peptides attached to a phenoxazine that is derived from streptomyces parvullus. It
 * binds to DNA and inhibits RNA synthesis (transcription), with chain elongation more sensitive than initiation,
 * termination, or release. As a result of impaired mRNA production, protein synthesis also declines after dactinomycin
 * therapy.</PDBx:text>
 *    </PDBx:pdbx_reference_molecule_details>
 *    <PDBx:pdbx_reference_molecule_details family_prd_id="FAM_000001" ordinal="3">
 *       <PDBx:prd_id>PRD_000003</PDBx:prd_id>
 *       <PDBx:source>DOI</PDBx:source>
 *       <PDBx:source_id>DOI:10.1016/S0960-894X(98)00345-X</PDBx:source_id>
 *       <PDBx:text> Actinomycin D, C2 and VII, cyclic peptides, inhibit Grb2 SH2 domain association with a phosphotyrosine containing 
 * peptide derived from the Shc protein (pTyr317). Actinomycins are the first examples of nonphosphorylated 
 * natural ligands of SH2 domain.</PDBx:text>
 *    </PDBx:pdbx_reference_molecule_details>
 * </PDBx:pdbx_reference_molecule_detailsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_molecule_detailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_molecule_detailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_molecule_details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="prd_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_molecule_detailsType", propOrder = {
    "pdbxReferenceMoleculeDetails"
})
public class PdbxReferenceMoleculeDetailsType {

    @XmlElement(name = "pdbx_reference_molecule_details")
    protected List<PdbxReferenceMoleculeDetailsType.PdbxReferenceMoleculeDetails> pdbxReferenceMoleculeDetails;

    /**
     * Gets the value of the pdbxReferenceMoleculeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceMoleculeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceMoleculeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceMoleculeDetailsType.PdbxReferenceMoleculeDetails }
     * 
     * 
     */
    public List<PdbxReferenceMoleculeDetailsType.PdbxReferenceMoleculeDetails> getPdbxReferenceMoleculeDetails() {
        if (pdbxReferenceMoleculeDetails == null) {
            pdbxReferenceMoleculeDetails = new ArrayList<PdbxReferenceMoleculeDetailsType.PdbxReferenceMoleculeDetails>();
        }
        return this.pdbxReferenceMoleculeDetails;
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
     *         &lt;element name="prd_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceMoleculeDetails {

        @XmlElementRef(name = "prd_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> prdId;
        @XmlElementRef(name = "source", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> source;
        @XmlElementRef(name = "source_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sourceId;
        @XmlElement(required = true)
        protected String text;
        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;

        /**
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPrdId(JAXBElement<String> value) {
            this.prdId = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSource(JAXBElement<String> value) {
            this.source = value;
        }

        /**
         * Gets the value of the sourceId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSourceId() {
            return sourceId;
        }

        /**
         * Sets the value of the sourceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSourceId(JAXBElement<String> value) {
            this.sourceId = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the familyPrdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyPrdId() {
            return familyPrdId;
        }

        /**
         * Sets the value of the familyPrdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyPrdId(String value) {
            this.familyPrdId = value;
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
