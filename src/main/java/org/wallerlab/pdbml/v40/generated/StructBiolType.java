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
 * Data items in the STRUCT_BIOL category record details about
 * the structural elements that form each structure of biological
 * significance.
 * 
 * A given crystal structure may contain many different biological
 * structures. A given structural component in the asymmetric
 * unit may be part of more than one biological unit. A given
 * biological structure may involve crystallographic symmetry.
 * 
 * For instance, in a structure of a lysozyme-FAB structure, the
 * light- and heavy-chain components of the FAB could be one
 * biological unit, while the two chains of the FAB and the lysozyme
 * could constitute a second biological unit.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:struct_biolCategory>
 *    <PDBx:struct_biol id="1">
 *       <PDBx:details> significant deviations from twofold symmetry exist in this
 * dimeric enzyme</PDBx:details>
 *    </PDBx:struct_biol>
 *    <PDBx:struct_biol id="2">
 *       <PDBx:details> The drug binds to this enzyme in two roughly twofold
 * symmetric modes. Hence this biological unit (2) is roughly
 * twofold symmetric to biological unit (3). Disorder in the
 * protein chain indicated with alternative ID 1 should be
 * used with this biological unit.</PDBx:details>
 *    </PDBx:struct_biol>
 *    <PDBx:struct_biol id="3">
 *       <PDBx:details> The drug binds to this enzyme in two roughly twofold
 * symmetric modes. Hence this biological unit (3) is roughly
 * twofold symmetric to biological unit (2). Disorder in the
 * protein chain indicated with alternative ID 2 should be
 * used with this biological unit.</PDBx:details>
 *    </PDBx:struct_biol>
 * </PDBx:struct_biolCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for struct_biolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="struct_biolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="struct_biol" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_aggregation_state" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="MONOMER"/>
 *                         &lt;enumeration value="DIMER"/>
 *                         &lt;enumeration value="TRIMER"/>
 *                         &lt;enumeration value="TETRAMER"/>
 *                         &lt;enumeration value="HEXAMER"/>
 *                         &lt;enumeration value="MORE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_assembly_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_formula_weight" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="1.0"/>
 *                             &lt;maxInclusive value="1.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_formula_weight_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pdbx_parent_biol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "struct_biolType", propOrder = {
    "structBiol"
})
public class StructBiolType {

    @XmlElement(name = "struct_biol")
    protected List<StructBiolType.StructBiol> structBiol;

    /**
     * Gets the value of the structBiol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structBiol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructBiol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructBiolType.StructBiol }
     * 
     * 
     */
    public List<StructBiolType.StructBiol> getStructBiol() {
        if (structBiol == null) {
            structBiol = new ArrayList<StructBiolType.StructBiol>();
        }
        return this.structBiol;
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
     *         &lt;element name="pdbx_aggregation_state" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="MONOMER"/>
     *               &lt;enumeration value="DIMER"/>
     *               &lt;enumeration value="TRIMER"/>
     *               &lt;enumeration value="TETRAMER"/>
     *               &lt;enumeration value="HEXAMER"/>
     *               &lt;enumeration value="MORE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_assembly_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_formula_weight" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="1.0"/>
     *                   &lt;maxInclusive value="1.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_formula_weight_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pdbx_parent_biol_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class StructBiol {

        @XmlElementRef(name = "details", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> details;
        @XmlElementRef(name = "pdbx_aggregation_state", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAggregationState;
        @XmlElementRef(name = "pdbx_assembly_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxAssemblyMethod;
        @XmlElementRef(name = "pdbx_formula_weight", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxFormulaWeight;
        @XmlElementRef(name = "pdbx_formula_weight_method", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxFormulaWeightMethod;
        @XmlElementRef(name = "pdbx_parent_biol_id", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxParentBiolId;
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
         * Gets the value of the pdbxAggregationState property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAggregationState() {
            return pdbxAggregationState;
        }

        /**
         * Sets the value of the pdbxAggregationState property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAggregationState(JAXBElement<String> value) {
            this.pdbxAggregationState = value;
        }

        /**
         * Gets the value of the pdbxAssemblyMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxAssemblyMethod() {
            return pdbxAssemblyMethod;
        }

        /**
         * Sets the value of the pdbxAssemblyMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxAssemblyMethod(JAXBElement<String> value) {
            this.pdbxAssemblyMethod = value;
        }

        /**
         * Gets the value of the pdbxFormulaWeight property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxFormulaWeight() {
            return pdbxFormulaWeight;
        }

        /**
         * Sets the value of the pdbxFormulaWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxFormulaWeight(JAXBElement<String> value) {
            this.pdbxFormulaWeight = value;
        }

        /**
         * Gets the value of the pdbxFormulaWeightMethod property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxFormulaWeightMethod() {
            return pdbxFormulaWeightMethod;
        }

        /**
         * Sets the value of the pdbxFormulaWeightMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxFormulaWeightMethod(JAXBElement<String> value) {
            this.pdbxFormulaWeightMethod = value;
        }

        /**
         * Gets the value of the pdbxParentBiolId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxParentBiolId() {
            return pdbxParentBiolId;
        }

        /**
         * Sets the value of the pdbxParentBiolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxParentBiolId(JAXBElement<String> value) {
            this.pdbxParentBiolId = value;
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
