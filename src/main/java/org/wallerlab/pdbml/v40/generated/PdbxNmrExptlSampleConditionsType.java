//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.pdbml.v40.generated;

import java.math.BigDecimal;
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
 * The experimental conditions used to for each sample.  Each set of conditions
 * is identified by a numerical code.  
 *  This example was taken from a pH stability study. 
 * <PDBx:pdbx_nmr_exptl_sample_conditionsCategory>
 *    <PDBx:pdbx_nmr_exptl_sample_conditions conditions_id="1">
 *       <PDBx:ionic_strength>25mM NaCl</PDBx:ionic_strength>
 *       <PDBx:pH>7</PDBx:pH>
 *       <PDBx:pressure>ambient</PDBx:pressure>
 *       <PDBx:temperature>298</PDBx:temperature>
 *    </PDBx:pdbx_nmr_exptl_sample_conditions>
 *    <PDBx:pdbx_nmr_exptl_sample_conditions conditions_id="2">
 *       <PDBx:ionic_strength>25mM NaCl</PDBx:ionic_strength>
 *       <PDBx:pH>3</PDBx:pH>
 *       <PDBx:pressure>ambient</PDBx:pressure>
 *       <PDBx:temperature>298</PDBx:temperature>
 *    </PDBx:pdbx_nmr_exptl_sample_conditions>
 * </PDBx:pdbx_nmr_exptl_sample_conditionsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_exptl_sample_conditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_exptl_sample_conditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_exptl_sample_conditions" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ionic_strength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ionic_strength_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ionic_strength_units" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="M"/>
 *                         &lt;enumeration value="mM"/>
 *                         &lt;enumeration value="Not defined"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pH_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pH_units" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="pH"/>
 *                         &lt;enumeration value="pD"/>
 *                         &lt;enumeration value="Not defined"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pressure_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pressure_units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="temperature_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="temperature_units" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="K"/>
 *                         &lt;enumeration value="C"/>
 *                         &lt;enumeration value="Not defined"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="conditions_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_nmr_exptl_sample_conditionsType", propOrder = {
    "pdbxNmrExptlSampleConditions"
})
public class PdbxNmrExptlSampleConditionsType {

    @XmlElement(name = "pdbx_nmr_exptl_sample_conditions")
    protected List<PdbxNmrExptlSampleConditionsType.PdbxNmrExptlSampleConditions> pdbxNmrExptlSampleConditions;

    /**
     * Gets the value of the pdbxNmrExptlSampleConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrExptlSampleConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrExptlSampleConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrExptlSampleConditionsType.PdbxNmrExptlSampleConditions }
     * 
     * 
     */
    public List<PdbxNmrExptlSampleConditionsType.PdbxNmrExptlSampleConditions> getPdbxNmrExptlSampleConditions() {
        if (pdbxNmrExptlSampleConditions == null) {
            pdbxNmrExptlSampleConditions = new ArrayList<PdbxNmrExptlSampleConditionsType.PdbxNmrExptlSampleConditions>();
        }
        return this.pdbxNmrExptlSampleConditions;
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
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ionic_strength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ionic_strength_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ionic_strength_units" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="M"/>
     *               &lt;enumeration value="mM"/>
     *               &lt;enumeration value="Not defined"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pH_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pH_units" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="pH"/>
     *               &lt;enumeration value="pD"/>
     *               &lt;enumeration value="Not defined"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pressure_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pressure_units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="temperature_err" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="temperature_units" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="K"/>
     *               &lt;enumeration value="C"/>
     *               &lt;enumeration value="Not defined"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="conditions_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxNmrExptlSampleConditions {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "ionic_strength", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ionicStrength;
        @XmlElementRef(name = "ionic_strength_err", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> ionicStrengthErr;
        @XmlElementRef(name = "ionic_strength_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ionicStrengthUnits;
        @XmlElementRef(name = "label", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> label;
        @XmlElementRef(name = "pH", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ph;
        @XmlElementRef(name = "pH_err", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> phErr;
        @XmlElementRef(name = "pH_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> phUnits;
        @XmlElementRef(name = "pressure", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pressure;
        @XmlElementRef(name = "pressure_err", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> pressureErr;
        @XmlElementRef(name = "pressure_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pressureUnits;
        @XmlElementRef(name = "temperature", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> temperature;
        @XmlElementRef(name = "temperature_err", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> temperatureErr;
        @XmlElementRef(name = "temperature_units", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> temperatureUnits;
        @XmlAttribute(name = "conditions_id", required = true)
        protected String conditionsId;

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
         * Gets the value of the ionicStrength property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIonicStrength() {
            return ionicStrength;
        }

        /**
         * Sets the value of the ionicStrength property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIonicStrength(JAXBElement<String> value) {
            this.ionicStrength = value;
        }

        /**
         * Gets the value of the ionicStrengthErr property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getIonicStrengthErr() {
            return ionicStrengthErr;
        }

        /**
         * Sets the value of the ionicStrengthErr property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setIonicStrengthErr(JAXBElement<BigDecimal> value) {
            this.ionicStrengthErr = value;
        }

        /**
         * Gets the value of the ionicStrengthUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIonicStrengthUnits() {
            return ionicStrengthUnits;
        }

        /**
         * Sets the value of the ionicStrengthUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIonicStrengthUnits(JAXBElement<String> value) {
            this.ionicStrengthUnits = value;
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
         * Gets the value of the ph property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPH() {
            return ph;
        }

        /**
         * Sets the value of the ph property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPH(JAXBElement<String> value) {
            this.ph = value;
        }

        /**
         * Gets the value of the phErr property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPHErr() {
            return phErr;
        }

        /**
         * Sets the value of the phErr property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPHErr(JAXBElement<BigDecimal> value) {
            this.phErr = value;
        }

        /**
         * Gets the value of the phUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPHUnits() {
            return phUnits;
        }

        /**
         * Sets the value of the phUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPHUnits(JAXBElement<String> value) {
            this.phUnits = value;
        }

        /**
         * Gets the value of the pressure property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPressure() {
            return pressure;
        }

        /**
         * Sets the value of the pressure property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPressure(JAXBElement<String> value) {
            this.pressure = value;
        }

        /**
         * Gets the value of the pressureErr property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPressureErr() {
            return pressureErr;
        }

        /**
         * Sets the value of the pressureErr property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPressureErr(JAXBElement<BigDecimal> value) {
            this.pressureErr = value;
        }

        /**
         * Gets the value of the pressureUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPressureUnits() {
            return pressureUnits;
        }

        /**
         * Sets the value of the pressureUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPressureUnits(JAXBElement<String> value) {
            this.pressureUnits = value;
        }

        /**
         * Gets the value of the temperature property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTemperature() {
            return temperature;
        }

        /**
         * Sets the value of the temperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTemperature(JAXBElement<String> value) {
            this.temperature = value;
        }

        /**
         * Gets the value of the temperatureErr property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTemperatureErr() {
            return temperatureErr;
        }

        /**
         * Sets the value of the temperatureErr property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTemperatureErr(JAXBElement<BigDecimal> value) {
            this.temperatureErr = value;
        }

        /**
         * Gets the value of the temperatureUnits property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTemperatureUnits() {
            return temperatureUnits;
        }

        /**
         * Sets the value of the temperatureUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTemperatureUnits(JAXBElement<String> value) {
            this.temperatureUnits = value;
        }

        /**
         * Gets the value of the conditionsId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConditionsId() {
            return conditionsId;
        }

        /**
         * Sets the value of the conditionsId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConditionsId(String value) {
            this.conditionsId = value;
        }

    }

}
