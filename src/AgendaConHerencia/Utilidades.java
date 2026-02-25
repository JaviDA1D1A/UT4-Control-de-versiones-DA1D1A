package AgendaConHerencia;

import java.util.ArrayList;

import java.util.Scanner;

public class Utilidades {

	public static void mostrarOpciones() {
		System.out.println("1. Alta contacto");
		System.out.println("2. Baja contacto");
		System.out.println("3. Modificar telefono de un contacto");
		System.out.println("4. Listar todos los datos de los contactos");
		System.out.println("5. Mostrar cuantas empresas hay de cada sector");
		System.out.println("6. Mostrar los datos ordenados por orden alfabético de email");
		System.out.println("7. Salir");
		System.out.println();

	}

	public static void altaContacto(ArrayList<Persona> personas, ArrayList<Empresa> empresas) {

		Scanner sc = new Scanner(System.in);

		Persona contactoPersona = new Persona(0, 0, "", "", "");

		Empresa contactoEmpresa = new Empresa(0, 0, "", "", "");

		int tipo;

		int id;
		int telefono;
		String email;

		String nombre;
		String apellidos;

		String direccionPostal;
		String sector;

		System.out.println(" 1. Contacto Persona: \n 2. Contacto Empresa: ");
		tipo = Integer.parseInt(sc.nextLine());

		if (tipo == 1) {

			System.out.println("id: ");
			id = Integer.parseInt(sc.nextLine());
			System.out.println("Telefono: ");
			telefono = Integer.parseInt(sc.nextLine());
			System.out.println("Correo electrónico: ");
			email = sc.nextLine();
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Apellidos: ");
			apellidos = sc.nextLine();

			contactoPersona = new Persona(id, telefono, email, nombre, apellidos);

			personas.add(contactoPersona);
		}

		if (tipo == 2) {

			System.out.println("id: ");
			id = Integer.parseInt(sc.nextLine());
			System.out.println("Telefono: ");
			telefono = Integer.parseInt(sc.nextLine());
			System.out.println("Correo electrónico: ");
			email = sc.nextLine();
			System.out.println("Dirección postal: ");
			direccionPostal = sc.nextLine();
			System.out.println("Sector: ");
			sector = sc.nextLine();

			contactoEmpresa = new Empresa(id, telefono, email, direccionPostal, sector);

			empresas.add(contactoEmpresa);

		}

		sc.close();
	}

	public static void borrarContacto(ArrayList<Persona> personas, ArrayList<Empresa> empresas) {

		int borrarId = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el id del contacto que quieras borrar: ");
		borrarId = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getId() == borrarId) {
				personas.remove(i);
			}
		}
		for (int j = 0; j < empresas.size(); j++) {
			if (empresas.get(j).getId() == borrarId) {
				personas.remove(j);
			}
		}

		sc.close();

	}

	public static void modificarTelefono(ArrayList<Persona> personas, ArrayList<Empresa> empresas) {

		Scanner sc = new Scanner(System.in);

		int comprobarId = 0;

		int nuevoTelefono = 0;

		System.out.println("Escribe el id del telefono que quieres modificar: ");
		comprobarId = Integer.parseInt(sc.nextLine());
		System.out.println("Escribe el nuevo número de telefono: ");
		nuevoTelefono = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getId() == comprobarId) {
				personas.get(i).setTelefono(nuevoTelefono);
			}
		}

		for (int j = 0; j < empresas.size(); j++) {
			if (empresas.get(j).getId() == comprobarId) {
				empresas.get(j).setTelefono(nuevoTelefono);
			}
		}
		sc.close();

	}

	public static void mostrarDatosContactos(ArrayList<Persona> personas, ArrayList<Empresa> empresas) {

		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).mostrarDatos();
		}
		for (int j = 0; j < empresas.size(); j++) {
			empresas.get(j).mostrarDatos();
		}

	}

	public static void mostrarSectores(ArrayList<Persona> personas, ArrayList<Empresa> empresas) {

		int contador = 0;

		for (int i = 0; i < empresas.size(); i++) {
			contador++;
			System.out.println(empresas.get(i).getSector() + " " + contador + "\n");
		}
	}
	
public static void mostrarOrdenadosPorEmail(ArrayList<Persona> personas, ArrayList<Empresa> empresas) {
		
		// 1. Creamos una lista combinada de la clase padre (asumo que se llama Contacto)
		ArrayList<Contacto> todosLosContactos = new ArrayList<>();
		
		// 2. Unimos ambas listas para poder ordenarlos todos juntos
		todosLosContactos.addAll(personas);
		todosLosContactos.addAll(empresas);
		
		// 3. Ordenamos la lista combinada usando una expresión Lambda. 
		// compareToIgnoreCase compara los textos sin importar si hay mayúsculas o minúsculas.
		todosLosContactos.sort((c1, c2) -> c1.getEmail().compareToIgnoreCase(c2.getEmail()));
		
		// 4. Mostramos los datos ya ordenados
		System.out.println("\n--- Contactos ordenados por email ---");
		for (int i = 0; i < todosLosContactos.size(); i++) {
			todosLosContactos.get(i).mostrarDatos();
		}
		System.out.println("-------------------------------------\n");
	}

}
