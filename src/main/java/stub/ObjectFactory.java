
package stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ListEtudiants_QNAME = new QName("http://service/", "listEtudiants");
    private static final QName _ListEtudiantsResponse_QNAME = new QName("http://service/", "listEtudiantsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListEtudiants }
     * 
     * @return
     *     the new instance of {@link ListEtudiants }
     */
    public ListEtudiants createListEtudiants() {
        return new ListEtudiants();
    }

    /**
     * Create an instance of {@link ListEtudiantsResponse }
     * 
     * @return
     *     the new instance of {@link ListEtudiantsResponse }
     */
    public ListEtudiantsResponse createListEtudiantsResponse() {
        return new ListEtudiantsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     * @return
     *     the new instance of {@link Student }
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEtudiants }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListEtudiants }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "listEtudiants")
    public JAXBElement<ListEtudiants> createListEtudiants(ListEtudiants value) {
        return new JAXBElement<>(_ListEtudiants_QNAME, ListEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEtudiantsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListEtudiantsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "listEtudiantsResponse")
    public JAXBElement<ListEtudiantsResponse> createListEtudiantsResponse(ListEtudiantsResponse value) {
        return new JAXBElement<>(_ListEtudiantsResponse_QNAME, ListEtudiantsResponse.class, null, value);
    }

}
