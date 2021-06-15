package ejercicio2Mediator;

//	15%(Mediator) Se tiene un chat de comunicaci�n entre un chat educativo
//	donde solo se admiten Estudiantes (numero matricula, nombre), Docentes (ci, nombre) y
//	administrativos( nombre, cargo) , los estudiantes pueden decidir si su mensaje es
//	enviado a todos, solo a docentes o solo administrativos. los docentes solo envian
//	mensajes a docentes y estudiantes, los administrativos envian mensajes a todos

public class Cliente {

	ConcreteMediator mediator = new ConcreteMediator();

	Estudiantes estudiante = new Estudiantes(mediator, "51231", "Ignacio");

}
