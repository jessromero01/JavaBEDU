package com.bedu.inventario;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Producto{

    @Id // campo que funciona como clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // el ID se genera automaticamente
    private Long id;

    // campos que sean columnas en la tabla "producto"
    @NotBlank(message = "El nombre no puede estar vacío.")
    private String nombre;
    @NotBlank(message = "La descripción no puede estar vacía.")
    private String descripcion;
    @Min(value = 1, message = "El precio debe ser mayor a 0.")
    private double precio;

    protected Producto(){} //constructor por defecto requerido por JPA

    // constructor publico para crear objetos de tipo producto
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // getters para acceder a los atributos
    public Long getId() { return  id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }

    // metodo que permite el objeto de forma legible
    @Override
    public String toString() {
        return String.format("Producto[id=%d, nombre='%s', precio=%.2f]",
        id, nombre, precio);
    }
}