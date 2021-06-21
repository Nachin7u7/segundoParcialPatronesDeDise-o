package adapterEjercicio;

public class Adapter implements IAdapterEmpresa1 {

	public Adapter(IAdapterEmpresa2 adapter) {
		super();
		this.adapter = adapter;
	}

	IAdapterEmpresa2 adapter;

	public IAdapterEmpresa2 getAdapter() {
		return adapter;
	}

	public void setAdapter(IAdapterEmpresa2 adapter) {
		this.adapter = adapter;
	}

	@Override
	public void precio() {
		System.out.println("Adaptando el costo a precio...");
		adapter.costo();
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Adaptando la garantía al tiempo de vida del producto...");
		adapter.costo();
	}

}
