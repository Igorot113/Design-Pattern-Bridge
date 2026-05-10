package com.AbstracaoRefinada;

import com.Abstracao.ControleRemoto;
import com.Implementacao.Dispositivo;

public class ControleAvancado extends ControleRemoto {

	public ControleAvancado(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
	public void ligar() {
		dispositivo.ligar();
	}

	@Override
	public void desligar() {
		dispositivo.desligar();
	}

	@Override
	public void mudarVolume() {
		dispositivo.mudarVolume();
	}
}
