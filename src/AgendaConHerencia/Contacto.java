package AgendaConHerencia;

public abstract class Contacto {

	private int id;
	private int telefono;
	private String email;

	public Contacto(int id, int telefono, String email) {
		this.id = id;
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
