package ejercicio5State;

import java.util.Random;

public class Prendido implements IStateComputadora {
	private int programas;

	@Override
	public void handler(Computadora computadora) {
		System.out.println("Estado: prendido");
		computadora.setProgramasAbiertos(abrir());
		computadora.setConsumoEnMemoriaRam(computadora.getProgramasAbiertos().length * 5);
		computadora.setConsumoEnCPU(computadora.getProgramasAbiertos().length * 5);
		System.out.println("ram: " + computadora.getConsumoEnMemoriaRam());
		System.out.println("cpu: " + computadora.getConsumoEnCPU());
		System.out.println("Programas:");
		for (int i = 0; i < computadora.getProgramasAbiertos().length; i++) {
			System.out.println("	" + computadora.getProgramasAbiertos()[i]);

		}

	}

	private String[] abrir() {
		Random random = new Random();
		programas = random.nextInt(20) + 1;
		String[] programa = new String[programas];
		for (int i = 0; i < programas; i++) {
			programa[i] = "Programa #" + (i + 1);
		}
		return programa;
	}
}
