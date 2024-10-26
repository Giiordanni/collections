package generics.set.pesquisa;

public class Tarefa {
	
	private String descriao;
	private boolean concluida;
	

	public Tarefa(String descriao) {
		this.descriao = descriao;
		this.concluida = false;
	}
	
	


	public String getDescriao() {
		return descriao;
	}




	public void setDescriao(String descriao) {
		this.descriao = descriao;
	}




	public boolean isConcluida() {
		return concluida;
	}




	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}


	@Override
	public String toString() {
		return "Tarefa [descriao=" + descriao + ", concluida=" + concluida + "]";
	}
	
	

}
