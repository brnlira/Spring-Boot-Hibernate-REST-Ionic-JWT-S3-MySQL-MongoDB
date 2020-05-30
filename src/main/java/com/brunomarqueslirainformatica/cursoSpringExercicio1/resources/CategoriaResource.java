package com.brunomarqueslirainformatica.cursoSpringExercicio1.resources;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunomarqueslirainformatica.cursoSpringExercicio1.domain.Categoria;
import com.brunomarqueslirainformatica.cursoSpringExercicio1.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
