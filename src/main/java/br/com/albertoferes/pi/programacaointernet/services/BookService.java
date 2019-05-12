package br.com.albertoferes.pi.programacaointernet.services;

import br.com.albertoferes.pi.programacaointernet.domain.Book;
import java.util.Optional;

public interface BookService {
    Iterable<Book> findAll();
    Book create(Book book);
    Optional<Book> find(String isbn);
}
