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
    @ManyToOne
    @JoinColumn(name = "categoria_id") // nombre de la columna FK en la tabla de productos
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "marca_id") // nombre de la columna fk en la tabla de productos
    private Marca marca;

    protected Producto(){} //constructor por defecto requerido por JPA

    // constructor publico para crear objetos de tipo producto
    public Producto(String nombre, String descripcion, double precio, Marca marca) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.marca = marca;
    }

    // getters para acceder a los atributos
    public Long getId() { return  id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public Categoria getCategoria() { return categoria; }
    public Marca getMarca() { return marca; }

    // metodo que permite el objeto de forma legible
    @Override
    public String toString() {
         return String.format("Producto[id=%d, nombre='%s', precio=%.2f, marca='%s']",
        id, nombre, precio, marca != null ? marca.getNombre() : "Sin categoría");
    }


}