package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//classe corretista será uma entidade 
@Entity

@Table(name="tab_movimentacao")
//os registros dessa classe serão salvos numa tabela de nome tab_correntista
public class Movimentacao {
	//essa coluna que sera a chave primaria do banco que será identificador exclusivo do registro
    @Id
	//jpa irá gerar uma chave primaria a cada correntista cadastrado.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(name = "data_hora")
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	//vamos salvar o próprio valor literal
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo tipo;
	@Column(name = "id_conta")
	private Integer idConta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	

}
