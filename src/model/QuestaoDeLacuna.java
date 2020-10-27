package model;

public class QuestaoDeLacuna extends QuestaoSimples {

	public QuestaoDeLacuna(String enunciado, String resposta) {
		super(enunciado, resposta);
		// TODO Auto-generated constructor stub
	}
	
	
	public String aplicarQuestao() {
		return "Pergunta: "+super.enunciado.replace("***LACUNA***", "________");
	}
	

}