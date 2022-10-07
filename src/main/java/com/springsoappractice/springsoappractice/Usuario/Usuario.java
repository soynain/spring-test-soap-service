package com.springsoappractice.springsoappractice.Usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlRootElement(name = "usuario")
@XmlType(namespace = "https://www.example.org/usuario",propOrder = {"id","nombreCompleto","edad"})
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreCompleto;
    private Long edad;

    @XmlAttribute
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name="nombreCompleto")
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @XmlElement(name="edad")
    public Long getEdad() {
        return this.edad;
    }


    public void setEdad(Long edad) {
        this.edad = edad;
    }

}
