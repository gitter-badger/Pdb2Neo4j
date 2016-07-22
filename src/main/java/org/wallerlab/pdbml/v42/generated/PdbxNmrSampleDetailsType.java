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
 * 
 * Complete description of each NMR sample, including the solvent
 * system used.
 *  
 * This example was taken from the study of MCP-1 which is a dimer under the 
 * conditions studied.  Three solutions with different isotope compositions were 
 * studied.
 *  
 * <PDBx:pdbx_nmr_sample_detailsCategory>
 *    <PDBx:pdbx_nmr_sample_details solution_id="1">
 *       <PDBx:contents>2 mM U-15N,13C, H2O 90 &#37;, D2O 10 &#37;</PDBx:contents>
 *       <PDBx:solvent_system>MCP-1</PDBx:solvent_system>
 *    </PDBx:pdbx_nmr_sample_details>
 *    <PDBx:pdbx_nmr_sample_details solution_id="2">
 *       <PDBx:contents>1 mM U-50&#37; 15N, MCP-1 1 mM U-50&#37; 13C, H2O 90 &#37;, D2O 10 &#37;</PDBx:contents>
 *       <PDBx:solvent_system>MCP-1</PDBx:solvent_system>
 *    </PDBx:pdbx_nmr_sample_details>
 *    <PDBx:pdbx_nmr_sample_details solution_id="3">
 *       <PDBx:contents>2 mM U-15N, H2O 90 &#37;, D2O 10 &#37;</PDBx:contents>
 *       <PDBx:solvent_system>MCP-1</PDBx:solvent_system>
 *    </PDBx:pdbx_nmr_sample_details>
 * </PDBx:pdbx_nmr_sample_detailsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_sample_detailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_sample_detailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_sample_details" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="solvent_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="solution"/>
 *                         &lt;enumeration value="solid"/>
 *                         &lt;enumeration value="bicelle"/>
 *                         &lt;enumeration value="emulsion"/>
 *                         &lt;enumeration value="fiber"/>
 *                         &lt;enumeration value="filamentous virus"/>
 *                         &lt;enumeration value="gel solution"/>
 *                         &lt;enumeration value="gel solid"/>
 *                         &lt;enumeration value="liposome"/>
 *                         &lt;enumeration value="membrane"/>
 *                         &lt;enumeration value="micelle"/>
 *                         &lt;enumeration value="lyophilized powder"/>
 *                         &lt;enumeration value="oriented membrane film"/>
 *                         &lt;enumeration value="fibrous protein"/>
 *                         &lt;enumeration value="polycrystalline powder"/>
 *                         &lt;enumeration value="reverse micelle"/>
 *                         &lt;enumeration value="single crystal"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="solution_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_sample_detailsType", propOrder = {
    "pdbxNmrSampleDetails"
})
public class PdbxNmrSampleDetailsType {

    @XmlElement(name = "pdbx_nmr_sample_details")
    protected List<PdbxNmrSampleDetailsType.PdbxNmrSampleDetails> pdbxNmrSampleDetails;

    /**
     * Gets the value of the pdbxNmrSampleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrSampleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrSampleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrSampleDetailsType.PdbxNmrSampleDetails }
     * 
     * 
     */
    public List<PdbxNmrSampleDetailsType.PdbxNmrSampleDetails> getPdbxNmrSampleDetails() {
        if (pdbxNmrSampleDetails == null) {
            pdbxNmrSampleDetails = new ArrayList<PdbxNmrSampleDetailsType.PdbxNmrSampleDetails>();
        }
        return this.pdbxNmrSampleDetails;
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
     *         &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="solvent_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="solution"/>
     *               &lt;enumeration value="solid"/>
     *               &lt;enumeration value="bicelle"/>
     *               &lt;enumeration value="emulsion"/>
     *               &lt;enumeration value="fiber"/>
     *               &lt;enumeration value="filamentous virus"/>
     *               &lt;enumeration value="gel solution"/>
     *               &lt;enumeration value="gel solid"/>
     *               &lt;enumeration value="liposome"/>
     *               &lt;enumeration value="membrane"/>
     *               &lt;enumeration value="micelle"/>
     *               &lt;enumeration value="lyophilized powder"/>
     *               &lt;enumeration value="oriented membrane film"/>
     *               &lt;enumeration value="fibrous protein"/>
     *               &lt;enumeration value="polycrystalline powder"/>
     *               &lt;enumeration value="reverse micelle"/>
     *               &lt;enumeration value="single crystal"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="solution_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrSampleDetails {

        @XmlElementRef(name = "contents", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contents;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "label", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> label;
        @XmlElementRef(name = "solvent_system", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> solventSystem;
        @XmlElementRef(name = "type", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> type;
        @XmlAttribute(name = "solution_id", required = true)
        protected String solutionId;

        /**
         * Gets the value of the contents property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContents() {
            return contents;
        }

        /**
         * Sets the value of the contents property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContents(JAXBElement<String> value) {
            this.contents = value;
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
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setLabel(JAXBElement<String> value) {
            this.label = value;
        }

        /**
         * Gets the value of the solventSystem property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSolventSystem() {
            return solventSystem;
        }

        /**
         * Sets the value of the solventSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSolventSystem(JAXBElement<String> value) {
            this.solventSystem = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setType(JAXBElement<String> value) {
            this.type = value;
        }

        /**
         * Gets the value of the solutionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSolutionId() {
            return solutionId;
        }

        /**
         * Sets the value of the solutionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSolutionId(String value) {
            this.solutionId = value;
        }

    }

}
