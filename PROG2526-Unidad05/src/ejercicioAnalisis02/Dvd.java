package ejercicioAnalisis02;

public class Dvd extends Ficha {

	enum tipos {
		pelicula, documental, serie
	}

	private String director;
	private int anio;
	private tipos tipo;

	public Dvd(int id, String titulo, String director, int anio, tipos tipo) {
		super(id, titulo);
		this.director = director;
		this.anio = anio;
		this.tipo = tipo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public tipos getTipo() {
		return tipo;
	}

	public void setTipo(tipos tipo) {
		this.tipo = tipo;
	}

	@Override
	public int diasPrestamo() {
		return 5;
	}

	@Override
	public String toString() {
		return super.toString() + " | Director: " + director + " | Año: " + anio + " | Tipo: " + tipo;
	}

}
