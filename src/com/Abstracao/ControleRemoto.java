package com.Abstracao;

import com.Implementacao.Dispositivo;

public abstract class ControleRemoto {
	protected Dispositivo dispositivo; // Aqui é a ponte entre a abstração e a implementação.

	public ControleRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public abstract void ligar();

	public abstract void desligar();

	public abstract void mudarVolume();

}
