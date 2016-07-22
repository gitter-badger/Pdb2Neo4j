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
 * Data items in the VALENCE_PARAM category define the
 * parameters used for calculating bond valences from bond
 * lengths.  In addition to the parameters, a pointer
 * is given to the reference (in VALENCE_REF) from which
 * the bond-valence parameters were taken.
 * 
 *     Example 1 - a bond-valence parameter list with accompanying references.
 * <PDBx:valence_paramCategory>
 *    <PDBx:valence_param atom_1="Cu" atom_1_valence="2" atom_2="O" atom_2_valence="-2">
 *       <PDBx:B>0.37</PDBx:B>
 *       <PDBx:Ro>1.679</PDBx:Ro>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:ref_id>a</PDBx:ref_id>
 *    </PDBx:valence_param>
 *    <PDBx:valence_param atom_1="Cu" atom_1_valence="2" atom_2="O" atom_2_valence="-2">
 *       <PDBx:B>0.37</PDBx:B>
 *       <PDBx:Ro>1.649</PDBx:Ro>
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:ref_id>j</PDBx:ref_id>
 *    </PDBx:valence_param>
 *    <PDBx:valence_param atom_1="Cu" atom_1_valence="2" atom_2="N" atom_2_valence="-3">
 *       <PDBx:B>0.37</PDBx:B>
 *       <PDBx:Ro>1.64</PDBx:Ro>
 *       <PDBx:details>2-coordinate N</PDBx:details>
 *       <PDBx:ref_id>m</PDBx:ref_id>
 *    </PDBx:valence_param>
 *    <PDBx:valence_param atom_1="Cu" atom_1_valence="2" atom_2="N" atom_2_valence="-3">
 *       <PDBx:B>0.37</PDBx:B>
 *       <PDBx:Ro>1.76</PDBx:Ro>
 *       <PDBx:details>3-coordinate N</PDBx:details>
 *       <PDBx:ref_id>m</PDBx:ref_id>
 *    </PDBx:valence_param>
 * </PDBx:valence_paramCategory>
 * <PDBx:valence_refCategory>
 *    <PDBx:valence_ref id="a">
 *       <PDBx:reference>Brown &amp; Altermatt (1985), Acta Cryst. B41, 244-247</PDBx:reference>
 *    </PDBx:valence_ref>
 *    <PDBx:valence_ref id="j">
 *       <PDBx:reference>Liu &amp; Thorp (1993), Inorg. Chem. 32, 4102-4205</PDBx:reference>
 *    </PDBx:valence_ref>
 *    <PDBx:valence_ref id="m">
 *       <PDBx:reference>See, Krause &amp; Strub (1998), Inorg. Chem. 37, 5369-5375</PDBx:reference>
 *    </PDBx:valence_ref>
 * </PDBx:valence_refCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for valence_paramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valence_paramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valence_param" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="B" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ro" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ref_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="atom_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_1_valence" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="atom_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="atom_2_valence" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "valence_paramType", propOrder = {
    "valenceParam"
})
public class ValenceParamType {

    @XmlElement(name = "valence_param")
    protected List<ValenceParamType.ValenceParam> valenceParam;

    /**
     * Gets the value of the valenceParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valenceParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValenceParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValenceParamType.ValenceParam }
     * 
     * 
     */
    public List<ValenceParamType.ValenceParam> getValenceParam() {
        if (valenceParam == null) {
            valenceParam = new ArrayList<ValenceParamType.ValenceParam>();
        }
        return this.valenceParam;
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
     *         &lt;element name="B" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ro" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ref_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="atom_1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_1_valence" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="atom_2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="atom_2_valence" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class ValenceParam {

        @XmlElementRef(name = "B", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ValenceParamType.ValenceParam.B> b;
        @XmlElementRef(name = "Ro", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<ValenceParamType.ValenceParam.Ro> ro;
        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> id;
        @XmlElementRef(name = "ref_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> refId;
        @XmlAttribute(name = "atom_1", required = true)
        protected String atom1;
        @XmlAttribute(name = "atom_1_valence", required = true)
        protected BigInteger atom1Valence;
        @XmlAttribute(name = "atom_2", required = true)
        protected String atom2;
        @XmlAttribute(name = "atom_2_valence", required = true)
        protected BigInteger atom2Valence;

        /**
         * Gets the value of the b property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ValenceParamType.ValenceParam.B }{@code >}
         *     
         */
        public JAXBElement<ValenceParamType.ValenceParam.B> getB() {
            return b;
        }

        /**
         * Sets the value of the b property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ValenceParamType.ValenceParam.B }{@code >}
         *     
         */
        public void setB(JAXBElement<ValenceParamType.ValenceParam.B> value) {
            this.b = value;
        }

        /**
         * Gets the value of the ro property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ValenceParamType.ValenceParam.Ro }{@code >}
         *     
         */
        public JAXBElement<ValenceParamType.ValenceParam.Ro> getRo() {
            return ro;
        }

        /**
         * Sets the value of the ro property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ValenceParamType.ValenceParam.Ro }{@code >}
         *     
         */
        public void setRo(JAXBElement<ValenceParamType.ValenceParam.Ro> value) {
            this.ro = value;
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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setId(JAXBElement<String> value) {
            this.id = value;
        }

        /**
         * Gets the value of the refId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRefId() {
            return refId;
        }

        /**
         * Sets the value of the refId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRefId(JAXBElement<String> value) {
            this.refId = value;
        }

        /**
         * Gets the value of the atom1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtom1() {
            return atom1;
        }

        /**
         * Sets the value of the atom1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtom1(String value) {
            this.atom1 = value;
        }

        /**
         * Gets the value of the atom1Valence property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAtom1Valence() {
            return atom1Valence;
        }

        /**
         * Sets the value of the atom1Valence property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAtom1Valence(BigInteger value) {
            this.atom1Valence = value;
        }

        /**
         * Gets the value of the atom2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAtom2() {
            return atom2;
        }

        /**
         * Sets the value of the atom2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAtom2(String value) {
            this.atom2 = value;
        }

        /**
         * Gets the value of the atom2Valence property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAtom2Valence() {
            return atom2Valence;
        }

        /**
         * Sets the value of the atom2Valence property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAtom2Valence(BigInteger value) {
            this.atom2Valence = value;
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
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
        public static class B {

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
                    return "angstroms";
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
         *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" fixed="angstroms" />
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
        public static class Ro {

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
                    return "angstroms";
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
