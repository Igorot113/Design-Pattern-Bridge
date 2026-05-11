package sem.formEspecificaComCor;

import sem.formaEspecifica.Quadrado;

public class QuadradoAzul extends Quadrado {
	public String cor = "Azul";

	@Override
	public String toString() {
		return forma + " " + cor;
	}

}
