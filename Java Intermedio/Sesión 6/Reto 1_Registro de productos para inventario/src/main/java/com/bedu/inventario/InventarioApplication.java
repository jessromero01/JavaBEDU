package com.bedu.inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProductoRepository repository) {
		return (args) -> {
			// guardar algunos productos
			repository.save(new Producto("Teclado", "Switch rosa", 700.00));
			repository.save(new Producto("Laptop", "Pórtatil de 18 pulgadas", 18000.00));
			repository.save(new Producto("Memoria USB", "8 GB", 150.00));
			repository.save(new Producto("Mouse Logitech", "Mouse inalámbrico", 350.00));
			repository.save(new Producto("Monitor", "Monitor Full HD 24", 3200));

			// mostrar todos los productos
			System.out.println("✅ Productos disponibles:");
			repository.findAll().forEach(System.out::println);

			// precio > 500
			System.out.println("\n 💵 Productos con un precio mayor a $500:");
			repository.findByPrecioGreaterThan(500).forEach(System.out::println);

			// buscar por nombre parcial
			System.out.println("\n 🔍 Productos que contienen'Lap':");
			repository.findByNombreContaining("Lap").forEach(System.out::println);

			// precio entre 400 y 1000
			System.out.println("\n 💰 Productos con precio entre $400 y $1000:");
			repository.findByPrecioBetween(400, 1000).forEach(System.out::println);

			// nombre empiece con M/n
			System.out.println("\n Ⓜ️ Productos cuyo nombre inicien con M/m:");
			repository.findByNombreStartingWithIgnoreCase("m").forEach(System.out::println);

			// cerrar aplicación después de imprimir
			System.exit(0); 
		};
	}
}
