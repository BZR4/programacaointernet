package br.com.albertoferes.pi.programacaointernet.services;

import br.com.albertoferes.pi.programacaointernet.domain.Produto;
import br.com.albertoferes.pi.programacaointernet.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public Produto buscar(Integer id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    public List<Produto> buscarTodos(){
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }
}
