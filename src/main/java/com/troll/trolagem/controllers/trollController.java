package com.troll.trolagem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.troll.trolagem.domain.Hello;
import com.troll.trolagem.domain.helloRepository;

import jakarta.validation.Valid;

@RestController
@Controller
@RequestMapping("maluco")
public class trollController {
	@SuppressWarnings("unused")
	@Autowired
	private helloRepository repository;

	
	@GetMapping("getmaluco")
    public ResponseEntity<?>  getAllTask( ) {
		
		try {
		List<Hello> tasks = repository.findAll();
			
		return ResponseEntity.status(HttpStatus.CREATED).body(tasks);
		}catch(Exception e){
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar a requisição: " + e.getMessage());
		}
		
       
    }
	
	@PostMapping("postmaluco")
	
    public ResponseEntity<?>  createTask(@Valid @RequestBody  RequestRepository data) {
		Hello task = new Hello();
		
		task.setNome(data.nome());
		
		
		if(task.getNome() =="") {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não consigo cadastrar com o nome em branco: ");
		}
		try {
		repository.save(task);
		return ResponseEntity.status(HttpStatus.CREATED).body(task);
		}catch(Exception e){
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao processar a requisição: " + e.getMessage());
		}
		
       
    }

	
	
}
