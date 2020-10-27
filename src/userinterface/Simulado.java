package userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoDeLacuna;
import model.MultiplaEscolha;
import model.QuestaoSimples;

public class Simulado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		ArrayList<QuestaoSimples> questoes;
		questoes = new ArrayList<QuestaoSimples>();
		String resposta;
		int pontuacao=0;
		
		questoes.add(new QuestaoSimples("Quem descobriu o Brasil?","Pedro Alvares Cabral"));
		questoes.add(new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?", "Marrom", "Cuidado com a cor"));
		questoes.add(new MultiplaEscolha("Qual a formula da água?", "H2O", "H2O2", "H2SO4", "H2O", "NaCl"));
		questoes.add(new QuestaoSimples("Quanto vale 2+2?","4"));
		questoes.add(new QuestaoDeLacuna("O vencedor do jogo de ontem foi o ***LACUNA***","Curintia"));
		
//		for (QuestaoSimples q : questoes) {
		for (int pos=0; pos < questoes.size(); pos++) {
			QuestaoSimples q = questoes.get(pos); // recebo cada uma das questões em cada posicao
			System.out.println(q.aplicarQuestao());
			resposta = teclado.nextLine();
			if (q.corrigir(resposta)) {
				pontuacao++;
			}
			else {
				System.out.println(" ERROU!! A resposta correta é "+q.getResposta());
			}
		}
		
		
		double nota = (double)pontuacao * 10 / questoes.size();
		System.out.println("Voce acertou um total de "+nota);
		
	
		teclado.close();
	}

}