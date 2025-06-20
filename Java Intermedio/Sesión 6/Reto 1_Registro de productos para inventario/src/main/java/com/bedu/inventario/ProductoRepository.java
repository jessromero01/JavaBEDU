package com.bedu.inventario;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    // metodo que busca productos cuyo nombre tenga un texto en especial (no sensible a mayusculas)
    List<Producto> findByPrecioGreaterThan(double precio);
    List<Producto> findByNombreContaining(String nombre);
    List<Producto> findByPrecioBetween(double min, double max);
    List<Producto> findByNombreStartingWithIgnoreCase(String prefijo);
}
