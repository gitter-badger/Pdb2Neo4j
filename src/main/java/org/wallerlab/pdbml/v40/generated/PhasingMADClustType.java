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
 * Data items in the PHASING_MAD_CLUST category record details
 * about a cluster of experiments that contributed to the
 * generation of a set of phases.
 * 
 *     Example 1 - based on a paper by Shapiro et al. [Nature (London)
 *                 (1995), 374, 327-337].
 * <PDBx:phasing_MAD_clustCategory>
 *    <PDBx:phasing_MAD_clust expt_id="1" id="4 wavelength">
 *       <PDBx:number_set>4</PDBx:number_set>
 *    </PDBx:phasing_MAD_clust>
 *    <PDBx:phasing_MAD_clust expt_id="1" id="5 wavelength">
 *       <PDBx:number_set>5</PDBx:number_set>
 *    </PDBx:phasing_MAD_clust>
 *    <PDBx:phasing_MAD_clust expt_id="2" id="5 wavelength">
 *       <PDBx:number_set>5</PDBx:number_set>
 *    </PDBx:phasing_MAD_clust>
 * </PDBx:phasing_MAD_clustCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for phasing_MAD_clustType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phasing_MAD_clustType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phasing_MAD_clust" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="number_set" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="expt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "phasing_MAD_clustType", propOrder = {
    "phasingMADClust"
})
public class PhasingMADClustType {

    @XmlElement(name = "phasing_MAD_clust")
    protected List<PhasingMADClustType.PhasingMADClust> phasingMADClust;

    /**
     * Gets the value of the phasingMADClust property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phasingMADClust property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhasingMADClust().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhasingMADClustType.PhasingMADClust }
     * 
     * 
     */
    public List<PhasingMADClustType.PhasingMADClust> getPhasingMADClust() {
        if (phasingMADClust == null) {
            phasingMADClust = new ArrayList<PhasingMADClustType.PhasingMADClust>();
        }
        return this.phasingMADClust;
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
     *         &lt;element name="number_set" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="expt_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PhasingMADClust {

        @XmlElementRef(name = "number_set", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigInteger> numberSet;
        @XmlAttribute(name = "expt_id", required = true)
        protected String exptId;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the numberSet property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public JAXBElement<BigInteger> getNumberSet() {
            return numberSet;
        }

        /**
         * Sets the value of the numberSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         *     
         */
        public void setNumberSet(JAXBElement<BigInteger> value) {
            this.numberSet = value;
        }

        /**
         * Gets the value of the exptId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExptId() {
            return exptId;
        }

        /**
         * Sets the value of the exptId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExptId(String value) {
            this.exptId = value;
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
