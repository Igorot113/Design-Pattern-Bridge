package com.Bridge;

import com.AbstracaoRefinada.ControleAvancado;
import com.Implementacao.Dispositivo;
import com.ImplementacaoConcreta.Televisao;

public class Cliente {
	public static void main(String[] args) {
		Dispositivo TV = new Televisao();
		ControleAvancado controleTV = new ControleAvancado(TV);

		controleTV.ligar();
		controleTV.mudarCanal(10);
		controleTV.desligar();
	}
}
