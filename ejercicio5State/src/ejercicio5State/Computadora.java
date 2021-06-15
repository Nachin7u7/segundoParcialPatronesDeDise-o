package ejercicio5State;

public class Computadora {

	private IStateComputadora state;
	private String[] programasAbiertos = new String[20];
	private int consumoEnMemoriaRam;
	private int consumoEnCPU;

	public IStateComputadora getState() {
		return state;
	}

	public void setState(IStateComputadora state) {
		this.state = state;
	}

	public void request() {
		this.state.handler(this);
	}

	public String[] getProgramasAbiertos() {
		return programasAbiertos;
	}

	public void setProgramasAbiertos(String[] programasAbiertos) {
		this.programasAbiertos = programasAbiertos;
	}

	public int getConsumoEnMemoriaRam() {
		return consumoEnMemoriaRam;
	}

	public void setConsumoEnMemoriaRam(int consumoEnMemoriaRam) {
		this.consumoEnMemoriaRam = consumoEnMemoriaRam;
	}

	public int getConsumoEnCPU() {
		return consumoEnCPU;
	}

	public void setConsumoEnCPU(int consumoEnCPU) {
		this.consumoEnCPU = consumoEnCPU;
	}
}
