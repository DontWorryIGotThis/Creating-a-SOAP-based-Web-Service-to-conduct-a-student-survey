
package retrieveform;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the retrieveform package. 
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

    private final static QName _SearchFormResponse_QNAME = new QName("http://retrieveForm/", "SearchFormResponse");
    private final static QName _SearchForm_QNAME = new QName("http://retrieveForm/", "SearchForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: retrieveform
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchFormResponse }
     * 
     */
    public SearchFormResponse createSearchFormResponse() {
        return new SearchFormResponse();
    }

    /**
     * Create an instance of {@link SearchForm }
     * 
     */
    public SearchForm createSearchForm() {
        return new SearchForm();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://retrieveForm/", name = "SearchFormResponse")
    public JAXBElement<SearchFormResponse> createSearchFormResponse(SearchFormResponse value) {
        return new JAXBElement<SearchFormResponse>(_SearchFormResponse_QNAME, SearchFormResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://retrieveForm/", name = "SearchForm")
    public JAXBElement<SearchForm> createSearchForm(SearchForm value) {
        return new JAXBElement<SearchForm>(_SearchForm_QNAME, SearchForm.class, null, value);
    }

}
