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
	public CommandLineRunner demo(ProductoRepository productoRepo, MarcaRepository marcaRepo) {
		return (args) -> {
			// Categoria tecnologia = new Categoria("Tecnología");
			// categoriaRepo.save(tecnologia);

			// creamos las marcas
			Marca apple = new Marca("Apple");
			marcaRepo.save(apple);

			Marca samsung = new Marca("Samsung");
			marcaRepo.save(samsung);

			productoRepo.save(new Producto("iPhone 15", "Smartphone Apple", 25000.00, apple));
			productoRepo.save(new Producto("iPad Pro", "Tablet Apple", 20000.00, apple));
			productoRepo.save(new Producto("Galaxy S23", "Smartphone Samsung", 22000.00, samsung));
			productoRepo.save(new Producto("Smart TV", "Televisión Samsung 4K", 15000.00, samsung));

			// mostrar productos por marca
			System.out.println("📂 Productos registrados por marca:");
			marcaRepo.findAll().forEach(marca -> {
				System.out.println("🏷️ " + marca.getNombre() + ":");
				productoRepo.findAll().stream()
						.filter(p -> p.getMarca().getId().equals(marca.getId()))
						.forEach(p -> System.out.println("  - " + p.getNombre()));
			});
			// cerrar aplicación después de imprimir
			System.exit(0); 
		};
	}
}
