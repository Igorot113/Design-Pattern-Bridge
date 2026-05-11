package formEspecificaComCor;

import formaEspecifica.Quadrado;

public class QuadradoAzul extends Quadrado {
	public String cor = "Azul";

	@Override
	public String toString() {
		return forma + " " + cor;
	}

}
