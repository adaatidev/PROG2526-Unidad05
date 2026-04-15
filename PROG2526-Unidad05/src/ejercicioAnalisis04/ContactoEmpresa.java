package ejercicioAnalisis04;

public class ContactoEmpresa extends Contacto {
	private String paginaWeb;

	public ContactoEmpresa(String nombre, int telefono, String paginaWeb) {
		super(nombre, telefono);
		this.paginaWeb = paginaWeb;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return "[Empresa] Nombre: " + nombre + " | Tel: " + telefono + " | Web: " + paginaWeb;
	}

}
