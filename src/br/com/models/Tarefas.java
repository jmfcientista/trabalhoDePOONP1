package br.com.models;


/**
 * Created by mauricio on 11/03/17.
 */
public class Tarefas {

	private int codigo;
	private String descricao;
	private int prioridade;
	private String dataDeConclusao;
	private boolean concluida;


	public Tarefas(int codigo){
		this.codigo = codigo;
	}

	public Tarefas(int codigo, String descricao, int prioridade, String dataDeConclusao, boolean concluida) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.dataDeConclusao = dataDeConclusao;
		this.concluida = concluida;
	}

	public void completarTarefa(){
		this.concluida = true;
	}

	public void mostrar(){
		System.out.println("=Código: " + getCodigo());
		System.out.println("=Descrição: " + getDescricao());
		System.out.println("=Prioridade: " + getPrioridade());
		System.out.println("=Data de Conclusão: " + getDataDeConclusao());
		System.out.println("=Concluida: " + isConcluida());
		System.out.println("======================================");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getDataDeConclusao() {
		return dataDeConclusao;
	}

	public void setDataDeConclusao(String dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

}
