package model;

/* vou reaproveitar a estrutura da QuestaoSimples, adicionar a dica e refazer
 * a forma de aplicar a questão
 */
public class QuestaoComDica extends QuestaoSimples {
	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		return "Pergunta: "+super.enunciado+"\n"+
	               "DICA: "+this.dica;
	}

}