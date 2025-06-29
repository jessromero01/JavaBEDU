package com.bedu.inventario;
import jakarta.persistence.*;


@Entity
public class Categoria {

    @Id // campo 'id' es la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // valor del ID se genera automáticamente
    private Long id;

    private String nombre;

    protected Categoria() {}

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}