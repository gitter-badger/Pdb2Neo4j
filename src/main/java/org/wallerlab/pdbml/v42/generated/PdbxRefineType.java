//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

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
 * Data items in the PDBX_REFINE category record details about
 * additional structure refinement parameters which are needed
 * to complete legacy REMARK 3 refinement templates in PDB
 * format files.
 * 
 *     Example 1 - PDB placeholders for refinement program SHELX
 * <PDBx:pdbx_refineCategory>
 *    <PDBx:pdbx_refine entry_id="ABC001" pdbx_refine_id="x-ray">
 *       <PDBx:R_factor_all_4sig_cutoff>0.174</PDBx:R_factor_all_4sig_cutoff>
 *       <PDBx:R_factor_obs_4sig_cutoff>0.169</PDBx:R_factor_obs_4sig_cutoff>
 *       <PDBx:free_R_factor_4sig_cutoff>0.216</PDBx:free_R_factor_4sig_cutoff>
 *       <PDBx:free_R_val_test_set_ct_4sig_cutoff>164</PDBx:free_R_val_test_set_ct_4sig_cutoff>
 *       <PDBx:free_R_val_test_set_size_perc_4sig_cutoff>1.29</PDBx:free_R_val_test_set_size_perc_4sig_cutoff>
 *       <PDBx:number_reflns_obs_4sig_cutoff>1263</PDBx:number_reflns_obs_4sig_cutoff>
 *    </PDBx:pdbx_refine>
 * </PDBx:pdbx_refineCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_refineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_refineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_refine" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="R_factor_all_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_factor_all_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_factor_obs_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="R_factor_obs_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_error_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_factor_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_factor_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_val_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_val_test_set_ct_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_val_test_set_ct_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_val_test_set_size_perc_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="free_R_val_test_set_size_perc_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="number_reflns_obs_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="number_reflns_obs_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_refineType", propOrder = {
    "pdbxRefine"
})
public class PdbxRefineType {

    @XmlElement(name = "pdbx_refine")
    protected List<PdbxRefineType.PdbxRefine> pdbxRefine;

    /**
     * Gets the value of the pdbxRefine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxRefine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxRefine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxRefineType.PdbxRefine }
     * 
     * 
     */
    public List<PdbxRefineType.PdbxRefine> getPdbxRefine() {
        if (pdbxRefine == null) {
            pdbxRefine = new ArrayList<PdbxRefineType.PdbxRefine>();
        }
        return this.pdbxRefine;
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
     *         &lt;element name="R_factor_all_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_factor_all_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_factor_obs_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="R_factor_obs_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_error_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_factor_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_factor_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_val_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_val_test_set_ct_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_val_test_set_ct_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_val_test_set_size_perc_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="free_R_val_test_set_size_perc_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="number_reflns_obs_4sig_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="number_reflns_obs_no_cutoff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pdbx_refine_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxRefine {

        @XmlElementRef(name = "R_factor_all_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorAll4SigCutoff;
        @XmlElementRef(name = "R_factor_all_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorAllNoCutoff;
        @XmlElementRef(name = "R_factor_obs_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorObs4SigCutoff;
        @XmlElementRef(name = "R_factor_obs_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rFactorObsNoCutoff;
        @XmlElementRef(name = "free_R_error_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRErrorNoCutoff;
        @XmlElementRef(name = "free_R_factor_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRFactor4SigCutoff;
        @XmlElementRef(name = "free_R_factor_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRFactorNoCutoff;
        @XmlElementRef(name = "free_R_val_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRVal4SigCutoff;
        @XmlElementRef(name = "free_R_val_test_set_ct_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRValTestSetCt4SigCutoff;
        @XmlElementRef(name = "free_R_val_test_set_ct_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRValTestSetCtNoCutoff;
        @XmlElementRef(name = "free_R_val_test_set_size_perc_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRValTestSetSizePerc4SigCutoff;
        @XmlElementRef(name = "free_R_val_test_set_size_perc_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> freeRValTestSetSizePercNoCutoff;
        @XmlElementRef(name = "number_reflns_obs_4sig_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> numberReflnsObs4SigCutoff;
        @XmlElementRef(name = "number_reflns_obs_no_cutoff", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> numberReflnsObsNoCutoff;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "pdbx_refine_id", required = true)
        protected String pdbxRefineId;

        /**
         * Gets the value of the rFactorAll4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorAll4SigCutoff() {
            return rFactorAll4SigCutoff;
        }

        /**
         * Sets the value of the rFactorAll4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorAll4SigCutoff(JAXBElement<BigDecimal> value) {
            this.rFactorAll4SigCutoff = value;
        }

        /**
         * Gets the value of the rFactorAllNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorAllNoCutoff() {
            return rFactorAllNoCutoff;
        }

        /**
         * Sets the value of the rFactorAllNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorAllNoCutoff(JAXBElement<BigDecimal> value) {
            this.rFactorAllNoCutoff = value;
        }

        /**
         * Gets the value of the rFactorObs4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorObs4SigCutoff() {
            return rFactorObs4SigCutoff;
        }

        /**
         * Sets the value of the rFactorObs4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorObs4SigCutoff(JAXBElement<BigDecimal> value) {
            this.rFactorObs4SigCutoff = value;
        }

        /**
         * Gets the value of the rFactorObsNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRFactorObsNoCutoff() {
            return rFactorObsNoCutoff;
        }

        /**
         * Sets the value of the rFactorObsNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRFactorObsNoCutoff(JAXBElement<BigDecimal> value) {
            this.rFactorObsNoCutoff = value;
        }

        /**
         * Gets the value of the freeRErrorNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRErrorNoCutoff() {
            return freeRErrorNoCutoff;
        }

        /**
         * Sets the value of the freeRErrorNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRErrorNoCutoff(JAXBElement<BigDecimal> value) {
            this.freeRErrorNoCutoff = value;
        }

        /**
         * Gets the value of the freeRFactor4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRFactor4SigCutoff() {
            return freeRFactor4SigCutoff;
        }

        /**
         * Sets the value of the freeRFactor4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRFactor4SigCutoff(JAXBElement<BigDecimal> value) {
            this.freeRFactor4SigCutoff = value;
        }

        /**
         * Gets the value of the freeRFactorNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRFactorNoCutoff() {
            return freeRFactorNoCutoff;
        }

        /**
         * Sets the value of the freeRFactorNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRFactorNoCutoff(JAXBElement<BigDecimal> value) {
            this.freeRFactorNoCutoff = value;
        }

        /**
         * Gets the value of the freeRVal4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRVal4SigCutoff() {
            return freeRVal4SigCutoff;
        }

        /**
         * Sets the value of the freeRVal4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRVal4SigCutoff(JAXBElement<BigDecimal> value) {
            this.freeRVal4SigCutoff = value;
        }

        /**
         * Gets the value of the freeRValTestSetCt4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRValTestSetCt4SigCutoff() {
            return freeRValTestSetCt4SigCutoff;
        }

        /**
         * Sets the value of the freeRValTestSetCt4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRValTestSetCt4SigCutoff(JAXBElement<BigDecimal> value) {
            this.freeRValTestSetCt4SigCutoff = value;
        }

        /**
         * Gets the value of the freeRValTestSetCtNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRValTestSetCtNoCutoff() {
            return freeRValTestSetCtNoCutoff;
        }

        /**
         * Sets the value of the freeRValTestSetCtNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRValTestSetCtNoCutoff(JAXBElement<BigDecimal> value) {
            this.freeRValTestSetCtNoCutoff = value;
        }

        /**
         * Gets the value of the freeRValTestSetSizePerc4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRValTestSetSizePerc4SigCutoff() {
            return freeRValTestSetSizePerc4SigCutoff;
        }

        /**
         * Sets the value of the freeRValTestSetSizePerc4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRValTestSetSizePerc4SigCutoff(JAXBElement<BigDecimal> value) {
            this.freeRValTestSetSizePerc4SigCutoff = value;
        }

        /**
         * Gets the value of the freeRValTestSetSizePercNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFreeRValTestSetSizePercNoCutoff() {
            return freeRValTestSetSizePercNoCutoff;
        }

        /**
         * Sets the value of the freeRValTestSetSizePercNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFreeRValTestSetSizePercNoCutoff(JAXBElement<BigDecimal> value) {
            this.freeRValTestSetSizePercNoCutoff = value;
        }

        /**
         * Gets the value of the numberReflnsObs4SigCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getNumberReflnsObs4SigCutoff() {
            return numberReflnsObs4SigCutoff;
        }

        /**
         * Sets the value of the numberReflnsObs4SigCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setNumberReflnsObs4SigCutoff(JAXBElement<BigDecimal> value) {
            this.numberReflnsObs4SigCutoff = value;
        }

        /**
         * Gets the value of the numberReflnsObsNoCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getNumberReflnsObsNoCutoff() {
            return numberReflnsObsNoCutoff;
        }

        /**
         * Sets the value of the numberReflnsObsNoCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setNumberReflnsObsNoCutoff(JAXBElement<BigDecimal> value) {
            this.numberReflnsObsNoCutoff = value;
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
         * Gets the value of the pdbxRefineId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPdbxRefineId() {
            return pdbxRefineId;
        }

        /**
         * Sets the value of the pdbxRefineId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPdbxRefineId(String value) {
            this.pdbxRefineId = value;
        }

    }

}
