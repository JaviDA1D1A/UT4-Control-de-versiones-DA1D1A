package AgendaConHerencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Persona: int id, int telefono, String email, String nombre, String apellidos
		// Empresa: int id, int telefono, String email, String direccionPostal, String
		// sector

//---------------------------------------------------------------------------------------------------------------------------------------
		ArrayList<Persona> personas = new ArrayList<>();

		Persona toko = new Persona(20, 652134579, "correo@persona.com", "David", "Toko");
		Persona celia = new Persona(15, 652897412, "correo@persona.com", "Celia", "Sh4inu");

		personas.add(toko);
		personas.add(celia);

//---------------------------------------------------------------------------------------------------------------------------------------
		ArrayList<Empresa> empresas = new ArrayList<>();

		Empresa imdb = new Empresa(30, 912354789, "correo@empresa.org", "Carabanchel", "Efectos Visuales");
		Empresa sony = new Empresa(35, 952785346, "correo@empresa.org", "Chochavieja", "Sonido");

		empresas.add(imdb);
		empresas.add(sony);

//---------------------------------------------------------------------------------------------------------------------------------------

		int opcion = 0;

		Utilidades.mostrarOpciones();

		while (opcion != 7) {

			switch (opcion) {
			case 1:

				Utilidades.altaContacto(personas, empresas);

				break;

			case 2: // Borrar contacto por id

				Utilidades.borrarContacto(personas, empresas);

				break;

			case 3: // Modificar número de teléfono por id

				Utilidades.modificarTelefono(personas, empresas);

				break;

			case 4: // Mostrar todos los datos de los contactos

				Utilidades.mostrarDatosContactos(personas, empresas);

				break;

			case 5: // Mostrar cuantas personas hay de cada sector

				Utilidades.mostrarSectores(personas, empresas);

				break;

			case 6: // Mostrar los datos ordenados por orden alfabético de email
				
				Utilidades.mostrarOrdenadosPorEmail(personas, empresas);
				
				break;

			case 7: // Salir

				break;

			}

			Utilidades.mostrarOpciones();

			opcion = Integer.parseInt(sc.nextLine());

		}

		sc.close();
	}

}
