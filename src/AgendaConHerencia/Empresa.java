package AgendaConHerencia;

public class Empresa extends Contacto {

	private String direccionPostal;
	private String sector;

	public Empresa(int id, int telefono, String email, String direccionPostal, String sector) {
		super(id, telefono, email);
		this.direccionPostal = direccionPostal;
		this.sector = sector;
	}

	public String getDireccionPostal() {
		return direccionPostal;
	}

	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

 @Override
 public void mostrarDatos() {
	 System.out.println("===Datos Empresa===");
	 super.mostrarDatos();
	 System.out.println("Dirección postal: " + getDireccionPostal());
	 System.out.println("Sector: " + getSector());
	 System.out.println();
 }
}
