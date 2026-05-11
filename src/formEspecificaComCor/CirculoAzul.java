package formEspecificaComCor;

import formaEspecifica.Circulo;

public class CirculoAzul extends Circulo {
	public String cor = "Azul";

	@Override
	public String toString() {
		return forma + " " + cor;
	}

}
