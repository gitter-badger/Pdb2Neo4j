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
 * Data items in the  EM_ENTITY_ASSEMBLY_LIST category record details
 * of the structural elements in each component.
 *   Example 1 - microtubule
 * <PDBx:em_entity_assembly_listCategory>
 *    <PDBx:em_entity_assembly_list entity_assembly_id="1" entity_id="1" id="1">
 *       <PDBx:number_of_copies>2</PDBx:number_of_copies>
 *       <PDBx:oligomeric_details>DIMER</PDBx:oligomeric_details>
 *    </PDBx:em_entity_assembly_list>
 * </PDBx:em_entity_assembly_listCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for em_entity_assembly_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="em_entity_assembly_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="em_entity_assembly_list" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="number_of_copies" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="oligomeric_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entity_assembly_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "em_entity_assembly_listType", propOrder = {
    "emEntityAssemblyList"
})
public class EmEntityAssemblyListType {

    @XmlElement(name = "em_entity_assembly_list")
    protected List<EmEntityAssemblyListType.EmEntityAssemblyList> emEntityAssemblyList;

    /**
     * Gets the value of the emEntityAssemblyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emEntityAssemblyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmEntityAssemblyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmEntityAssemblyListType.EmEntityAssemblyList }
     * 
     * 
     */
    public List<EmEntityAssemblyListType.EmEntityAssemblyList> getEmEntityAssemblyList() {
        if (emEntityAssemblyList == null) {
            emEntityAssemblyList = new ArrayList<EmEntityAssemblyListType.EmEntityAssemblyList>();
        }
        return this.emEntityAssemblyList;
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
     *         &lt;element name="number_of_copies" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="oligomeric_details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entity_assembly_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="entity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class EmEntityAssemblyList {

        @XmlElementRef(name = "number_of_copies", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberOfCopies;
        @XmlElementRef(name = "oligomeric_details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> oligomericDetails;
        @XmlAttribute(name = "entity_assembly_id", required = true)
        protected String entityAssemblyId;
        @XmlAttribute(name = "entity_id", required = true)
        protected String entityId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the numberOfCopies property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberOfCopies() {
            return numberOfCopies;
        }

        /**
         * Sets the value of the numberOfCopies property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberOfCopies(JAXBElement<BigInteger> value) {
            this.numberOfCopies = value;
        }

        /**
         * Gets the value of the oligomericDetails property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getOligomericDetails() {
            return oligomericDetails;
        }

        /**
         * Sets the value of the oligomericDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setOligomericDetails(JAXBElement<String> value) {
            this.oligomericDetails = value;
        }

        /**
         * Gets the value of the entityAssemblyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityAssemblyId() {
            return entityAssemblyId;
        }

        /**
         * Sets the value of the entityAssemblyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityAssemblyId(String value) {
            this.entityAssemblyId = value;
        }

        /**
         * Gets the value of the entityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityId() {
            return entityId;
        }

        /**
         * Sets the value of the entityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityId(String value) {
            this.entityId = value;
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
