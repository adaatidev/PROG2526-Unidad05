package ejercicioAnalisis02;

public class Revista extends Ficha {
	private int numRevista;
	private int anioRevista;

	public Revista(int id, String titulo, int numRevista, int anioRevista) {
		super(id, titulo);
		this.numRevista = numRevista;
		this.anioRevista = anioRevista;
	}

	public int getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}

	public int getAnioRevista() {
		return anioRevista;
	}

	public void setAnioRevista(int anioRevista) {
		this.anioRevista = anioRevista;
	}

	@Override
	public int diasPrestamo() {
		return 10;
	}

	@Override
	public String toString() {
		return super.toString() + " | Nº Revista: " + numRevista + " | Año revista: " + anioRevista;
	}

}
