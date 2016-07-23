//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.22 at 05:23:04 PM EST 
//


package org.wallerlab.pdbml.v40.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the PDBX_FAMILY_GROUP_INDEX category record
 * the family membership in family groups.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_family_group_indexCategory>
 *    <PDBx:pdbx_family_group_index family_prd_id="FAM_0000001" id="FGR_0000001"></PDBx:pdbx_family_group_index>
 *    <PDBx:pdbx_family_group_index family_prd_id="FAM_0000002" id="FGR_0000001"></PDBx:pdbx_family_group_index>
 *    <PDBx:pdbx_family_group_index family_prd_id="FAM_0000021" id="FGR_0000001"></PDBx:pdbx_family_group_index>
 *    <PDBx:pdbx_family_group_index family_prd_id="FAM_0000022" id="FGR_0000002"></PDBx:pdbx_family_group_index>
 *    <PDBx:pdbx_family_group_index family_prd_id="FAM_0000023" id="FGR_0000002"></PDBx:pdbx_family_group_index>
 * </PDBx:pdbx_family_group_indexCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_family_group_indexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_family_group_indexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_family_group_index" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_family_group_indexType", propOrder = {
    "pdbxFamilyGroupIndex"
})
public class PdbxFamilyGroupIndexType {

    @XmlElement(name = "pdbx_family_group_index")
    protected List<PdbxFamilyGroupIndexType.PdbxFamilyGroupIndex> pdbxFamilyGroupIndex;

    /**
     * Gets the value of the pdbxFamilyGroupIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxFamilyGroupIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxFamilyGroupIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxFamilyGroupIndexType.PdbxFamilyGroupIndex }
     * 
     * 
     */
    public List<PdbxFamilyGroupIndexType.PdbxFamilyGroupIndex> getPdbxFamilyGroupIndex() {
        if (pdbxFamilyGroupIndex == null) {
            pdbxFamilyGroupIndex = new ArrayList<PdbxFamilyGroupIndexType.PdbxFamilyGroupIndex>();
        }
        return this.pdbxFamilyGroupIndex;
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
     *       &lt;attribute name="family_prd_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxFamilyGroupIndex {

        @XmlAttribute(name = "family_prd_id", required = true)
        protected String familyPrdId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the familyPrdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyPrdId() {
            return familyPrdId;
        }

        /**
         * Sets the value of the familyPrdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyPrdId(String value) {
            this.familyPrdId = value;
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