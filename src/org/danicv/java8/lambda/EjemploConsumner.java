package org.danicv.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.danicv.java8.lambda.models.Usuario;

public class EjemploConsumner {

	public static void main(String[] args) {

		// Consumer Representa una operación que acepta un solo argumento de entrada y
		// no
		// devuelve ningún resultado.
		Consumer<Date> consumidor = fecha -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(f.format(fecha));
		};

		consumidor.accept(new Date());

		/// BiConsumer Representa una operación que acepta dos argumentos de entrada y
		/// no devuelve ningún resultado.
		BiConsumer<String, Integer> biConsumidor = (n, e) -> {
			System.out.println(n + " tiene una edad " + e + "al año: " + new Date());
		};

		biConsumidor.accept("Daniel", 23);
		Usuario usuario = new Usuario();
		BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
			persona.setUsuario(nombre);
		};
		
		asignarNombre.accept(usuario, "Daniel Calderon");
		System.out.println("Nombre de usuario: " + usuario.getUsuario());
	}

}
