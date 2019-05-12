package br.com.albertoferes.pi.programacaointernet;

import br.com.albertoferes.pi.programacaointernet.domain.Book;
import br.com.albertoferes.pi.programacaointernet.domain.Categoria;
import br.com.albertoferes.pi.programacaointernet.domain.Produto;
import br.com.albertoferes.pi.programacaointernet.repositories.CategoriaRepository;
import br.com.albertoferes.pi.programacaointernet.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProgramacaointernetApplication implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProgramacaointernetApplication.class, args);
    }

    @Bean
    public ApplicationRunner booksInitializer(BookService bookService) {
        return args -> { bookService.create(
                new Book("9780061120084", "To Kill a Mockingbird", "Harper Lee")); bookService.create(
                new Book("9780451524935", "1984", "George Orwell")); bookService.create(
                new Book("9780618260300", "The Hobbit", "J.R.R. Tolkien")); };
    }

    @Override
    public void run(String... args) throws Exception {
//        Categoria categoria = new Categoria(0,"FastFood");
//        categoriaRepository.save(categoria);
//        Produto p1 = new Produto(null, "Computador", 2000.0);
//        Produto p2 = new Produto(null, "Impressora", 800.0);
//        Produto p3 = new Produto(null, "Mouse", 80.0);


    }
}
