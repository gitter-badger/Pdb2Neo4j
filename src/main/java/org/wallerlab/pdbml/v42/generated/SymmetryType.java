//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Data items in the SYMMETRY category record details about the
 * space-group symmetry.
 * 
 *     Example 1 - based on PDB entry 5HVP and laboratory records for the
 *                 structure corresponding to PDB entry 5HVP.
 * <PDBx:symmetryCategory>
 *    <PDBx:symmetry entry_id="5HVP">
 *       <PDBx:Int_Tables_number>18</PDBx:Int_Tables_number>
 *       <PDBx:cell_setting>orthorhombic</PDBx:cell_setting>
 *       <PDBx:space_group_name_H-M>P 21 21 2</PDBx:space_group_name_H-M>
 *    </PDBx:symmetry>
 * </PDBx:symmetryCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for symmetryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="symmetryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="symmetry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Int_Tables_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="cell_setting" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="triclinic"/>
 *                         &lt;enumeration value="monoclinic"/>
 *                         &lt;enumeration value="orthorhombic"/>
 *                         &lt;enumeration value="tetragonal"/>
 *                         &lt;enumeration value="rhombohedral"/>
 *                         &lt;enumeration value="trigonal"/>
 *                         &lt;enumeration value="hexagonal"/>
 *                         &lt;enumeration value="cubic"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pdbx_full_space_group_name_H-M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="space_group_name_H-M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="space_group_name_Hall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "symmetryType", propOrder = {
    "symmetry"
})
public class SymmetryType {

    protected List<SymmetryType.Symmetry> symmetry;

    /**
     * Gets the value of the symmetry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symmetry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymmetry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymmetryType.Symmetry }
     * 
     * 
     */
    public List<SymmetryType.Symmetry> getSymmetry() {
        if (symmetry == null) {
            symmetry = new ArrayList<SymmetryType.Symmetry>();
        }
        return this.symmetry;
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
     *         &lt;element name="Int_Tables_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="cell_setting" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="triclinic"/>
     *               &lt;enumeration value="monoclinic"/>
     *               &lt;enumeration value="orthorhombic"/>
     *               &lt;enumeration value="tetragonal"/>
     *               &lt;enumeration value="rhombohedral"/>
     *               &lt;enumeration value="trigonal"/>
     *               &lt;enumeration value="hexagonal"/>
     *               &lt;enumeration value="cubic"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pdbx_full_space_group_name_H-M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="space_group_name_H-M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="space_group_name_Hall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Symmetry {

        @XmlElementRef(name = "Int_Tables_number", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> intTablesNumber;
        @XmlElementRef(name = "cell_setting", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> cellSetting;
        @XmlElementRef(name = "pdbx_full_space_group_name_H-M", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pdbxFullSpaceGroupNameHM;
        @XmlElementRef(name = "space_group_name_H-M", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> spaceGroupNameHM;
        @XmlElementRef(name = "space_group_name_Hall", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> spaceGroupNameHall;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the intTablesNumber property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getIntTablesNumber() {
            return intTablesNumber;
        }

        /**
         * Sets the value of the intTablesNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setIntTablesNumber(JAXBElement<BigInteger> value) {
            this.intTablesNumber = value;
        }

        /**
         * Gets the value of the cellSetting property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCellSetting() {
            return cellSetting;
        }

        /**
         * Sets the value of the cellSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCellSetting(JAXBElement<String> value) {
            this.cellSetting = value;
        }

        /**
         * Gets the value of the pdbxFullSpaceGroupNameHM property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPdbxFullSpaceGroupNameHM() {
            return pdbxFullSpaceGroupNameHM;
        }

        /**
         * Sets the value of the pdbxFullSpaceGroupNameHM property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPdbxFullSpaceGroupNameHM(JAXBElement<String> value) {
            this.pdbxFullSpaceGroupNameHM = value;
        }

        /**
         * Gets the value of the spaceGroupNameHM property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSpaceGroupNameHM() {
            return spaceGroupNameHM;
        }

        /**
         * Sets the value of the spaceGroupNameHM property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSpaceGroupNameHM(JAXBElement<String> value) {
            this.spaceGroupNameHM = value;
        }

        /**
         * Gets the value of the spaceGroupNameHall property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSpaceGroupNameHall() {
            return spaceGroupNameHall;
        }

        /**
         * Sets the value of the spaceGroupNameHall property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSpaceGroupNameHall(JAXBElement<String> value) {
            this.spaceGroupNameHall = value;
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

    }

}
