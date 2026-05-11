package formEspecificaComCor;

import formaEspecifica.Circulo;

public class CirculoVermelho extends Circulo {
	public String cor = "Vermelho";

	@Override
	public String toString() {
		return forma + " " + cor;
	}

}
