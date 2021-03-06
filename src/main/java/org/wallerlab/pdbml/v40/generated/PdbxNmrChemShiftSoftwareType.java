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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * Items in the chem_shift_software category provide pointers to the software category and methods category.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_chem_shift_softwareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_chem_shift_softwareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_chem_shift_software" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="assigned_chem_shift_list_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="software_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_nmr_chem_shift_softwareType", propOrder = {
    "pdbxNmrChemShiftSoftware"
})
public class PdbxNmrChemShiftSoftwareType {

    @XmlElement(name = "pdbx_nmr_chem_shift_software")
    protected List<PdbxNmrChemShiftSoftwareType.PdbxNmrChemShiftSoftware> pdbxNmrChemShiftSoftware;

    /**
     * Gets the value of the pdbxNmrChemShiftSoftware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrChemShiftSoftware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrChemShiftSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrChemShiftSoftwareType.PdbxNmrChemShiftSoftware }
     * 
     * 
     */
    public List<PdbxNmrChemShiftSoftwareType.PdbxNmrChemShiftSoftware> getPdbxNmrChemShiftSoftware() {
        if (pdbxNmrChemShiftSoftware == null) {
            pdbxNmrChemShiftSoftware = new ArrayList<PdbxNmrChemShiftSoftwareType.PdbxNmrChemShiftSoftware>();
        }
        return this.pdbxNmrChemShiftSoftware;
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
     *       &lt;attribute name="assigned_chem_shift_list_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="entry_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="software_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PdbxNmrChemShiftSoftware {

        @XmlAttribute(name = "assigned_chem_shift_list_id", required = true)
        protected BigInteger assignedChemShiftListId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;
        @XmlAttribute(name = "software_id", required = true)
        protected BigInteger softwareId;

        /**
         * Gets the value of the assignedChemShiftListId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAssignedChemShiftListId() {
            return assignedChemShiftListId;
        }

        /**
         * Sets the value of the assignedChemShiftListId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAssignedChemShiftListId(BigInteger value) {
            this.assignedChemShiftListId = value;
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

        /**
         * Gets the value of the softwareId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSoftwareId() {
            return softwareId;
        }

        /**
         * Sets the value of the softwareId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSoftwareId(BigInteger value) {
            this.softwareId = value;
        }

    }

}
