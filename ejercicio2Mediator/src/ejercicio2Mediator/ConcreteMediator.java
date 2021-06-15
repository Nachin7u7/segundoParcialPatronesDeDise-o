package ejercicio2Mediator;

public class ConcreteMediator implements IMediator {

	public Estudiantes estudiante;
	public Docentes docente;
	public Administrativos administrativo;

	public Estudiantes getEstudiente() {
		return estudiante;
	}

	public void setEstudiente(Estudiantes estudiente) {
		this.estudiante = estudiente;
	}

	public Docentes getDocente() {
		return docente;
	}

	public void setDocente(Docentes docente) {
		this.docente = docente;
	}

	public Administrativos getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(Administrativos administrativo) {
		this.administrativo = administrativo;
	}

	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == estudiante) {
			estudiante.messageReceived(message);
		} else if (colleague == docente) {
			docente.messageReceived(message);
		} else {
			administrativo.messageReceived(message);
		}
	}

}
