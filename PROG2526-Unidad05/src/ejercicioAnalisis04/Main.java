package ejercicioAnalisis04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Contacto> miAgenda = new ArrayList<>();

		ContactoPersona p1 = new ContactoPersona("Alicia", 600111222, "15 de mayo");
		ContactoEmpresa e1 = new ContactoEmpresa("TechNova", 910444555, "www.technova.com");

		ContactoPersona p2 = new ContactoPersona("Alicia", 655999888, "1 de enero");

		añadirContacto(miAgenda, p1);
		añadirContacto(miAgenda, e1);
		añadirContacto(miAgenda, p2);

		System.out.println("--- Mi Agenda ---");
		for (Contacto c : miAgenda) {
			System.out.println(c);
		}
	}

	public static void añadirContacto(ArrayList<Contacto> lista, Contacto nuevo) {
		if (!lista.contains(nuevo)) {
			lista.add(nuevo);
			System.out.println("Añadido: " + nuevo.getNombre());
		} else {
			System.out.println("Error: El contacto '" + nuevo.getNombre() + "' ya existe.");
		}
	}
}
