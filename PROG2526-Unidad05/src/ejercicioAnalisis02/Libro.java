package ejercicioAnalisis02;

public class Libro extends Ficha {
	private String autor;
	private String editorial;

	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		this.autor = autor;
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public int diasPrestamo() {
		return 15;
	}

	@Override
	public String toString() {
		return super.toString() + " | Autor/a: " + autor + " | Editorial: " + editorial;
	}

}
