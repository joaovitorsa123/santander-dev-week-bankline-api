package com.dio.santander.bankline.api.model;

public class Correntista {
	private Integer id;
	private Integer cpf;
	private Integer nome;
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getNome() {
		return nome;
	}
	public void setNome(Integer nome) {
		this.nome = nome;
	}
}
