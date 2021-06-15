package ejercicio1Memento;

//		15%(Memento) Se tiene un documento que se versiona cada vez que se guarda un
//		cambio, pero solo podemos volver a un estado anterior con el método revertir (ctrl+z) o
//		deshacer cambios hacia adelante (ctrl+y), se tiene 4 cambios y usamos el método
//		revertir hasta volver a1 primer cambio, luego usamos el método deshacer hasta llegar al
//		último cambio.

public class Cliente {
	public void main(String[] args) {

		GuardarCambio guardarCambio = new GuardarCambio();

		Cambios cambios = new Cambios();

		Documento doc = new Documento("Titulo 1", "Contenido 1");
		guardarCambio.setState(doc);
		cambios.guardar(guardarCambio.createState());

		doc = new Documento("Titulo 2", "Contenido 2");
		guardarCambio.setState(doc);
		cambios.guardar(guardarCambio.createState());

		doc = new Documento("Titulo 3", "Contenido 3");
		guardarCambio.setState(doc);
		cambios.guardar(guardarCambio.createState());

		doc = new Documento("Titulo 4", "Contenido 4");
		guardarCambio.setState(doc);
		cambios.guardar(guardarCambio.createState());

		// Revertir hasta el primer cambio
		guardarCambio.restoreState(cambios.getRevertir());
		guardarCambio.restoreState(cambios.getRevertir());
		guardarCambio.restoreState(cambios.getRevertir());

		// Deshacer hasta el ultimo cambio
		guardarCambio.restoreState(cambios.getDeshacer());
		guardarCambio.restoreState(cambios.getDeshacer());
		guardarCambio.restoreState(cambios.getDeshacer());

	}

}
