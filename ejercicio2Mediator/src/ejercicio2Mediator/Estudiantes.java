package ejercicio2Mediator;

public class Estudiantes extends Colleague {

	public Estudiantes(IMediator mediator, String numeroMatricula, String nombre) {
		super(mediator);
		this.numeroMatricula = numeroMatricula;
		this.nombre = nombre;
	}

	String numeroMatricula, nombre, destinatario;

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Mensaje recibido del estudiante: " + message);
	}

}
