package ejercicio1Memento;

import java.util.ArrayList;
import java.util.List;

public class Cambios {
	private List<StateDocumento> cambiosGuardado = new ArrayList<>();
	private List<StateDocumento> cambiosDeshechos = new ArrayList<>();

	public void guardar(StateDocumento estado) {
		cambiosGuardado.add(0, estado);
	}

	public StateDocumento getRevertir() {
		System.out.println("Revirtiendo");
		cambiosDeshechos.add(cambiosGuardado.get(0));
		cambiosGuardado.remove(0);
		return cambiosGuardado.get(0);
	}

	public StateDocumento getDeshacer() {
		System.out.println("Deshaciendo");
		return cambiosDeshechos.remove(cambiosDeshechos.size() - 1);
	}

}
