package ejercicio2Mediator;

//	15%(Mediator) Se tiene un chat de comunicación entre un chat educativo
//	donde solo se admiten Estudiantes (numero matricula, nombre), Docentes (ci, nombre) y
//	administrativos( nombre, cargo) , los estudiantes pueden decidir si su mensaje es
//	enviado a todos, solo a docentes o solo administrativos. los docentes solo envian
//	mensajes a docentes y estudiantes, los administrativos envian mensajes a todos

public class Cliente {

	public static void main(String[] arg) {
		ConcreteMediator mediator = new ConcreteMediator();

		Estudiantes estudiante = new Estudiantes(mediator, "51231", "Ignacio");

		estudiante.setDestinatario("docentes");

		Docentes docente = new Docentes(mediator, "10926845", "Ignacio");

		Administrativos admin = new Administrativos(mediator, "Jorge", "Secretario");

		mediator.setEstudiente(estudiante);
		mediator.setAdministrativo(admin);
		mediator.setDocente(docente);

		estudiante.send("Hola, soy un estudiante y este mensaje es para los docentes");
		estudiante.setDestinatario("administrativos");
		estudiante.send("Hola, soy un estudiante y este mensaje es para los administrativos");
		System.out.println();
		docente.send("Hola soy un docente");
		System.out.println();
		admin.send("Hola soy un administrativo");

	}

}
