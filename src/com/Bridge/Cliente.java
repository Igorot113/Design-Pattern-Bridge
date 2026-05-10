package com.Bridge;

import com.AbstracaoRefinada.ControleAvancado;
import com.Implementacao.Dispositivo;
import com.ImplementacaoConcreta.*;

public class Cliente {
	public static void main(String[] args) {
		Dispositivo TV = new Televisao();
		Dispositivo Radio = new Radio();
		ControleAvancado controleTV = new ControleAvancado(TV);
		ControleAvancado botaoRadio = new ControleAvancado(Radio);

		controleTV.ligar();
		controleTV.mudarVolume();
		controleTV.desligar();

		botaoRadio.ligar();
		botaoRadio.desligar();
		botaoRadio.mudarVolume();
	}
}
