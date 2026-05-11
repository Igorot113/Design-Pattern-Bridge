package main;

import com.AbstracaoRefinada.ControleAvancado;
import com.Implementacao.Dispositivo;
import com.ImplementacaoConcreta.*;

import sem.formEspecificaComCor.CirculoAzul;
import sem.formEspecificaComCor.CirculoVermelho;
import sem.formEspecificaComCor.QuadradoAzul;
import sem.formEspecificaComCor.QuadradoVermelho;

public class Cliente {
	public static void main(String[] args) {
		// Usando BRIDGE
		Dispositivo TV = new Televisao();
		Dispositivo Radio = new Radio();
		ControleAvancado controleTV = new ControleAvancado(TV);
		ControleAvancado botaoRadio = new ControleAvancado(Radio);
		// Sem usar BRIDGE
		QuadradoVermelho quaVer = new QuadradoVermelho();
		QuadradoAzul quaAzul = new QuadradoAzul();
		CirculoVermelho cirVer = new CirculoVermelho();
		CirculoAzul cirAzul = new CirculoAzul();
		System.out.println("Usando BRIDGE....\n\n");
		System.out.println("ControleTV....\n");
		controleTV.ligar();
		controleTV.mudarVolume();
		controleTV.desligar();
		System.out.println("\nControleRadio....\n");
		botaoRadio.ligar();
		botaoRadio.desligar();
		botaoRadio.mudarVolume();
		System.out.println("\n\nSem usar BRIDGE....\n\n");
		System.out.println(quaVer.toString());
		System.out.println(quaAzul.toString());
		System.out.println(cirVer.toString());
		System.out.println(cirAzul.toString());
	}
}
