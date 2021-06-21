package adapterEjercicio;

public class Celular implements IAdapterEmpresa1 {

	public Celular(String precio, String tiempoDeVida) {
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
		System.out.println("Precio celular: " + precio);
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida celular: " + tiempoDeVida);
	}

}
