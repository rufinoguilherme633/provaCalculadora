package br.senai.sp.jandira;

import java.awt.Color;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada frame = new FrameTabuada();
		frame.titulo = "Tabuada";
		frame.altura = 500;
		frame.largura = 500;
		frame.corDeFundoDaTela = Color.white;
		frame.criarTela();
		
		
		
		int[] notas = {4, 9, 6, 7};
		String[] alunos = {"maria", "ana", "pedro", "joão"};
		int[] pesos = new int[5];
		

//		Tabuada tabuada = new Tabuada();
//		tabuada.multiplicando = 6897;
//		tabuada.minimoMultiplicador = 0;
//		tabuada.maximoMultiplicador = 10000;
//		String[] resultado = tabuada.getTabuada();
//		
//		int contador = 0;
//		while (contador < resultado.length) {
//			System.out.println(resultado [contador]);
//			contador++;
//		}
//
	}
}
