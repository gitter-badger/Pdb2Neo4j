//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Additional features associated with the chemical component.
 * 
 *     Example 1 - 
 * <PDBx:pdbx_chem_comp_model_featureCategory>
 *    <PDBx:pdbx_chem_comp_model_feature feature_name="experiment_temperature" model_id="M_ZZV_00001">
 *       <PDBx:feature_value>218.0</PDBx:feature_value>
 *    </PDBx:pdbx_chem_comp_model_feature>
 *    <PDBx:pdbx_chem_comp_model_feature feature_name="publication_doi" model_id="M_ZZV_00001">
 *       <PDBx:feature_value>10.1016/j.bmcl.2008.01.018</PDBx:feature_value>
 *    </PDBx:pdbx_chem_comp_model_feature>
 *    <PDBx:pdbx_chem_comp_model_feature feature_name="r_factor" model_id="M_ZZV_00001">
 *       <PDBx:feature_value>6.92</PDBx:feature_value>
 *    </PDBx:pdbx_chem_comp_model_feature>
 *    <PDBx:pdbx_chem_comp_model_feature feature_name="all_atoms_have_sites" model_id="M_ZZV_00001">
 *       <PDBx:feature_value>Y</PDBx:feature_value>
 *    </PDBx:pdbx_chem_comp_model_feature>
 *    <PDBx:pdbx_chem_comp_model_feature feature_name="has_disorder" model_id="M_ZZV_00001">
 *       <PDBx:feature_value>Y</PDBx:feature_value>
 *    </PDBx:pdbx_chem_comp_model_feature>
 * </PDBx:pdbx_chem_comp_model_featureCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for pdbx_chem_comp_model_featureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_chem_comp_model_featureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_chem_comp_model_feature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="feature_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *                 &lt;attribute name="feature_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "pdbx_chem_comp_model_featureType", propOrder = {
    "pdbxChemCompModelFeature"
})
public class PdbxChemCompModelFeatureType {

    @XmlElement(name = "pdbx_chem_comp_model_feature")
    protected List<PdbxChemCompModelFeatureType.PdbxChemCompModelFeature> pdbxChemCompModelFeature;

    /**
     * Gets the value of the pdbxChemCompModelFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxChemCompModelFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxChemCompModelFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxChemCompModelFeatureType.PdbxChemCompModelFeature }
     * 
     * 
     */
    public List<PdbxChemCompModelFeatureType.PdbxChemCompModelFeature> getPdbxChemCompModelFeature() {
        if (pdbxChemCompModelFeature == null) {
            pdbxChemCompModelFeature = new ArrayList<PdbxChemCompModelFeatureType.PdbxChemCompModelFeature>();
        }
        return this.pdbxChemCompModelFeature;
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
     *         &lt;element name="feature_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *       &lt;attribute name="feature_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="model_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PdbxChemCompModelFeature {

        @XmlElement(name = "feature_value", required = true)
        protected String featureValue;
        @XmlAttribute(name = "feature_name", required = true)
        protected String featureName;
        @XmlAttribute(name = "model_id", required = true)
        protected String modelId;

        /**
         * Gets the value of the featureValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureValue() {
            return featureValue;
        }

        /**
         * Sets the value of the featureValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureValue(String value) {
            this.featureValue = value;
        }

        /**
         * Gets the value of the featureName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureName() {
            return featureName;
        }

        /**
         * Sets the value of the featureName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureName(String value) {
            this.featureName = value;
        }

        /**
         * Gets the value of the modelId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelId() {
            return modelId;
        }

        /**
         * Sets the value of the modelId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelId(String value) {
            this.modelId = value;
        }

    }

}