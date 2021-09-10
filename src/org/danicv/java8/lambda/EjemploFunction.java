package org.danicv.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.danicv.java8.lambda.models.Usuario;

public class EjemploFunction {
	public static void main(String[] args) {
		Function<String, String> funtion1 = param -> {
			return "Hola que tal mi nombre es " + param;
		};
		String resultado = funtion1.apply("Daniel Calderon");
		System.out.println(resultado);
		Usuario persona = new Usuario();

		Function<String, Usuario> funtion2 = param2 -> {
			persona.setUsuario(param2);
			return persona;

		};
		Usuario resultado2 = funtion2.apply("Daniel Calderon");
		System.out.println("nombre de la persona es " + resultado2.getUsuario());

		BiFunction<String, String, String> funtion3 = (nombre, apellido) -> {
			return "Hola que tal mi nombre es " + nombre + apellido;
		};
		String r3 = funtion3.apply("Daniel", "Calderon");
		System.out.println(r3);

	}
}
