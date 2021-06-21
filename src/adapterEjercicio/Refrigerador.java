package adapterEjercicio;

public class Refrigerador implements IAdapterEmpresa2 {

	public Refrigerador(String costo, String garantia) {
		super();
		this.costo = costo;
		this.garantia = garantia;
	}

	String costo;
	String garantia;

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

	@Override
	public void costo() {
		System.out.println("Costo refrigerador: " + costo);
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("Garantia refrigerador: " + garantia);
	}
}
