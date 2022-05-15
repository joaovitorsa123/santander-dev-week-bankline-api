package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//classe corretista será uma entidade 
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
	private String descrição;
	private Double valor;
	//vamos salvar o próprio valor literal
	@Enumerated
	private MovimentacaoTipo tipo;
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
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
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
