package AgendaConHerencia;

public class Persona extends Contacto {

	private String nombre;
	private String apellidos;

	public Persona(int id, int telefono, String email, String nombre, String apellidos) {
		super(id, telefono, email);
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	

	public String getNombreCompleto() {
	    return this.nombre + " " + this.apellidos;
	}

	@Override
	public void mostrarDatos() {
	    System.out.println("=== Contacto Persona: " + getNombreCompleto() + " ===");
	    super.mostrarDatos();
	    System.out.println();
	}

}
