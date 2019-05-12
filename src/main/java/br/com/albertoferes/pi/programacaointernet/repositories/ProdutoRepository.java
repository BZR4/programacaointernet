package br.com.albertoferes.pi.programacaointernet.repositories;

import br.com.albertoferes.pi.programacaointernet.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
