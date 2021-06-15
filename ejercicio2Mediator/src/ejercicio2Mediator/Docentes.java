package ejercicio2Mediator;

public class Docentes extends Colleague {

	public Docentes(IMediator mediator, String ci, String nombre) {
		super(mediator);
		this.ci = ci;
		this.nombre = nombre;
	}

	String ci, nombre;

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Mensaje recibido del docente: " + message);
	}

}
