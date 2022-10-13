//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.13 a las 02:46:45 PM CDT 
//


package com.springsoappractice.springsoappractice.gs_prod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;




/**
 * <p>Clase Java para updateByIdRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateByIdRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nuevosDatosUsuario" type="{http://webspring.io/gs-prod}Usuario"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateByIdRequest", propOrder = {
    "nuevosDatosUsuario"
})
public class UpdateByIdRequest {

    @XmlElement(required = true)
    protected Usuario nuevosDatosUsuario;

    /**
     * Obtiene el valor de la propiedad nuevosDatosUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getNuevosDatosUsuario() {
        return nuevosDatosUsuario;
    }

    /**
     * Define el valor de la propiedad nuevosDatosUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setNuevosDatosUsuario(Usuario value) {
        this.nuevosDatosUsuario = value;
    }

}
