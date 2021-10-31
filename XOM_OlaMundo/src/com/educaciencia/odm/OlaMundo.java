package com.educaciencia.odm;

public class OlaMundo {

	/****************************
	 * ******* response *********
	 ***************************/

	private String mensagemOlaMundo = "Ola Mundo ! "
			+ "Bem vindo ao ODM Operational Decision management";
 
	public OlaMundo() {
		super();
	}

	public OlaMundo(String mensagemOlaMundo) {
		super();
		this.mensagemOlaMundo = mensagemOlaMundo;
	}

	public String getMensagemOlaMundo() {
		return mensagemOlaMundo;
	}

	public void setMensagemOlaMundo(String mensagemOlaMundo) {
		this.mensagemOlaMundo = mensagemOlaMundo;
	}

}