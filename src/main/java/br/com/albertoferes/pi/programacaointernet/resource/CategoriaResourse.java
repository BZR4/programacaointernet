package br.com.albertoferes.pi.programacaointernet.resource;

import br.com.albertoferes.pi.programacaointernet.domain.Categoria;
import br.com.albertoferes.pi.programacaointernet.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResourse {

    @Autowired
    private CategoriaService service;

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> find(@PathVariable Integer id) {
        Categoria categoria = service.buscar(id);
        return ResponseEntity.ok().body(categoria);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listar(){
        List<Categoria> categorias = service.buscarTodos();
        return ResponseEntity.ok().body(categorias);
    }
}
