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
 * <p>Java class for tcCompNfse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcCompNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nfse" type="{http://www.abrasf.org.br/nfse.xsd}tcNfse"/>
 *         &lt;element name="NfseCancelamento" type="{http://www.abrasf.org.br/nfse.xsd}tcCancelamentoNfse" minOccurs="0"/>
 *         &lt;element name="NfseSubstituicao" type="{http://www.abrasf.org.br/nfse.xsd}tcSubstituicaoNfse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcCompNfse", propOrder = {
    "nfse",
    "nfseCancelamento",
    "nfseSubstituicao"
})
public class TcCompNfse {

    @XmlElement(name = "Nfse", required = true)
    protected TcNfse nfse;
    @XmlElement(name = "NfseCancelamento")
    protected TcCancelamentoNfse nfseCancelamento;
    @XmlElement(name = "NfseSubstituicao")
    protected TcSubstituicaoNfse nfseSubstituicao;

    /**
     * Gets the value of the nfse property.
     * 
     * @return
     *     possible object is
     *     {@link TcNfse }
     *     
     */
    public TcNfse getNfse() {
        return nfse;
    }

    /**
     * Sets the value of the nfse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcNfse }
     *     
     */
    public void setNfse(TcNfse value) {
        this.nfse = value;
    }

    /**
     * Gets the value of the nfseCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link TcCancelamentoNfse }
     *     
     */
    public TcCancelamentoNfse getNfseCancelamento() {
        return nfseCancelamento;
    }

    /**
     * Sets the value of the nfseCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCancelamentoNfse }
     *     
     */
    public void setNfseCancelamento(TcCancelamentoNfse value) {
        this.nfseCancelamento = value;
    }

    /**
     * Gets the value of the nfseSubstituicao property.
     * 
     * @return
     *     possible object is
     *     {@link TcSubstituicaoNfse }
     *     
     */
    public TcSubstituicaoNfse getNfseSubstituicao() {
        return nfseSubstituicao;
    }

    /**
     * Sets the value of the nfseSubstituicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcSubstituicaoNfse }
     *     
     */
    public void setNfseSubstituicao(TcSubstituicaoNfse value) {
        this.nfseSubstituicao = value;
    }

}
