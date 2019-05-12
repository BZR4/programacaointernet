package br.com.albertoferes.pi.programacaointernet.resource;

import br.com.albertoferes.pi.programacaointernet.domain.Produto;
import br.com.albertoferes.pi.programacaointernet.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Integer id){
        Produto produto = produtoService.buscar(id);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        List<Produto> produtos = produtoService.buscarTodos();
        return ResponseEntity.ok().body(produtos);
    }
}
