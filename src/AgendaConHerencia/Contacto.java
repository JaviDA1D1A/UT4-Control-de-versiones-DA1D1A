package AgendaConHerencia;

public abstract class Contacto {

	private static int autoid=0; // Creo un atributo de clase (static) con valor = 0
	private int id;
	private int telefono;
	private String email;

	public Contacto(int id, int telefono, String email) {
		autoid++; 	// Aumento el valor del contador en una unidad
		this.id = autoid;	// Asigno el valor al objeto
		this.telefono = telefono;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostrarDatos() {
		System.out.println("id: " + getId());
		System.out.println("Telefono: " + getTelefono());
		System.out.println("Correo electrónico: " + getEmail());
	}
	
	

}
