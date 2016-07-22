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
 * Data items in the CHEM_COMP_DESCRIPTOR category provide
 * string descriptors of component chemical structure.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_descriptorCategory>
 *    <PDBx:pdbx_chem_comp_descriptor comp_id="ATP" program="OPENEYE" program_version="1.5.0" type="SMILES">
 *       <PDBx:descriptor>c1nc(c2c(n1)n(cn2)C3C(C(C(O3)COP(=O)(O)OP(=O)(O)OP(=O)(O)O)O)O)N</PDBx:descriptor>
 *    </PDBx:pdbx_chem_comp_descriptor>
 * </PDBx:pdbx_chem_comp_descriptorCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_descriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_descriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_descriptor" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="program" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="program_version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SMILES_CANNONICAL"/>
 *                       &lt;enumeration value="SMILES_CANONICAL"/>
 *                       &lt;enumeration value="SMILES"/>
 *                       &lt;enumeration value="InChI"/>
 *                       &lt;enumeration value="InChI_MAIN"/>
 *                       &lt;enumeration value="InChI_MAIN_FORMULA"/>
 *                       &lt;enumeration value="InChI_MAIN_CONNECT"/>
 *                       &lt;enumeration value="InChI_MAIN_HATOM"/>
 *                       &lt;enumeration value="InChI_CHARGE"/>
 *                       &lt;enumeration value="InChI_STEREO"/>
 *                       &lt;enumeration value="InChI_ISOTOPE"/>
 *                       &lt;enumeration value="InChI_FIXEDH"/>
 *                       &lt;enumeration value="InChI_RECONNECT"/>
 *                       &lt;enumeration value="InChIKey"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "pdbx_chem_comp_descriptorType", propOrder = {
    "pdbxChemCompDescriptor"
})
public class PdbxChemCompDescriptorType {

    @XmlElement(name = "pdbx_chem_comp_descriptor")
    protected List<PdbxChemCompDescriptorType.PdbxChemCompDescriptor> pdbxChemCompDescriptor;

    /**
     * Gets the value of the pdbxChemCompDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompDescriptorType.PdbxChemCompDescriptor }
     * 
     * 
     */
    public List<PdbxChemCompDescriptorType.PdbxChemCompDescriptor> getPdbxChemCompDescriptor() {
        if (pdbxChemCompDescriptor == null) {
            pdbxChemCompDescriptor = new ArrayList<PdbxChemCompDescriptorType.PdbxChemCompDescriptor>();
        }
        return this.pdbxChemCompDescriptor;
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
     *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="comp_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="program" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="program_version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SMILES_CANNONICAL"/>
     *             &lt;enumeration value="SMILES_CANONICAL"/>
     *             &lt;enumeration value="SMILES"/>
     *             &lt;enumeration value="InChI"/>
     *             &lt;enumeration value="InChI_MAIN"/>
     *             &lt;enumeration value="InChI_MAIN_FORMULA"/>
     *             &lt;enumeration value="InChI_MAIN_CONNECT"/>
     *             &lt;enumeration value="InChI_MAIN_HATOM"/>
     *             &lt;enumeration value="InChI_CHARGE"/>
     *             &lt;enumeration value="InChI_STEREO"/>
     *             &lt;enumeration value="InChI_ISOTOPE"/>
     *             &lt;enumeration value="InChI_FIXEDH"/>
     *             &lt;enumeration value="InChI_RECONNECT"/>
     *             &lt;enumeration value="InChIKey"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class PdbxChemCompDescriptor {

        @XmlElement(required = true)
        protected String descriptor;
        @XmlElementRef(name = "ordinal", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> ordinal;
        @XmlAttribute(name = "comp_id", required = true)
        protected String compId;
        @XmlAttribute(name = "program", required = true)
        protected String program;
        @XmlAttribute(name = "program_version", required = true)
        protected String programVersion;
        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Gets the value of the descriptor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptor() {
            return descriptor;
        }

        /**
         * Sets the value of the descriptor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptor(String value) {
            this.descriptor = value;
        }

        /**
         * Gets the value of the ordinal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getOrdinal() {
            return ordinal;
        }

        /**
         * Sets the value of the ordinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setOrdinal(JAXBElement<BigInteger> value) {
            this.ordinal = value;
        }

        /**
         * Gets the value of the compId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompId() {
            return compId;
        }

        /**
         * Sets the value of the compId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompId(String value) {
            this.compId = value;
        }

        /**
         * Gets the value of the program property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgram() {
            return program;
        }

        /**
         * Sets the value of the program property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgram(String value) {
            this.program = value;
        }

        /**
         * Gets the value of the programVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramVersion() {
            return programVersion;
        }

        /**
         * Sets the value of the programVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramVersion(String value) {
            this.programVersion = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
