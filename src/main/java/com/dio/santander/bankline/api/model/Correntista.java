package com.dio.santander.bankline.api.model;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//classe corretista será uma entidade 
@Table(name="tab_correntista")
//os registros dessa classe serão salvos numa tabela de nome tab_correntista
public class Correntista {
	//essa coluna que sera a chave primaria do banco que será identificador exclusivo do registro
	@Id
	//jpa irá gerar uma chave primaria a cada correntista cadastrado.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//permite criar as colunas da tabela atraves desse mapeamento
	@Column(length = 14)
	private Integer cpf;
	@Column(length = 60)
	private Integer nome;
	
	//as informações que estiverem nesta classe, estiverem nessa classe, estarão na mesma tabela
	//que a tabela principal, a tabela que possui uma referencia a esta classe.
	@Embedded
	@Column()
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
