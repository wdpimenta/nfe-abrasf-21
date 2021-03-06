
package br.org.abrasf.nfse;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NotaFiscalService", 
    targetNamespace = "http://www.abrasf.org.br/nfse.xsd", 
    wsdlLocation = "classpath:wsdl/abrasf21.wsdl")
public class NotaFiscalService
    extends Service
{

    private final static URL NOTAFISCALSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOTAFISCALSERVICE_EXCEPTION;
    private final static QName NOTAFISCALSERVICE_QNAME = new QName("http://www.abrasf.org.br/nfse.xsd", "NotaFiscalService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = NotaFiscalService.class.getClassLoader().getResource("wsdl/abrasf21.wsdl");
        } catch (Exception ex) {
            e = new WebServiceException(ex);
        }
        NOTAFISCALSERVICE_WSDL_LOCATION = url;
        NOTAFISCALSERVICE_EXCEPTION = e;

    }

    public NotaFiscalService() {
        super(__getWsdlLocation(), NOTAFISCALSERVICE_QNAME);
    }

    public NotaFiscalService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTAFISCALSERVICE_QNAME, features);
    }

    public NotaFiscalService(URL wsdlLocation) {
        super(wsdlLocation, NOTAFISCALSERVICE_QNAME);
    }

    public NotaFiscalService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTAFISCALSERVICE_QNAME, features);
    }

    public NotaFiscalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotaFiscalService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NotaFiscalServiceSoap
     */
    @WebEndpoint(name = "NotaFiscalServiceSoap")
    public NotaFiscalServiceSoap getNotaFiscalServiceSoap() {
        return super.getPort(new QName("http://www.abrasf.org.br/nfse.xsd", "NotaFiscalServiceSoap"), NotaFiscalServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotaFiscalServiceSoap
     */
    @WebEndpoint(name = "NotaFiscalServiceSoap")
    public NotaFiscalServiceSoap getNotaFiscalServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.abrasf.org.br/nfse.xsd", "NotaFiscalServiceSoap"), NotaFiscalServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns NotaFiscalServiceSoap
     */
    @WebEndpoint(name = "NotaFiscalServiceSoap12")
    public NotaFiscalServiceSoap getNotaFiscalServiceSoap12() {
        return super.getPort(new QName("http://www.abrasf.org.br/nfse.xsd", "NotaFiscalServiceSoap12"), NotaFiscalServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotaFiscalServiceSoap
     */
    @WebEndpoint(name = "NotaFiscalServiceSoap12")
    public NotaFiscalServiceSoap getNotaFiscalServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.abrasf.org.br/nfse.xsd", "NotaFiscalServiceSoap12"), NotaFiscalServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTAFISCALSERVICE_EXCEPTION!= null) {
            throw NOTAFISCALSERVICE_EXCEPTION;
        }
        return NOTAFISCALSERVICE_WSDL_LOCATION;
    }

}
