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
 * 
 * Items in the pdbx_nmr_spectral_peak_list category provide information about a list of reported spectral peak characteristic values.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_spectral_peak_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_spectral_peak_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_spectral_peak_list" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="conditions_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="conditions_label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="data_file_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="experiment_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="number_of_spectral_dimensions" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="solution_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="text_data_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_spectral_peak_listType", propOrder = {
    "pdbxNmrSpectralPeakList"
})
public class PdbxNmrSpectralPeakListType {

    @XmlElement(name = "pdbx_nmr_spectral_peak_list")
    protected List<PdbxNmrSpectralPeakListType.PdbxNmrSpectralPeakList> pdbxNmrSpectralPeakList;

    /**
     * Gets the value of the pdbxNmrSpectralPeakList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrSpectralPeakList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrSpectralPeakList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrSpectralPeakListType.PdbxNmrSpectralPeakList }
     * 
     * 
     */
    public List<PdbxNmrSpectralPeakListType.PdbxNmrSpectralPeakList> getPdbxNmrSpectralPeakList() {
        if (pdbxNmrSpectralPeakList == null) {
            pdbxNmrSpectralPeakList = new ArrayList<PdbxNmrSpectralPeakListType.PdbxNmrSpectralPeakList>();
        }
        return this.pdbxNmrSpectralPeakList;
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
     *         &lt;element name="conditions_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="conditions_label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="data_file_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="experiment_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="number_of_spectral_dimensions" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="solution_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="text_data_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrSpectralPeakList {

        @XmlElement(name = "conditions_id", required = true)
        protected BigInteger conditionsId;
        @XmlElementRef(name = "conditions_label", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> conditionsLabel;
        @XmlElementRef(name = "data_file_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dataFileName;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElement(name = "experiment_id", required = true)
        protected BigInteger experimentId;
        @XmlElementRef(name = "label", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> label;
        @XmlElement(name = "number_of_spectral_dimensions", required = true)
        protected BigInteger numberOfSpectralDimensions;
        @XmlElement(name = "solution_id", required = true)
        protected BigInteger solutionId;
        @XmlElementRef(name = "text_data_format", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> textDataFormat;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "id", required = true)
        protected BigInteger id;

        /**
         * Gets the value of the conditionsId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getConditionsId() {
            return conditionsId;
        }

        /**
         * Sets the value of the conditionsId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setConditionsId(BigInteger value) {
            this.conditionsId = value;
        }

        /**
         * Gets the value of the conditionsLabel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConditionsLabel() {
            return conditionsLabel;
        }

        /**
         * Sets the value of the conditionsLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConditionsLabel(JAXBElement<String> value) {
            this.conditionsLabel = value;
        }

        /**
         * Gets the value of the dataFileName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDataFileName() {
            return dataFileName;
        }

        /**
         * Sets the value of the dataFileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDataFileName(JAXBElement<String> value) {
            this.dataFileName = value;
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
         * Gets the value of the experimentId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExperimentId() {
            return experimentId;
        }

        /**
         * Sets the value of the experimentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExperimentId(BigInteger value) {
            this.experimentId = value;
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
         * Gets the value of the numberOfSpectralDimensions property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfSpectralDimensions() {
            return numberOfSpectralDimensions;
        }

        /**
         * Sets the value of the numberOfSpectralDimensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfSpectralDimensions(BigInteger value) {
            this.numberOfSpectralDimensions = value;
        }

        /**
         * Gets the value of the solutionId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSolutionId() {
            return solutionId;
        }

        /**
         * Sets the value of the solutionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSolutionId(BigInteger value) {
            this.solutionId = value;
        }

        /**
         * Gets the value of the textDataFormat property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTextDataFormat() {
            return textDataFormat;
        }

        /**
         * Sets the value of the textDataFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTextDataFormat(JAXBElement<String> value) {
            this.textDataFormat = value;
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

    }

}
