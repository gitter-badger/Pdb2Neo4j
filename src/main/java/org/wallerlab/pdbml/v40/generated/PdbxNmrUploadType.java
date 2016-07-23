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
 * 
 * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
 * 
 *          
 * 
 * <p>Java class for pdbx_nmr_uploadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdbx_nmr_uploadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdbx_nmr_upload" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="data_file_category">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="assigned_chemical_shifts"/>
 *                         &lt;enumeration value="coupling_constants"/>
 *                         &lt;enumeration value="spectral_peak_list"/>
 *                         &lt;enumeration value="resonance_linker"/>
 *                         &lt;enumeration value="chem_shift_isotope_effect"/>
 *                         &lt;enumeration value="chem_shift_interaction_diff"/>
 *                         &lt;enumeration value="chem_shift_anisotropy"/>
 *                         &lt;enumeration value="theoretical_chem_shifts"/>
 *                         &lt;enumeration value="chem_shifts_calc_type"/>
 *                         &lt;enumeration value="RDCs"/>
 *                         &lt;enumeration value="dipolar_couplings"/>
 *                         &lt;enumeration value="spectral_density_values"/>
 *                         &lt;enumeration value="other_data_types"/>
 *                         &lt;enumeration value="chemical_rates"/>
 *                         &lt;enumeration value="H_exch_rates"/>
 *                         &lt;enumeration value="H_exch_protection_factors"/>
 *                         &lt;enumeration value="homonucl_NOEs"/>
 *                         &lt;enumeration value="heteronucl_NOEs"/>
 *                         &lt;enumeration value="heteronucl_T1_relaxation"/>
 *                         &lt;enumeration value="heteronucl_T1rho_relaxation"/>
 *                         &lt;enumeration value="heteronucl_T2_relaxation"/>
 *                         &lt;enumeration value="auto_relaxation"/>
 *                         &lt;enumeration value="dipole_dipole_relaxation"/>
 *                         &lt;enumeration value="dipole_dipole_cross_correlations"/>
 *                         &lt;enumeration value="dipole_CSA_cross_correlations"/>
 *                         &lt;enumeration value="order_parameters"/>
 *                         &lt;enumeration value="pH_titration"/>
 *                         &lt;enumeration value="pH_param_list"/>
 *                         &lt;enumeration value="D_H_fractionation_factors"/>
 *                         &lt;enumeration value="binding_data"/>
 *                         &lt;enumeration value="binding_param_list"/>
 *                         &lt;enumeration value="deduced_secd_struct_features"/>
 *                         &lt;enumeration value="deduced_hydrogen_bonds"/>
 *                         &lt;enumeration value="conformer_statistics"/>
 *                         &lt;enumeration value="constraint_statistics"/>
 *                         &lt;enumeration value="representative_conformer"/>
 *                         &lt;enumeration value="conformer_family_coord_set"/>
 *                         &lt;enumeration value="force_constants"/>
 *                         &lt;enumeration value="angular_order_parameters"/>
 *                         &lt;enumeration value="tertiary_struct_elements"/>
 *                         &lt;enumeration value="secondary_structs"/>
 *                         &lt;enumeration value="bond_annotation"/>
 *                         &lt;enumeration value="structure_interactions"/>
 *                         &lt;enumeration value="other_struct_features"/>
 *                         &lt;enumeration value="tensor"/>
 *                         &lt;enumeration value="interatomic_distance"/>
 *                         &lt;enumeration value="general_distance_constraints"/>
 *                         &lt;enumeration value="distance_constraints"/>
 *                         &lt;enumeration value="floating_chiral_stereo_assign"/>
 *                         &lt;enumeration value="torsion_angle_constraints"/>
 *                         &lt;enumeration value="RDC_constraints"/>
 *                         &lt;enumeration value="J_three_bond_constraints"/>
 *                         &lt;enumeration value="CA_CB_chem_shift_constraints"/>
 *                         &lt;enumeration value="H_chem_shift_constraints"/>
 *                         &lt;enumeration value="other_constraints"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="data_file_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="data_file_syntax" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="NMR-STAR 3.1"/>
 *                         &lt;enumeration value="NMR-STAR 2.1"/>
 *                         &lt;enumeration value="AMBER"/>
 *                         &lt;enumeration value="XPLOR"/>
 *                         &lt;enumeration value="TALOS"/>
 *                         &lt;enumeration value="CYANA"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *                 &lt;attribute name="data_file_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "pdbx_nmr_uploadType", propOrder = {
    "pdbxNmrUpload"
})
public class PdbxNmrUploadType {

    @XmlElement(name = "pdbx_nmr_upload")
    protected List<PdbxNmrUploadType.PdbxNmrUpload> pdbxNmrUpload;

    /**
     * Gets the value of the pdbxNmrUpload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdbxNmrUpload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdbxNmrUpload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdbxNmrUploadType.PdbxNmrUpload }
     * 
     * 
     */
    public List<PdbxNmrUploadType.PdbxNmrUpload> getPdbxNmrUpload() {
        if (pdbxNmrUpload == null) {
            pdbxNmrUpload = new ArrayList<PdbxNmrUploadType.PdbxNmrUpload>();
        }
        return this.pdbxNmrUpload;
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
     *         &lt;element name="data_file_category">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="assigned_chemical_shifts"/>
     *               &lt;enumeration value="coupling_constants"/>
     *               &lt;enumeration value="spectral_peak_list"/>
     *               &lt;enumeration value="resonance_linker"/>
     *               &lt;enumeration value="chem_shift_isotope_effect"/>
     *               &lt;enumeration value="chem_shift_interaction_diff"/>
     *               &lt;enumeration value="chem_shift_anisotropy"/>
     *               &lt;enumeration value="theoretical_chem_shifts"/>
     *               &lt;enumeration value="chem_shifts_calc_type"/>
     *               &lt;enumeration value="RDCs"/>
     *               &lt;enumeration value="dipolar_couplings"/>
     *               &lt;enumeration value="spectral_density_values"/>
     *               &lt;enumeration value="other_data_types"/>
     *               &lt;enumeration value="chemical_rates"/>
     *               &lt;enumeration value="H_exch_rates"/>
     *               &lt;enumeration value="H_exch_protection_factors"/>
     *               &lt;enumeration value="homonucl_NOEs"/>
     *               &lt;enumeration value="heteronucl_NOEs"/>
     *               &lt;enumeration value="heteronucl_T1_relaxation"/>
     *               &lt;enumeration value="heteronucl_T1rho_relaxation"/>
     *               &lt;enumeration value="heteronucl_T2_relaxation"/>
     *               &lt;enumeration value="auto_relaxation"/>
     *               &lt;enumeration value="dipole_dipole_relaxation"/>
     *               &lt;enumeration value="dipole_dipole_cross_correlations"/>
     *               &lt;enumeration value="dipole_CSA_cross_correlations"/>
     *               &lt;enumeration value="order_parameters"/>
     *               &lt;enumeration value="pH_titration"/>
     *               &lt;enumeration value="pH_param_list"/>
     *               &lt;enumeration value="D_H_fractionation_factors"/>
     *               &lt;enumeration value="binding_data"/>
     *               &lt;enumeration value="binding_param_list"/>
     *               &lt;enumeration value="deduced_secd_struct_features"/>
     *               &lt;enumeration value="deduced_hydrogen_bonds"/>
     *               &lt;enumeration value="conformer_statistics"/>
     *               &lt;enumeration value="constraint_statistics"/>
     *               &lt;enumeration value="representative_conformer"/>
     *               &lt;enumeration value="conformer_family_coord_set"/>
     *               &lt;enumeration value="force_constants"/>
     *               &lt;enumeration value="angular_order_parameters"/>
     *               &lt;enumeration value="tertiary_struct_elements"/>
     *               &lt;enumeration value="secondary_structs"/>
     *               &lt;enumeration value="bond_annotation"/>
     *               &lt;enumeration value="structure_interactions"/>
     *               &lt;enumeration value="other_struct_features"/>
     *               &lt;enumeration value="tensor"/>
     *               &lt;enumeration value="interatomic_distance"/>
     *               &lt;enumeration value="general_distance_constraints"/>
     *               &lt;enumeration value="distance_constraints"/>
     *               &lt;enumeration value="floating_chiral_stereo_assign"/>
     *               &lt;enumeration value="torsion_angle_constraints"/>
     *               &lt;enumeration value="RDC_constraints"/>
     *               &lt;enumeration value="J_three_bond_constraints"/>
     *               &lt;enumeration value="CA_CB_chem_shift_constraints"/>
     *               &lt;enumeration value="H_chem_shift_constraints"/>
     *               &lt;enumeration value="other_constraints"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="data_file_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="data_file_syntax" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="NMR-STAR 3.1"/>
     *               &lt;enumeration value="NMR-STAR 2.1"/>
     *               &lt;enumeration value="AMBER"/>
     *               &lt;enumeration value="XPLOR"/>
     *               &lt;enumeration value="TALOS"/>
     *               &lt;enumeration value="CYANA"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *       &lt;attribute name="data_file_id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class PdbxNmrUpload {

        @XmlElement(name = "data_file_category", required = true)
        protected String dataFileCategory;
        @XmlElement(name = "data_file_name", required = true)
        protected String dataFileName;
        @XmlElementRef(name = "data_file_syntax", namespace = "http://pdbml.pdb.org/schema/pdbx-v40.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> dataFileSyntax;
        @XmlAttribute(name = "data_file_id", required = true)
        protected BigInteger dataFileId;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the dataFileCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataFileCategory() {
            return dataFileCategory;
        }

        /**
         * Sets the value of the dataFileCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataFileCategory(String value) {
            this.dataFileCategory = value;
        }

        /**
         * Gets the value of the dataFileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataFileName() {
            return dataFileName;
        }

        /**
         * Sets the value of the dataFileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataFileName(String value) {
            this.dataFileName = value;
        }

        /**
         * Gets the value of the dataFileSyntax property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDataFileSyntax() {
            return dataFileSyntax;
        }

        /**
         * Sets the value of the dataFileSyntax property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDataFileSyntax(JAXBElement<String> value) {
            this.dataFileSyntax = value;
        }

        /**
         * Gets the value of the dataFileId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDataFileId() {
            return dataFileId;
        }

        /**
         * Sets the value of the dataFileId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDataFileId(BigInteger value) {
            this.dataFileId = value;
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