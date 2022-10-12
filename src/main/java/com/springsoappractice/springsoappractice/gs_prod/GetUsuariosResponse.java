//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.11 a las 09:16:03 AM CDT 
//


package com.springsoappractice.springsoappractice.gs_prod;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuariosLista" type="{http://webspring.io/gs-prod}Usuario"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuariosLista"
})
@XmlRootElement(name = "getUsuariosResponse")
public class GetUsuariosResponse {

    @XmlElement(required = true)
    protected List<Usuario> usuariosLista;

    /**
     * Obtiene el valor de la propiedad usuariosLista.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public List<Usuario> getUsuariosLista() {
        if(usuariosLista==null){
            usuariosLista=new ArrayList();
        }
        return usuariosLista;
    }

    /**
     * Define el valor de la propiedad usuariosLista.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuariosLista(List<Usuario> value) {
        this.usuariosLista = value;
    }

}
