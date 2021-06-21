package adapterEjercicio;

//	Adapter) Se tiene una empresa de artefactos electrónicos (celulares, tablets,computadoras
//	--> method precio / tiempoDeVida) esta empresa absorbe otra empresa de artefactos
//	electrónicos (televisores,lavadoras, refrigeradores --> method : costo / tiempodeGarantia)
//	ambas estructuras son diferentes pero se desea adaptar a la primera estructura

public class Cliente {

	public static void main(String[] args) {

		IAdapterEmpresa1 celular = new Celular("400$", "5 años");
		IAdapterEmpresa1 tablet = new Tablet("300$", "3 años");
		IAdapterEmpresa1 computadora = new Computadora("1200$", "7 años");

		IAdapterEmpresa1 televisor = new Adapter(new Televisor("350$", "1 año"));
		IAdapterEmpresa1 lavadora = new Adapter(new Lavadora("750$", "3 año"));
		IAdapterEmpresa1 refrigerador = new Adapter(new Refrigerador("500$", "2 año"));

		celular.precio();
		celular.tiempoDeVida();

		tablet.precio();
		tablet.tiempoDeVida();

		computadora.precio();
		computadora.tiempoDeVida();

		televisor.precio();
		televisor.tiempoDeVida();

		lavadora.precio();
		lavadora.tiempoDeVida();

		refrigerador.precio();
		refrigerador.tiempoDeVida();

	}

}
