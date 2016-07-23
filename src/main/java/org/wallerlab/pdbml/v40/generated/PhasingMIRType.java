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
 * Data items in the PHASING_MIR category record details about
 * the phasing of the structure where methods involving isomorphous
 * replacement are involved.
 * 
 * All isomorphous-replacement-based techniques are covered
 * by this category, including single isomorphous replacement (SIR),
 * multiple isomorphous replacement (MIR) and single or multiple
 * isomorphous replacement plus anomalous scattering (SIRAS, MIRAS).
 * 
 *     Example 1 - based on a paper by Zanotti et al. [J. Biol. Chem.
 *                 (1993), 268, 10728-10738].
 * <PDBx:phasing_MIRCategory>
 *    <PDBx:phasing_MIR entry_id="1ABC">
 *       <PDBx:method> Standard phase refinement (Blow &amp; Crick, 1959)</PDBx:method>
 *    </PDBx:phasing_MIR>
 * </PDBx:phasing_MIRCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for phasing_MIRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phasing_MIRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phasing_MIR" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="FOM" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FOM_acentric" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FOM_centric" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="d_res_high">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="d_res_low">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="0.0"/>
 *                             &lt;maxInclusive value="0.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_number_derivatives" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="reflns" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="0"/>
 *                             &lt;maxInclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reflns_acentric" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="0"/>
 *                             &lt;maxInclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reflns_centric" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minExclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                             &lt;minInclusive value="0"/>
 *                             &lt;maxInclusive value="0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reflns_criterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "phasing_MIRType", propOrder = {
    "phasingMIR"
})
public class PhasingMIRType {

    @XmlElement(name = "phasing_MIR")
    protected List<PhasingMIRType.PhasingMIR> phasingMIR;

    /**
     * Gets the value of the phasingMIR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phasingMIR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhasingMIR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhasingMIRType.PhasingMIR }
     * 
     * 
     */
    public List<PhasingMIRType.PhasingMIR> getPhasingMIR() {
        if (phasingMIR == null) {
            phasingMIR = new ArrayList<PhasingMIRType.PhasingMIR>();
        }
        return this.phasingMIR;
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
     *         &lt;element name="FOM" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FOM_acentric" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FOM_centric" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="d_res_high">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="d_res_low">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="0.0"/>
     *                   &lt;maxInclusive value="0.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_number_derivatives" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="reflns" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="0"/>
     *                   &lt;maxInclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reflns_acentric" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="0"/>
     *                   &lt;maxInclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reflns_centric" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minExclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                   &lt;minInclusive value="0"/>
     *                   &lt;maxInclusive value="0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reflns_criterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
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
    public static class PhasingMIR {

        @XmlElementRef(name = "FOM", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fom;
        @XmlElementRef(name = "FOM_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fomAcentric;
        @XmlElementRef(name = "FOM_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fomCentric;
        @XmlElement(name = "d_res_high", required = true)
        protected String dResHigh;
        @XmlElement(name = "d_res_low", required = true)
        protected String dResLow;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> method;
        @XmlElementRef(name = "pdbx_number_derivatives", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> pdbxNumberDerivatives;
        @XmlElementRef(name = "reflns", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reflns;
        @XmlElementRef(name = "reflns_acentric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reflnsAcentric;
        @XmlElementRef(name = "reflns_centric", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reflnsCentric;
        @XmlElementRef(name = "reflns_criterion", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> reflnsCriterion;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the fom property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFOM() {
            return fom;
        }

        /**
         * Sets the value of the fom property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFOM(JAXBElement<String> value) {
            this.fom = value;
        }

        /**
         * Gets the value of the fomAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFOMAcentric() {
            return fomAcentric;
        }

        /**
         * Sets the value of the fomAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFOMAcentric(JAXBElement<String> value) {
            this.fomAcentric = value;
        }

        /**
         * Gets the value of the fomCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFOMCentric() {
            return fomCentric;
        }

        /**
         * Sets the value of the fomCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFOMCentric(JAXBElement<String> value) {
            this.fomCentric = value;
        }

        /**
         * Gets the value of the dResHigh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDResHigh() {
            return dResHigh;
        }

        /**
         * Sets the value of the dResHigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDResHigh(String value) {
            this.dResHigh = value;
        }

        /**
         * Gets the value of the dResLow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDResLow() {
            return dResLow;
        }

        /**
         * Sets the value of the dResLow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDResLow(String value) {
            this.dResLow = value;
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
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMethod(JAXBElement<String> value) {
            this.method = value;
        }

        /**
         * Gets the value of the pdbxNumberDerivatives property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getPdbxNumberDerivatives() {
            return pdbxNumberDerivatives;
        }

        /**
         * Sets the value of the pdbxNumberDerivatives property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setPdbxNumberDerivatives(JAXBElement<BigInteger> value) {
            this.pdbxNumberDerivatives = value;
        }

        /**
         * Gets the value of the reflns property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReflns() {
            return reflns;
        }

        /**
         * Sets the value of the reflns property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReflns(JAXBElement<String> value) {
            this.reflns = value;
        }

        /**
         * Gets the value of the reflnsAcentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReflnsAcentric() {
            return reflnsAcentric;
        }

        /**
         * Sets the value of the reflnsAcentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReflnsAcentric(JAXBElement<String> value) {
            this.reflnsAcentric = value;
        }

        /**
         * Gets the value of the reflnsCentric property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReflnsCentric() {
            return reflnsCentric;
        }

        /**
         * Sets the value of the reflnsCentric property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReflnsCentric(JAXBElement<String> value) {
            this.reflnsCentric = value;
        }

        /**
         * Gets the value of the reflnsCriterion property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getReflnsCriterion() {
            return reflnsCriterion;
        }

        /**
         * Sets the value of the reflnsCriterion property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setReflnsCriterion(JAXBElement<String> value) {
            this.reflnsCriterion = value;
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