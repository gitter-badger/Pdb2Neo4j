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
 * Data items in the PDBX_REFERENCE_MOLECULE_SYNONYMS category records 
 * synonym names for reference entities.
 * 
 *     Example: 1  Actinomycin
 * <PDBx:pdbx_reference_molecule_synonymsCategory>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="1" prd_id="PRD_000001">
 *       <PDBx:name>ACTINOMYCIN</PDBx:name>
 *       <PDBx:source>PDB</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="2" prd_id="PRD_000001">
 *       <PDBx:name> 3H-Phenoxazine-1,9-dicarboxamide, 2-amino-N,N&apos;-bis(hexadecahydro-6,13-diisopropyl-2,5,9-trimethyl-1,4,7,11,14-pentaoxo-
 *  1H-pyrrolo[2,1-i][1,4,7,10,13]oxatetraazacyclohexadecin-10-yl)-4,6-dimethyl-3-oxo-(7CI)</PDBx:name>
 *       <PDBx:source>SciFinder</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="3" prd_id="PRD_000001">
 *       <PDBx:name>Actinomycin C1 (6CI)</PDBx:name>
 *       <PDBx:source>SciFinder</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="4" prd_id="PRD_000001">
 *       <PDBx:name>1H-Pyrrolo[2,1-i][1,4,7,10,13]oxatetraazacyclohexadecine, cyclic peptide deriv.</PDBx:name>
 *       <PDBx:source>SciFinder</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="5" prd_id="PRD_000001">
 *       <PDBx:name>3H-Phenoxazine, actinomycin D deriv.</PDBx:name>
 *       <PDBx:source>SciFinder</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="6" prd_id="PRD_000001">
 *       <PDBx:name>Actactinomycin A IV</PDBx:name>
 *       <PDBx:source>SciFinder</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 *    <PDBx:pdbx_reference_molecule_synonyms family_prd_id="FAM_000001" ordinal="7" prd_id="PRD_000001">
 *       <PDBx:name>Actinomycin 7</PDBx:name>
 *       <PDBx:source>SciFinder</PDBx:source>
 *    </PDBx:pdbx_reference_molecule_synonyms>
 * </PDBx:pdbx_reference_molecule_synonymsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_reference_molecule_synonymsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_reference_molecule_synonymsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_reference_molecule_synonyms" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_reference_molecule_synonymsType", propOrder = {
    "pdbxReferenceMoleculeSynonyms"
})
public class PdbxReferenceMoleculeSynonymsType {

    @XmlElement(name = "pdbx_reference_molecule_synonyms")
    protected List<PdbxReferenceMoleculeSynonymsType.PdbxReferenceMoleculeSynonyms> pdbxReferenceMoleculeSynonyms;

    /**
     * Gets the value of the pdbxReferenceMoleculeSynonyms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxReferenceMoleculeSynonyms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxReferenceMoleculeSynonyms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxReferenceMoleculeSynonymsType.PdbxReferenceMoleculeSynonyms }
     * 
     * 
     */
    public List<PdbxReferenceMoleculeSynonymsType.PdbxReferenceMoleculeSynonyms> getPdbxReferenceMoleculeSynonyms() {
        if (pdbxReferenceMoleculeSynonyms == null) {
            pdbxReferenceMoleculeSynonyms = new ArrayList<PdbxReferenceMoleculeSynonymsType.PdbxReferenceMoleculeSynonyms>();
        }
        return this.pdbxReferenceMoleculeSynonyms;
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
     *         &lt;element name="chem_comp_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ordinal" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxReferenceMoleculeSynonyms {

        @XmlElementRef(name = "chem_comp_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> chemCompId;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String source;
        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;
        @XmlAttribute(name = "ordinal", required = true)
        protected BigInteger ordinal;
        @XmlAttribute(name = "prd_id", required = true)
        protected String prdId;

        /**
         * Gets the value of the chemCompId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getChemCompId() {
            return chemCompId;
        }

        /**
         * Sets the value of the chemCompId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setChemCompId(JAXBElement<String> value) {
            this.chemCompId = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
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

        /**
         * Gets the value of the prdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrdId() {
            return prdId;
        }

        /**
         * Sets the value of the prdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrdId(String value) {
            this.prdId = value;
        }

    }

}
