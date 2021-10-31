package com.educaciencia.odm;

public class Request {

	/****************************
	 * ******* request **********
	 ***************************/

	private String nome;
	private int senha;

	public Request() {
		super();
	}

	public Request(String nome, int senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	


}
