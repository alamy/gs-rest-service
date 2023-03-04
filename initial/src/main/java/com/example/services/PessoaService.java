package com.example.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.PessoaRepository;
import com.example.entidades.Pessoa;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository<Pessoa, Long> PessoaDAO;

	public Produto adicionaPessoa(Pessoa pessoa) {
		return PessoaDAO.save(Pessoa);
	}
	
	public List<Pessoa> getPessoa() {
		return pessoaDAO.findAll();
	}
	
	public Optional<Pessoa> getPessoa(Long id) {
		return pessoaDAO.findById(id);
	}
}