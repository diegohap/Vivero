package com.vivero.entity;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Entity
@Table(name = "CALLES")
public class Calle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CALLE", nullable = false)
    private Integer id;
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
