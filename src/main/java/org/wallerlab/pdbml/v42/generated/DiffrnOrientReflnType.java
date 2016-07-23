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
 * Data items in the DIFFRN_ORIENT_REFLN category record details
 * about the reflections that define the orientation matrix used in
 * the measurement of the diffraction intensities.
 * 
 *     Example 1 - based on CAD-4 diffractometer data obtained for
 *                 Yb(S-C5H4N)2(THF)4.
 * <PDBx:diffrn_orient_reflnCategory>
 *    <PDBx:diffrn_orient_refln diffrn_id="myset1" index_h="2" index_k="0" index_l="2">
 *       <PDBx:angle_chi>-28.45</PDBx:angle_chi>
 *       <PDBx:angle_kappa>-11.32</PDBx:angle_kappa>
 *       <PDBx:angle_omega>5.33</PDBx:angle_omega>
 *       <PDBx:angle_phi>101.78</PDBx:angle_phi>
 *       <PDBx:angle_psi>0.00</PDBx:angle_psi>
 *       <PDBx:angle_theta>10.66</PDBx:angle_theta>
 *    </PDBx:diffrn_orient_refln>
 * </PDBx:diffrn_orient_reflnCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for diffrn_orient_reflnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diffrn_orient_reflnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diffrn_orient_refln" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="angle_chi" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="angle_kappa" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="angle_omega" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="angle_phi" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="angle_psi" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="angle_theta" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "diffrn_orient_reflnType", propOrder = {
    "diffrnOrientRefln"
})
public class DiffrnOrientReflnType {

    @XmlElement(name = "diffrn_orient_refln")
    protected List<DiffrnOrientReflnType.DiffrnOrientRefln> diffrnOrientRefln;

    /**
     * Gets the value of the diffrnOrientRefln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diffrnOrientRefln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiffrnOrientRefln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiffrnOrientReflnType.DiffrnOrientRefln }
     * 
     * 
     */
    public List<DiffrnOrientReflnType.DiffrnOrientRefln> getDiffrnOrientRefln() {
        if (diffrnOrientRefln == null) {
            diffrnOrientRefln = new ArrayList<DiffrnOrientReflnType.DiffrnOrientRefln>();
        }
        return this.diffrnOrientRefln;
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
     *         &lt;element name="angle_chi" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="angle_kappa" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="angle_omega" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="angle_phi" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="angle_psi" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="angle_theta" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="diffrn_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class DiffrnOrientRefln {

        @XmlElementRef(name = "angle_chi", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleChi> angleChi;
        @XmlElementRef(name = "angle_kappa", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleKappa> angleKappa;
        @XmlElementRef(name = "angle_omega", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleOmega> angleOmega;
        @XmlElementRef(name = "angle_phi", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AnglePhi> anglePhi;
        @XmlElementRef(name = "angle_psi", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AnglePsi> anglePsi;
        @XmlElementRef(name = "angle_theta", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleTheta> angleTheta;
        @XmlAttribute(name = "diffrn_id", required = true)
        protected String diffrnId;
        @XmlAttribute(name = "index_h", required = true)
        protected BigInteger indexH;
        @XmlAttribute(name = "index_k", required = true)
        protected BigInteger indexK;
        @XmlAttribute(name = "index_l", required = true)
        protected BigInteger indexL;

        /**
         * Gets the value of the angleChi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleChi }{@code >}
         *     
         */
        public JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleChi> getAngleChi() {
            return angleChi;
        }

        /**
         * Sets the value of the angleChi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleChi }{@code >}
         *     
         */
        public void setAngleChi(JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleChi> value) {
            this.angleChi = value;
        }

        /**
         * Gets the value of the angleKappa property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleKappa }{@code >}
         *     
         */
        public JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleKappa> getAngleKappa() {
            return angleKappa;
        }

        /**
         * Sets the value of the angleKappa property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleKappa }{@code >}
         *     
         */
        public void setAngleKappa(JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleKappa> value) {
            this.angleKappa = value;
        }

        /**
         * Gets the value of the angleOmega property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleOmega }{@code >}
         *     
         */
        public JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleOmega> getAngleOmega() {
            return angleOmega;
        }

        /**
         * Sets the value of the angleOmega property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleOmega }{@code >}
         *     
         */
        public void setAngleOmega(JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleOmega> value) {
            this.angleOmega = value;
        }

        /**
         * Gets the value of the anglePhi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AnglePhi }{@code >}
         *     
         */
        public JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AnglePhi> getAnglePhi() {
            return anglePhi;
        }

        /**
         * Sets the value of the anglePhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AnglePhi }{@code >}
         *     
         */
        public void setAnglePhi(JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AnglePhi> value) {
            this.anglePhi = value;
        }

        /**
         * Gets the value of the anglePsi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AnglePsi }{@code >}
         *     
         */
        public JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AnglePsi> getAnglePsi() {
            return anglePsi;
        }

        /**
         * Sets the value of the anglePsi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AnglePsi }{@code >}
         *     
         */
        public void setAnglePsi(JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AnglePsi> value) {
            this.anglePsi = value;
        }

        /**
         * Gets the value of the angleTheta property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleTheta }{@code >}
         *     
         */
        public JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleTheta> getAngleTheta() {
            return angleTheta;
        }

        /**
         * Sets the value of the angleTheta property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link DiffrnOrientReflnType.DiffrnOrientRefln.AngleTheta }{@code >}
         *     
         */
        public void setAngleTheta(JAXBElement<DiffrnOrientReflnType.DiffrnOrientRefln.AngleTheta> value) {
            this.angleTheta = value;
        }

        /**
         * Gets the value of the diffrnId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiffrnId() {
            return diffrnId;
        }

        /**
         * Sets the value of the diffrnId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiffrnId(String value) {
            this.diffrnId = value;
        }

        /**
         * Gets the value of the indexH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexH() {
            return indexH;
        }

        /**
         * Sets the value of the indexH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexH(BigInteger value) {
            this.indexH = value;
        }

        /**
         * Gets the value of the indexK property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexK() {
            return indexK;
        }

        /**
         * Sets the value of the indexK property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexK(BigInteger value) {
            this.indexK = value;
        }

        /**
         * Gets the value of the indexL property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexL() {
            return indexL;
        }

        /**
         * Sets the value of the indexL property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexL(BigInteger value) {
            this.indexL = value;
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class AngleChi {

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
                    return "degrees";
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class AngleKappa {

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
                    return "degrees";
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class AngleOmega {

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
                    return "degrees";
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class AnglePhi {

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
                    return "degrees";
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class AnglePsi {

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
                    return "degrees";
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="degrees" />
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
        public static class AngleTheta {

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
                    return "degrees";
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