package AgendaConHerencia;

public class Persona extends Contacto {

	private String nombre;
	private String apellidos;

	public Persona(int id, int telefono, String email, String nombre, String apellidos) {
		super(id, telefono, email);
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("===Contacto Persona===");
		super.mostrarDatos();
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println();
	}

}
