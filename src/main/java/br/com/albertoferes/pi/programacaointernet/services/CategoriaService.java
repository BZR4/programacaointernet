package br.com.albertoferes.pi.programacaointernet.services;

import br.com.albertoferes.pi.programacaointernet.domain.Categoria;
import br.com.albertoferes.pi.programacaointernet.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
        Optional<Categoria> objeto = categoriaRepository.findById(id);
        return objeto.orElse(null);
    }

    public List<Categoria> buscarTodos(){
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }
}
