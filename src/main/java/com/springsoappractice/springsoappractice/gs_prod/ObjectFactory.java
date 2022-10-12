//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.11 a las 09:16:03 AM CDT 
//


package com.springsoappractice.springsoappractice.gs_prod;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.webspring.gs_prod package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.webspring.gs_prod
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsuariosRequest }
     * 
     */
    public GetUsuariosRequest createGetUsuariosRequest() {
        return new GetUsuariosRequest();
    }

    /**
     * Create an instance of {@link SaveUsuariosRequest }
     * 
     */
    public SaveUsuariosRequest createSaveUsuariosRequest() {
        return new SaveUsuariosRequest();
    }

    /**
     * Create an instance of {@link GetUsuariosResponse }
     * 
     */
    public GetUsuariosResponse createGetUsuariosResponse() {
        return new GetUsuariosResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

}
