package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;
import com.dio.santander.bankline.api.service.MovimentacaoService;

//tudo referente ao web service para gerar os recursos para trabalhar com o correntista
//como: CRUD de um correntista
//resposta http nas convenções rest
@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	//consegue buscar informações do banco relacionados aos correntistas
	//autowired disponibilizado atraves da ingestão de dependencia sem a necessidade
	//de um new 
	@Autowired
	//ira fazer a persistencia, salvar o correntista com o nome o saldo gerado.
	private MovimentacaoService service;
	@Autowired
	private MovimentacaoRepository repository;
	//controller tem o papel de delegar algumas reponsabilidades 
	//O metodo list findall é uma reposição do tipo GwtMapping para ser chamada atraves
	//do endpoint, da requisição de correntistas para trazer os dados do banco.
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
		
	}

	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
	

}
