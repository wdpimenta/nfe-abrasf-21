//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 10:58:10 AM EST 
//


package br.org.abrasf.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcDadosConstrucaoCivil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcDadosConstrucaoCivil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoObra" type="{http://www.abrasf.org.br/nfse.xsd}tsCodigoObra" minOccurs="0"/>
 *         &lt;element name="Art" type="{http://www.abrasf.org.br/nfse.xsd}tsArt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosConstrucaoCivil", propOrder = {
    "codigoObra",
    "art"
})
public class TcDadosConstrucaoCivil {

    @XmlElement(name = "CodigoObra")
    protected String codigoObra;
    @XmlElement(name = "Art", required = true)
    protected String art;

    /**
     * Gets the value of the codigoObra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoObra() {
        return codigoObra;
    }

    /**
     * Sets the value of the codigoObra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoObra(String value) {
        this.codigoObra = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArt(String value) {
        this.art = value;
    }

}
