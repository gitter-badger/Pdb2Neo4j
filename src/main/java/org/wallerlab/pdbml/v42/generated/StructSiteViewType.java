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
 * Data items in the STRUCT_SITE_VIEW category record details
 * about how to draw and annotate an informative view of the
 * site.
 * 
 *     Example 1 - based on NDB structure GDL001 by Coll, Aymami,
 *                 Van Der Marel, Van Boom, Rich & Wang
 *                 [Biochemistry (1989), 28, 310-320].
 * <PDBx:struct_site_viewCategory>
 *    <PDBx:struct_site_view id="1">
 *       <PDBx:details> This view highlights the site of ATAT-Netropsin
 * interaction.</PDBx:details>
 *       <PDBx:rot_matrix11>0.132</PDBx:rot_matrix11>
 *       <PDBx:rot_matrix12>0.922</PDBx:rot_matrix12>
 *       <PDBx:rot_matrix13>-0.363</PDBx:rot_matrix13>
 *       <PDBx:rot_matrix21>0.131</PDBx:rot_matrix21>
 *       <PDBx:rot_matrix22>-0.380</PDBx:rot_matrix22>
 *       <PDBx:rot_matrix23>-0.916</PDBx:rot_matrix23>
 *       <PDBx:rot_matrix31>-0.982</PDBx:rot_matrix31>
 *       <PDBx:rot_matrix32>0.073</PDBx:rot_matrix32>
 *       <PDBx:rot_matrix33>-0.172</PDBx:rot_matrix33>
 *    </PDBx:struct_site_view>
 * </PDBx:struct_site_viewCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_site_viewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_site_viewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_site_view" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rot_matrix11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix21" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix22" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix23" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix31" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix32" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rot_matrix33" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="site_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_site_viewType", propOrder = {
    "structSiteView"
})
public class StructSiteViewType {

    @XmlElement(name = "struct_site_view")
    protected List<StructSiteViewType.StructSiteView> structSiteView;

    /**
     * Gets the value of the structSiteView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structSiteView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructSiteView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructSiteViewType.StructSiteView }
     * 
     * 
     */
    public List<StructSiteViewType.StructSiteView> getStructSiteView() {
        if (structSiteView == null) {
            structSiteView = new ArrayList<StructSiteViewType.StructSiteView>();
        }
        return this.structSiteView;
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
     *         &lt;element name="rot_matrix11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix21" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix22" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix23" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix31" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix32" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rot_matrix33" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="site_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class StructSiteView {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "rot_matrix11", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix11;
        @XmlElementRef(name = "rot_matrix12", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix12;
        @XmlElementRef(name = "rot_matrix13", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix13;
        @XmlElementRef(name = "rot_matrix21", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix21;
        @XmlElementRef(name = "rot_matrix22", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix22;
        @XmlElementRef(name = "rot_matrix23", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix23;
        @XmlElementRef(name = "rot_matrix31", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix31;
        @XmlElementRef(name = "rot_matrix32", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix32;
        @XmlElementRef(name = "rot_matrix33", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rotMatrix33;
        @XmlElement(name = "site_id", required = true)
        protected String siteId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the rotMatrix11 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix11() {
            return rotMatrix11;
        }

        /**
         * Sets the value of the rotMatrix11 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix11(JAXBElement<BigDecimal> value) {
            this.rotMatrix11 = value;
        }

        /**
         * Gets the value of the rotMatrix12 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix12() {
            return rotMatrix12;
        }

        /**
         * Sets the value of the rotMatrix12 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix12(JAXBElement<BigDecimal> value) {
            this.rotMatrix12 = value;
        }

        /**
         * Gets the value of the rotMatrix13 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix13() {
            return rotMatrix13;
        }

        /**
         * Sets the value of the rotMatrix13 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix13(JAXBElement<BigDecimal> value) {
            this.rotMatrix13 = value;
        }

        /**
         * Gets the value of the rotMatrix21 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix21() {
            return rotMatrix21;
        }

        /**
         * Sets the value of the rotMatrix21 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix21(JAXBElement<BigDecimal> value) {
            this.rotMatrix21 = value;
        }

        /**
         * Gets the value of the rotMatrix22 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix22() {
            return rotMatrix22;
        }

        /**
         * Sets the value of the rotMatrix22 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix22(JAXBElement<BigDecimal> value) {
            this.rotMatrix22 = value;
        }

        /**
         * Gets the value of the rotMatrix23 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix23() {
            return rotMatrix23;
        }

        /**
         * Sets the value of the rotMatrix23 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix23(JAXBElement<BigDecimal> value) {
            this.rotMatrix23 = value;
        }

        /**
         * Gets the value of the rotMatrix31 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix31() {
            return rotMatrix31;
        }

        /**
         * Sets the value of the rotMatrix31 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix31(JAXBElement<BigDecimal> value) {
            this.rotMatrix31 = value;
        }

        /**
         * Gets the value of the rotMatrix32 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix32() {
            return rotMatrix32;
        }

        /**
         * Sets the value of the rotMatrix32 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix32(JAXBElement<BigDecimal> value) {
            this.rotMatrix32 = value;
        }

        /**
         * Gets the value of the rotMatrix33 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getRotMatrix33() {
            return rotMatrix33;
        }

        /**
         * Sets the value of the rotMatrix33 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setRotMatrix33(JAXBElement<BigDecimal> value) {
            this.rotMatrix33 = value;
        }

        /**
         * Gets the value of the siteId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteId() {
            return siteId;
        }

        /**
         * Sets the value of the siteId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteId(String value) {
            this.siteId = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
