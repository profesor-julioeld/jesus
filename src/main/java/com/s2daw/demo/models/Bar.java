package com.s2daw.demo.models;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Data
public class Bar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbar;
    private String nombrebar;
    private String nombrelogo;
    private String direccion;
    private double latitud;
    private double longitud;
    private String municipio;
    private String provincia;
    private int codigopostal;
    private int telefono;
    private String descripcion;
    private String especialidad;
    private String recomendacion;
    private String web;
    private int valormedio;
}
