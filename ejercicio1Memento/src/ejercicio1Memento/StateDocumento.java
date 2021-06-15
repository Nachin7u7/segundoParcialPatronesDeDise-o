package ejercicio1Memento;

public class StateDocumento {
	
	private Documento documento;

	public StateDocumento(Documento documento) {
		this.documento = documento;
	}

	public Documento getEstado() {
		return documento;
	}

}
