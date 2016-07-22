//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.pdbml.v40.generated;

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
 * Data items in the REFINE_OCCUPANCY category record details
 * about the treatment of atom occupancies during refinement.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:refine_occupancyCategory>
 *    <PDBx:refine_occupancy class="protein" pdbx_refine_id="X-ray">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:treatment>fix</PDBx:treatment>
 *       <PDBx:value>1.00</PDBx:value>
 *    </PDBx:refine_occupancy>
 *    <PDBx:refine_occupancy class="solvent" pdbx_refine_id="X-ray">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:treatment>fix</PDBx:treatment>
 *       <PDBx:value>1.00</PDBx:value>
 *    </PDBx:refine_occupancy>
 *    <PDBx:refine_occupancy class="inhibitor orientation 1" pdbx_refine_id="X-ray">
 *       <PDBx:details xsi:nil="true" />
 *       <PDBx:treatment>fix</PDBx:treatment>
 *       <PDBx:value>0.65</PDBx:value>
 *    </PDBx:refine_occupancy>
 *    <PDBx:refine_occupancy class="inhibitor orientation 2" pdbx_refine_id="X-ray">
 *       <PDBx:details> The inhibitor binds to the enzyme in two alternative
 * conformations. The occupancy of each conformation was
 * adjusted so as to result in approximately equal mean
 * thermal factors for the atoms in each conformation.</PDBx:details>
 *       <PDBx:treatment>fix</PDBx:treatment>
 *       <PDBx:value>0.35</PDBx:value>
 *    </PDBx:refine_occupancy>
 * </PDBx:refine_occupancyCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for refine_occupancyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refine_occupancyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refine_occupancy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="treatment" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="fix"/>
 *                         &lt;enumeration value="ref"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="1.0"/>
 *                             &lt;maxInclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="1.0"/>
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
 *                 &lt;/all>
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "refine_occupancyType", propOrder = {
    "refineOccupancy"
})
public class RefineOccupancyType {

    @XmlElement(name = "refine_occupancy")
    protected List<RefineOccupancyType.RefineOccupancy> refineOccupancy;

    /**
     * Gets the value of the refineOccupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refineOccupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefineOccupancyType.RefineOccupancy }
     * 
     * 
     */
    public List<RefineOccupancyType.RefineOccupancy> getRefineOccupancy() {
        if (refineOccupancy == null) {
            refineOccupancy = new ArrayList<RefineOccupancyType.RefineOccupancy>();
        }
        return this.refineOccupancy;
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
     *         &lt;element name="treatment" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="fix"/>
     *               &lt;enumeration value="ref"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="1.0"/>
     *                   &lt;maxInclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="1.0"/>
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
     *       &lt;/all>
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class RefineOccupancy {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "treatment", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> treatment;
        @XmlElementRef(name = "value", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> value;
        @XmlAttribute(name = "class", required = true)
        protected String clazz;
        @XmlAttribute(name = "pdbx_refine_id", required = true)
        protected String pdbxRefineId;

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
         * Gets the value of the treatment property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTreatment() {
            return treatment;
        }

        /**
         * Sets the value of the treatment property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTreatment(JAXBElement<String> value) {
            this.treatment = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setValue(JAXBElement<String> value) {
            this.value = value;
        }

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
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
