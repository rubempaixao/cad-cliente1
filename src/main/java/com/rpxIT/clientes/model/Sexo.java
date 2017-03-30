package com.rpxIT.clientes.model;

public enum Sexo {

	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	// Esta descrição é para este ENUM, não está relacionada com a descrição do formulário.
	private String descricao;
	
	Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
