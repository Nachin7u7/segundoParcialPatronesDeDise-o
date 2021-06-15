package ejercicio2Mediator;

public class Administrativos extends Colleague {

	public Administrativos(IMediator mediator, String nombre, String cargo) {
		super(mediator);
		this.nombre = nombre;
		this.cargo = cargo;
	}

	String nombre, cargo;

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Mensaje recibido del administrativo: " + message);
	}

}
