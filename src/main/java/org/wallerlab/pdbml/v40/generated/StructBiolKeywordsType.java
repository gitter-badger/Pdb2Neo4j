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
 * Data items in the STRUCT_BIOL_KEYWORDS category record
 * keywords that describe each biological unit.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_biol_keywordsCategory>
 *    <PDBx:struct_biol_keywords biol_id="1" text="aspartyl-protease"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="aspartic-protease"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="acid-protease"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="aspartyl-proteinase"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="aspartic-proteinase"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="acid-proteinase"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="enzyme"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="protease"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="proteinase"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="1" text="dimer"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="2" text="drug-enzyme complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="2" text="inhibitor-enzyme complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="2" text="drug-protease complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="2" text="inhibitor-protease complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="3" text="drug-enzyme complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="3" text="inhibitor-enzyme complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="3" text="drug-protease complex"></PDBx:struct_biol_keywords>
 *    <PDBx:struct_biol_keywords biol_id="3" text="inhibitor-protease complex"></PDBx:struct_biol_keywords>
 * </PDBx:struct_biol_keywordsCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_biol_keywordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_biol_keywordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_biol_keywords" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="biol_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "struct_biol_keywordsType", propOrder = {
    "structBiolKeywords"
})
public class StructBiolKeywordsType {

    @XmlElement(name = "struct_biol_keywords")
    protected List<StructBiolKeywordsType.StructBiolKeywords> structBiolKeywords;

    /**
     * Gets the value of the structBiolKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structBiolKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructBiolKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructBiolKeywordsType.StructBiolKeywords }
     * 
     * 
     */
    public List<StructBiolKeywordsType.StructBiolKeywords> getStructBiolKeywords() {
        if (structBiolKeywords == null) {
            structBiolKeywords = new ArrayList<StructBiolKeywordsType.StructBiolKeywords>();
        }
        return this.structBiolKeywords;
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
     *       &lt;attribute name="biol_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StructBiolKeywords {

        @XmlAttribute(name = "biol_id", required = true)
        protected String biolId;
        @XmlAttribute(name = "text", required = true)
        protected String text;

        /**
         * Gets the value of the biolId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiolId() {
            return biolId;
        }

        /**
         * Sets the value of the biolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiolId(String value) {
            this.biolId = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
