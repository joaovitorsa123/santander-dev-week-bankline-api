package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

//regra de negocio

@Service
public class CorrentistaService {
	//vai receber novo correntista
	//quando receber o Novo Correntista, ai sera criado o correntista
	//set - determina
	//get - recebe a informação
	@Autowired
	private CorrentistaRepository repository;
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf()); //pega o cpf do novoCorrentista
		correntista.setNome(novoCorrentista.getNome()); ////pega o nome do novoCorrentista
		
		//o correntista precisa de uma conta
		Conta conta = new Conta();
		conta.setSaldo(0.0); // saldo de um novo correntista começa com 0
		conta.setNumero(new Date().getTime()); //
		
		correntista.setConta(conta);
		repository.save(correntista);
		
		
	}

}
