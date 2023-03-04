package com.example.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entidades.Produto;
import com.example.servicos.ProdutosService;

@RestController
public class PessoaController {

	private PessoaService pessoaService;

	public PessoaController(PessoaService pessoaService) {
		super();
		this.pessoaService = pessoaService;
	}

	@PostMapping("/pessoa")
	public ResponseEntity<Pessoa> adicionaProduto(@RequestBody Pessoa pessoa) {
		return new ResponseEntity<Pessoa>(pessoaService.adicionaPessoa(pessoa), HttpStatus.CREATED);
	}

	@GetMapping("/pessoa/{id}")
	public ResponseEntity<Produto> getPessoa(@PathVariable Long id) {
		Optional<Pessoa> pessoa = pessoaService.getPessoa(id);
		if (pessoa.isPresent())
			return new ResponseEntity<Pessoa>(pessoa.get(), HttpStatus.OK);
		return new ResponseEntity<Pessoa>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/Pessoas")
	public ResponseEntity<List<Pessoa>> getPessoas() {
		return new ResponseEntity<List<Pessoa>>(produtosService.getPessoas(), HttpStatus.OK);
	}

}