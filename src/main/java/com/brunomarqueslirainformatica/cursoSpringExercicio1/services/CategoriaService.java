package com.brunomarqueslirainformatica.cursoSpringExercicio1.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunomarqueslirainformatica.cursoSpringExercicio1.services.exceptions.ObjectNotFoundException;
import com.brunomarqueslirainformatica.cursoSpringExercicio1.domain.Categoria;
import com.brunomarqueslirainformatica.cursoSpringExercicio1.repositories.CategoriaRepository;

@Service
public class CategoriaService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
	}

}
