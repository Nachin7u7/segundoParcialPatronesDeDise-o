package ejercicio5State;

public class Reiniciar implements IStateComputadora {
	@Override
	public void handler(Computadora computadora) {
		System.out.println("Estado: reiniciando");
		System.out.println("ram antes: " + computadora.getConsumoEnMemoriaRam());
		System.out.println("cpu antes: " + computadora.getConsumoEnCPU());

		computadora.setConsumoEnCPU(0);
		computadora.setConsumoEnMemoriaRam(0);
		computadora.setProgramasAbiertos(new String[20]);

		System.out.println();
		System.out.println("ram:" + computadora.getConsumoEnMemoriaRam());
		System.out.println("cpu:" + computadora.getConsumoEnCPU());
		System.out.println("Se cerraron los programas abiertos");

	}
}
