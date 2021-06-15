package ejercicio1Memento;

public class GuardarCambio {
	private Documento estado;

	public void setState(Documento estado) {
		System.out.println("**** Set State *****");
		estado.show();
		this.estado = estado;
	}

	public StateDocumento createState() {
		System.out.println("**** Create State *****");
		estado.show();
		return new StateDocumento(estado);
	}

	public void restoreState(StateDocumento estado) {
		this.estado = estado.getEstado();
		System.out.println("**** State Restored *****");
		this.estado.show();

	}

}
