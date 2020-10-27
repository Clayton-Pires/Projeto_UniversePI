package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta; // gabarito
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String aplicarQuestao() {
		return "Pergunta: " +enunciado;
	}
	
	public boolean corrigir(String respUsuario) {
		return resposta.equals(respUsuario);
	}

	public String getResposta() {
		return resposta;
	}
	
	

}
