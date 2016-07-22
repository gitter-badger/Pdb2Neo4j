//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 06:37:17 PM CEST 
//


package org.wallerlab.pdbml.v42.generated;

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
 * Data items in the PUBL category are used when submitting a
 * manuscript for publication.
 * 
 *     Example 1 - based on data set TOZ of Willis, Beckwith & Tozer
 *                 [Acta Cryst. (1991), C47, 2276-2277].
 * <PDBx:publCategory>
 *    <PDBx:publ entry_id="1ABC">
 *       <PDBx:section_abstract>  The oxazolidinone ring is a shallow envelope
 * conformation with the tert-butyl and iso-butyl groups
 * occupying trans-positions with respect to the ring.  The
 * angles at the N atom sum to 356.2\&#37;, indicating a very
 * small degree of pyramidalization at this atom.  This is
 * consistent with electron delocalization between the N
 * atom and the carbonyl centre [N-C=O = 1.374(3)\&#37;A].</PDBx:section_abstract>
 *       <PDBx:section_title>  trans-3-Benzoyl-2-(tert-butyl)-4-(iso-butyl)-
 *  1,3-oxazolidin-5-one</PDBx:section_title>
 *    </PDBx:publ>
 * </PDBx:publCategory>
 * 
 * 
 *     Example 2 - based on C~31~H~48~N~4~O~4~, reported by Coleman, Patrick,
 *                 Andersen & Rettig [Acta Cryst. (1996), C52, 1525-1527].
 * <PDBx:publCategory>
 *    <PDBx:publ entry_id="1ABC">
 *       <PDBx:section_title>  Hemiasterlin methyl ester</PDBx:section_title>
 *       <PDBx:section_title_footnote>  IUPAC name: methyl 2,5-dimethyl-4-{2-[3-methyl-
 *  2-methylamino-3-(N-methylbenzo[b]pyrrol-
 *  3-yl)butanamido]-3,3-dimethyl-N-methyl-
 * butanamido}-2-hexenoate.</PDBx:section_title_footnote>
 *    </PDBx:publ>
 * </PDBx:publCategory>
 * 
 * 
 *          
 * 
 * <p>Java class for publType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="contact_author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact_author_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact_author_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact_author_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact_author_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact_author_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact_letter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="manuscript_creation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="manuscript_processed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="manuscript_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="requested_category" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="FA"/>
 *                         &lt;enumeration value="FI"/>
 *                         &lt;enumeration value="FO"/>
 *                         &lt;enumeration value="FM"/>
 *                         &lt;enumeration value="CI"/>
 *                         &lt;enumeration value="CO"/>
 *                         &lt;enumeration value="CM"/>
 *                         &lt;enumeration value="EI"/>
 *                         &lt;enumeration value="EO"/>
 *                         &lt;enumeration value="EM"/>
 *                         &lt;enumeration value="AD"/>
 *                         &lt;enumeration value="SC"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="requested_coeditor_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="requested_journal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_acknowledgements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_discussion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_experimental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_exptl_prep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_exptl_refinement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_exptl_solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_figure_captions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_references" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_synopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_table_legends" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section_title_footnote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "publType", propOrder = {
    "publ"
})
public class PublType {

    protected List<PublType.Publ> publ;

    /**
     * Gets the value of the publ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublType.Publ }
     * 
     * 
     */
    public List<PublType.Publ> getPubl() {
        if (publ == null) {
            publ = new ArrayList<PublType.Publ>();
        }
        return this.publ;
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
     *         &lt;element name="contact_author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact_author_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact_author_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact_author_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact_author_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact_author_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact_letter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="manuscript_creation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="manuscript_processed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="manuscript_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="requested_category" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="FA"/>
     *               &lt;enumeration value="FI"/>
     *               &lt;enumeration value="FO"/>
     *               &lt;enumeration value="FM"/>
     *               &lt;enumeration value="CI"/>
     *               &lt;enumeration value="CO"/>
     *               &lt;enumeration value="CM"/>
     *               &lt;enumeration value="EI"/>
     *               &lt;enumeration value="EO"/>
     *               &lt;enumeration value="EM"/>
     *               &lt;enumeration value="AD"/>
     *               &lt;enumeration value="SC"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="requested_coeditor_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="requested_journal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_acknowledgements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_discussion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_experimental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_exptl_prep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_exptl_refinement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_exptl_solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_figure_captions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_references" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_synopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_table_legends" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section_title_footnote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class Publ {

        @XmlElementRef(name = "contact_author", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactAuthor;
        @XmlElementRef(name = "contact_author_address", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactAuthorAddress;
        @XmlElementRef(name = "contact_author_email", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactAuthorEmail;
        @XmlElementRef(name = "contact_author_fax", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactAuthorFax;
        @XmlElementRef(name = "contact_author_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactAuthorName;
        @XmlElementRef(name = "contact_author_phone", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactAuthorPhone;
        @XmlElementRef(name = "contact_letter", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> contactLetter;
        @XmlElementRef(name = "manuscript_creation", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> manuscriptCreation;
        @XmlElementRef(name = "manuscript_processed", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> manuscriptProcessed;
        @XmlElementRef(name = "manuscript_text", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> manuscriptText;
        @XmlElementRef(name = "requested_category", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> requestedCategory;
        @XmlElementRef(name = "requested_coeditor_name", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> requestedCoeditorName;
        @XmlElementRef(name = "requested_journal", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> requestedJournal;
        @XmlElementRef(name = "section_abstract", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionAbstract;
        @XmlElementRef(name = "section_acknowledgements", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionAcknowledgements;
        @XmlElementRef(name = "section_comment", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionComment;
        @XmlElementRef(name = "section_discussion", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionDiscussion;
        @XmlElementRef(name = "section_experimental", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionExperimental;
        @XmlElementRef(name = "section_exptl_prep", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionExptlPrep;
        @XmlElementRef(name = "section_exptl_refinement", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionExptlRefinement;
        @XmlElementRef(name = "section_exptl_solution", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionExptlSolution;
        @XmlElementRef(name = "section_figure_captions", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionFigureCaptions;
        @XmlElementRef(name = "section_introduction", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionIntroduction;
        @XmlElementRef(name = "section_references", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionReferences;
        @XmlElementRef(name = "section_synopsis", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionSynopsis;
        @XmlElementRef(name = "section_table_legends", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionTableLegends;
        @XmlElementRef(name = "section_title", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionTitle;
        @XmlElementRef(name = "section_title_footnote", namespace = "http://pdbml.pdb.org/schema/pdbx-v42.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> sectionTitleFootnote;
        @XmlAttribute(name = "entry_id", required = true)
        protected String entryId;

        /**
         * Gets the value of the contactAuthor property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactAuthor() {
            return contactAuthor;
        }

        /**
         * Sets the value of the contactAuthor property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactAuthor(JAXBElement<String> value) {
            this.contactAuthor = value;
        }

        /**
         * Gets the value of the contactAuthorAddress property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactAuthorAddress() {
            return contactAuthorAddress;
        }

        /**
         * Sets the value of the contactAuthorAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactAuthorAddress(JAXBElement<String> value) {
            this.contactAuthorAddress = value;
        }

        /**
         * Gets the value of the contactAuthorEmail property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactAuthorEmail() {
            return contactAuthorEmail;
        }

        /**
         * Sets the value of the contactAuthorEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactAuthorEmail(JAXBElement<String> value) {
            this.contactAuthorEmail = value;
        }

        /**
         * Gets the value of the contactAuthorFax property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactAuthorFax() {
            return contactAuthorFax;
        }

        /**
         * Sets the value of the contactAuthorFax property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactAuthorFax(JAXBElement<String> value) {
            this.contactAuthorFax = value;
        }

        /**
         * Gets the value of the contactAuthorName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactAuthorName() {
            return contactAuthorName;
        }

        /**
         * Sets the value of the contactAuthorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactAuthorName(JAXBElement<String> value) {
            this.contactAuthorName = value;
        }

        /**
         * Gets the value of the contactAuthorPhone property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactAuthorPhone() {
            return contactAuthorPhone;
        }

        /**
         * Sets the value of the contactAuthorPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactAuthorPhone(JAXBElement<String> value) {
            this.contactAuthorPhone = value;
        }

        /**
         * Gets the value of the contactLetter property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getContactLetter() {
            return contactLetter;
        }

        /**
         * Sets the value of the contactLetter property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setContactLetter(JAXBElement<String> value) {
            this.contactLetter = value;
        }

        /**
         * Gets the value of the manuscriptCreation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getManuscriptCreation() {
            return manuscriptCreation;
        }

        /**
         * Sets the value of the manuscriptCreation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setManuscriptCreation(JAXBElement<String> value) {
            this.manuscriptCreation = value;
        }

        /**
         * Gets the value of the manuscriptProcessed property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getManuscriptProcessed() {
            return manuscriptProcessed;
        }

        /**
         * Sets the value of the manuscriptProcessed property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setManuscriptProcessed(JAXBElement<String> value) {
            this.manuscriptProcessed = value;
        }

        /**
         * Gets the value of the manuscriptText property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getManuscriptText() {
            return manuscriptText;
        }

        /**
         * Sets the value of the manuscriptText property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setManuscriptText(JAXBElement<String> value) {
            this.manuscriptText = value;
        }

        /**
         * Gets the value of the requestedCategory property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRequestedCategory() {
            return requestedCategory;
        }

        /**
         * Sets the value of the requestedCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRequestedCategory(JAXBElement<String> value) {
            this.requestedCategory = value;
        }

        /**
         * Gets the value of the requestedCoeditorName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRequestedCoeditorName() {
            return requestedCoeditorName;
        }

        /**
         * Sets the value of the requestedCoeditorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRequestedCoeditorName(JAXBElement<String> value) {
            this.requestedCoeditorName = value;
        }

        /**
         * Gets the value of the requestedJournal property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getRequestedJournal() {
            return requestedJournal;
        }

        /**
         * Sets the value of the requestedJournal property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setRequestedJournal(JAXBElement<String> value) {
            this.requestedJournal = value;
        }

        /**
         * Gets the value of the sectionAbstract property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionAbstract() {
            return sectionAbstract;
        }

        /**
         * Sets the value of the sectionAbstract property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionAbstract(JAXBElement<String> value) {
            this.sectionAbstract = value;
        }

        /**
         * Gets the value of the sectionAcknowledgements property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionAcknowledgements() {
            return sectionAcknowledgements;
        }

        /**
         * Sets the value of the sectionAcknowledgements property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionAcknowledgements(JAXBElement<String> value) {
            this.sectionAcknowledgements = value;
        }

        /**
         * Gets the value of the sectionComment property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionComment() {
            return sectionComment;
        }

        /**
         * Sets the value of the sectionComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionComment(JAXBElement<String> value) {
            this.sectionComment = value;
        }

        /**
         * Gets the value of the sectionDiscussion property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionDiscussion() {
            return sectionDiscussion;
        }

        /**
         * Sets the value of the sectionDiscussion property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionDiscussion(JAXBElement<String> value) {
            this.sectionDiscussion = value;
        }

        /**
         * Gets the value of the sectionExperimental property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionExperimental() {
            return sectionExperimental;
        }

        /**
         * Sets the value of the sectionExperimental property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionExperimental(JAXBElement<String> value) {
            this.sectionExperimental = value;
        }

        /**
         * Gets the value of the sectionExptlPrep property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionExptlPrep() {
            return sectionExptlPrep;
        }

        /**
         * Sets the value of the sectionExptlPrep property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionExptlPrep(JAXBElement<String> value) {
            this.sectionExptlPrep = value;
        }

        /**
         * Gets the value of the sectionExptlRefinement property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionExptlRefinement() {
            return sectionExptlRefinement;
        }

        /**
         * Sets the value of the sectionExptlRefinement property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionExptlRefinement(JAXBElement<String> value) {
            this.sectionExptlRefinement = value;
        }

        /**
         * Gets the value of the sectionExptlSolution property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionExptlSolution() {
            return sectionExptlSolution;
        }

        /**
         * Sets the value of the sectionExptlSolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionExptlSolution(JAXBElement<String> value) {
            this.sectionExptlSolution = value;
        }

        /**
         * Gets the value of the sectionFigureCaptions property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionFigureCaptions() {
            return sectionFigureCaptions;
        }

        /**
         * Sets the value of the sectionFigureCaptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionFigureCaptions(JAXBElement<String> value) {
            this.sectionFigureCaptions = value;
        }

        /**
         * Gets the value of the sectionIntroduction property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionIntroduction() {
            return sectionIntroduction;
        }

        /**
         * Sets the value of the sectionIntroduction property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionIntroduction(JAXBElement<String> value) {
            this.sectionIntroduction = value;
        }

        /**
         * Gets the value of the sectionReferences property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionReferences() {
            return sectionReferences;
        }

        /**
         * Sets the value of the sectionReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionReferences(JAXBElement<String> value) {
            this.sectionReferences = value;
        }

        /**
         * Gets the value of the sectionSynopsis property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionSynopsis() {
            return sectionSynopsis;
        }

        /**
         * Sets the value of the sectionSynopsis property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionSynopsis(JAXBElement<String> value) {
            this.sectionSynopsis = value;
        }

        /**
         * Gets the value of the sectionTableLegends property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionTableLegends() {
            return sectionTableLegends;
        }

        /**
         * Sets the value of the sectionTableLegends property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionTableLegends(JAXBElement<String> value) {
            this.sectionTableLegends = value;
        }

        /**
         * Gets the value of the sectionTitle property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionTitle() {
            return sectionTitle;
        }

        /**
         * Sets the value of the sectionTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionTitle(JAXBElement<String> value) {
            this.sectionTitle = value;
        }

        /**
         * Gets the value of the sectionTitleFootnote property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSectionTitleFootnote() {
            return sectionTitleFootnote;
        }

        /**
         * Sets the value of the sectionTitleFootnote property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSectionTitleFootnote(JAXBElement<String> value) {
            this.sectionTitleFootnote = value;
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
