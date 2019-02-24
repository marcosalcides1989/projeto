package com.marcos.inicio.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.inicio.domain.categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<categoria> listar () {
		categoria cat1 = new categoria(1, "Informatica");
		categoria cat2 = new categoria(2, "Escritorio");
		List<categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
