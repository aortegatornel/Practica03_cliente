
package es.unican.ss.seguros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.unican.ss.seguros package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SegurosCliente_QNAME = new QName("http://www.unican.es/ss/Seguros/", "segurosCliente");
    private final static QName _SegurosClienteResponse_QNAME = new QName("http://www.unican.es/ss/Seguros/", "segurosClienteResponse");
    private final static QName _DatosSeguro_QNAME = new QName("http://www.unican.es/ss/Seguros/", "datosSeguro");
    private final static QName _DatosSeguroResponse_QNAME = new QName("http://www.unican.es/ss/Seguros/", "datosSeguroResponse");
    private final static QName _DatosNoValidos_QNAME = new QName("http://www.unican.es/ss/Seguros/", "datosNoValidos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.unican.ss.seguros
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaSeguros }
     * 
     */
    public ListaSeguros createListaSeguros() {
        return new ListaSeguros();
    }

    /**
     * Create an instance of {@link DatosNoValidos }
     * 
     */
    public DatosNoValidos createDatosNoValidos() {
        return new DatosNoValidos();
    }

    /**
     * Create an instance of {@link DatosSeguro }
     * 
     */
    public DatosSeguro createDatosSeguro() {
        return new DatosSeguro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/Seguros/", name = "segurosCliente")
    public JAXBElement<String> createSegurosCliente(String value) {
        return new JAXBElement<String>(_SegurosCliente_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaSeguros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/Seguros/", name = "segurosClienteResponse")
    public JAXBElement<ListaSeguros> createSegurosClienteResponse(ListaSeguros value) {
        return new JAXBElement<ListaSeguros>(_SegurosClienteResponse_QNAME, ListaSeguros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/Seguros/", name = "datosSeguro")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createDatosSeguro(String value) {
        return new JAXBElement<String>(_DatosSeguro_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosSeguro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/Seguros/", name = "datosSeguroResponse")
    public JAXBElement<DatosSeguro> createDatosSeguroResponse(DatosSeguro value) {
        return new JAXBElement<DatosSeguro>(_DatosSeguroResponse_QNAME, DatosSeguro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosNoValidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/Seguros/", name = "datosNoValidos")
    public JAXBElement<DatosNoValidos> createDatosNoValidos(DatosNoValidos value) {
        return new JAXBElement<DatosNoValidos>(_DatosNoValidos_QNAME, DatosNoValidos.class, null, value);
    }

}
