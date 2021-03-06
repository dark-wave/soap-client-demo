
package dev.noemontes.soapclient.factory;

import javax.xml.bind.annotation.XmlRegistry;

import dev.noemontes.soapclient.model.Country;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dev.noemontes.soapclient.generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dev.noemontes.soapclient.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

}
