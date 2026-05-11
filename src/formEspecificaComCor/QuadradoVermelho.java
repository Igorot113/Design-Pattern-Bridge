package formEspecificaComCor;

import formaEspecifica.Quadrado;

public class QuadradoVermelho extends Quadrado {
	public String cor = "Vermelho";

	@Override
	public String toString() {
		return forma + " " + cor;
	}

}
