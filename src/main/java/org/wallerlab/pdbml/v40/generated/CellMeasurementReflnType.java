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
 * Data items in the CELL_MEASUREMENT_REFLN category record
 * details about the reflections used to determine the
 * crystallographic cell parameters.
 * 
 * The CELL_MEASUREMENT_REFLN data items would in general be used
 * only for diffractometer data.
 * 
 *     Example 1 - extracted from the CAD-4 listing of Rb~2~S~2~O~6~ at room
 *                 temperature (unpublished).
 * <PDBx:cell_measurement_reflnCategory>
 *    <PDBx:cell_measurement_refln index_h="-2" index_k="4" index_l="1">
 *       <PDBx:theta>8.67</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="0" index_k="3" index_l="2">
 *       <PDBx:theta>9.45</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="3" index_k="0" index_l="2">
 *       <PDBx:theta>9.46</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="-3" index_k="4" index_l="1">
 *       <PDBx:theta>8.93</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="-2" index_k="1" index_l="-2">
 *       <PDBx:theta>7.53</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="10" index_k="0" index_l="0">
 *       <PDBx:theta>23.77</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="0" index_k="10" index_l="0">
 *       <PDBx:theta>23.78</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 *    <PDBx:cell_measurement_refln index_h="-5" index_k="4" index_l="1">
 *       <PDBx:theta>11.14</PDBx:theta>
 *    </PDBx:cell_measurement_refln>
 * </PDBx:cell_measurement_reflnCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for cell_measurement_reflnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cell_measurement_reflnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cell_measurement_refln" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="theta" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;union>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minInclusive value="90.0"/>
 *                             &lt;maxInclusive value="90.0"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;minExclusive value="0.0"/>
 *                             &lt;maxExclusive value="90.0"/>
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
 *                 &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "cell_measurement_reflnType", propOrder = {
    "cellMeasurementRefln"
})
public class CellMeasurementReflnType {

    @XmlElement(name = "cell_measurement_refln")
    protected List<CellMeasurementReflnType.CellMeasurementRefln> cellMeasurementRefln;

    /**
     * Gets the value of the cellMeasurementRefln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellMeasurementRefln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellMeasurementRefln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellMeasurementReflnType.CellMeasurementRefln }
     * 
     * 
     */
    public List<CellMeasurementReflnType.CellMeasurementRefln> getCellMeasurementRefln() {
        if (cellMeasurementRefln == null) {
            cellMeasurementRefln = new ArrayList<CellMeasurementReflnType.CellMeasurementRefln>();
        }
        return this.cellMeasurementRefln;
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
     *         &lt;element name="theta" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;union>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minInclusive value="90.0"/>
     *                   &lt;maxInclusive value="90.0"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                   &lt;minExclusive value="0.0"/>
     *                   &lt;maxExclusive value="90.0"/>
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
     *       &lt;attribute name="index_h" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_k" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="index_l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class CellMeasurementRefln {

        @XmlElementRef(name = "theta", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> theta;
        @XmlAttribute(name = "index_h", required = true)
        protected BigInteger indexH;
        @XmlAttribute(name = "index_k", required = true)
        protected BigInteger indexK;
        @XmlAttribute(name = "index_l", required = true)
        protected BigInteger indexL;

        /**
         * Gets the value of the theta property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTheta() {
            return theta;
        }

        /**
         * Sets the value of the theta property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTheta(JAXBElement<String> value) {
            this.theta = value;
        }

        /**
         * Gets the value of the indexH property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexH() {
            return indexH;
        }

        /**
         * Sets the value of the indexH property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexH(BigInteger value) {
            this.indexH = value;
        }

        /**
         * Gets the value of the indexK property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexK() {
            return indexK;
        }

        /**
         * Sets the value of the indexK property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexK(BigInteger value) {
            this.indexK = value;
        }

        /**
         * Gets the value of the indexL property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexL() {
            return indexL;
        }

        /**
         * Sets the value of the indexL property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexL(BigInteger value) {
            this.indexL = value;
        }

    }

}
