package model;

public class MultiplaEscolha extends QuestaoSimples {
	private String altA;
	private String altB;
	private String altC;
	private String altD;
	
	public MultiplaEscolha(String enunciado, String resposta, String altA, String altB, String altC,
			String altD) {
		super(enunciado, resposta);
		this.altA = altA;
		this.altB = altB;
		this.altC = altC;
		this.altD = altD;
	}
	
	public String aplicarQuestao() {
		return "Pergunta: "+super.enunciado+"\n"+
	                  "a) "+altA+"\n"+
				      "b) "+altB+"\n"+
	                  "c) "+altC+"\n"+
				      "d) "+altD;
	}
	
	

}