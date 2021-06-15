package ejercicio5State;

public class Apagado implements IStateComputadora {
	@Override
	public void handler(Computadora computadora) {
		System.out.println("Estado: Apagado");
		computadora.setConsumoEnCPU(0);
		computadora.setConsumoEnMemoriaRam(0);
		computadora.setProgramasAbiertos(new String[20]);

		System.out.println();
		System.out.println("ram: " + computadora.getConsumoEnMemoriaRam());
		System.out.println("cpu: " + computadora.getConsumoEnCPU());
		System.out.println("No hay programas abiertos.");

	}
}
