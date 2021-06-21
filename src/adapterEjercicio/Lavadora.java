package adapterEjercicio;

public class Lavadora implements IAdapterEmpresa2 {

	public Lavadora(String costo, String garantia) {
		super();
		this.costo = costo;
		this.garantia = garantia;
	}

	String costo;

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	String garantia;

	@Override
	public void costo() {
		System.out.println("Costo lavadora: " + costo);
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("Garantia lavadora: " + garantia);
	}

}
