package ejercicio5State;


//10% (State) Se tiene una objeto computadora (programas abiertos [String], consumo en
//memoria RAM, consumo en CPU) donde esta computadora tiene los estados de
//apagado, prendido, reiniciar. cuando este est� iniciando la cantidad de programas
//abiertos es 0 y el consumo de recursos es m�nimo, cuando est� en reiniciar los
//programas abiertos son cerrados y el consumo de recursos es 0%, cuando est� en
//prendido el consumo de recurso va incrementando en 5% en relaci�n a los programas
//abiertos (cantidad rand�mica de programas son abiertos cuando est� en este estado).


public class Cliente {
    public static void main(String []args){
    	
        IStateComputadora state = new Apagado();
        Computadora computadora = new Computadora();
        computadora.setState(state);
        computadora.request();

        state = new Prendido();
        computadora.setState(state);
        computadora.request();

        state = new Reiniciar();
        computadora.setState(state);
        computadora.request();



    }
}
