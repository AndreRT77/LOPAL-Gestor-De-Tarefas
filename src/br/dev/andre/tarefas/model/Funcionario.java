package br.dev.andre.tarefas.model;

public class Funcionario {

	private String nome;
	private String cargo;
	private String setor;
	
	public Funcionario() {
		System.out.println("criando um funcionário");
	}
	
	public Funcionario(String nome) {
		setNome(nome); 
	}
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		System.out.printf("criando um funcionário %s como %s", nome, cargo);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}
