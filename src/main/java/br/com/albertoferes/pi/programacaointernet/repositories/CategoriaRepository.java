package br.com.albertoferes.pi.programacaointernet.repositories;

import br.com.albertoferes.pi.programacaointernet.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
