package com.example.chancay.model;

import jakarta.persistence.*;

@Entity
@Table(name = "embarcacion")
public class Embarcacion {
    
    // creacion de la calve primaria id auto_incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Columna nombre
    @Column(length = 50, nullable = false)
    private String nombre;

    // Columna capacidad en toneladas de carga
    @Column(nullable = false)
    private double capacidad;

    //Columna descripcion de la embarcacion
    @Column(length = 250, nullable = true)
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
