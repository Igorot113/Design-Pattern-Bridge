package com.ImplementacaoConcreta;

import com.Implementacao.Dispositivo;

public class Radio implements Dispositivo {

	@Override
	public void ligar() {
		System.out.println("Radio ligado...");
	}

	@Override
	public void desligar() {
		System.out.println("Radio desligado...");
	}

	@Override
	public void mudarVolume() {
		System.out.println("Mudando volume do radio...");
	}

}
