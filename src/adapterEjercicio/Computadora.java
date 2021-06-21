package adapterEjercicio;

public class Computadora implements IAdapterEmpresa1 {

	public Computadora(String precio, String tiempoDeVida) {
		super();
		this.precio = precio;
		this.tiempoDeVida = tiempoDeVida;
	}

	String precio;
	String tiempoDeVida;

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getTiempoDeVida() {
		return tiempoDeVida;
	}

	public void setTiempoDeVida(String tiempoDeVida) {
		this.tiempoDeVida = tiempoDeVida;
	}

	@Override
	public void precio() {
		System.out.println("Precio computadora: " + precio);
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida computadora: " + tiempoDeVida);
	}

}
