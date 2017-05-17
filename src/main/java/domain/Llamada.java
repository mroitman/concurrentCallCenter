package domain;

public class Llamada {
	
	private int numero;
	private int duracion;
	
	public Llamada(int numero, int duracion) {
		this.numero = numero;
		this.duracion = duracion;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(final int numero) {
		this.numero = numero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(final int duracion) {
		this.duracion = duracion;
	}
}
