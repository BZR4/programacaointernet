package br.com.albertoferes.pi.programacaointernet.domain;

import java.util.*;

public class Livro {

    private String isbn;
    private String titulo;
    private List<String> autores = new ArrayList<>();

    public Livro() {
    }

    public Livro(String isbn, String titulo, String... autores) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores.addAll(Arrays.asList(autores));
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutores() {
        return Collections.unmodifiableList(autores);
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro book = (Livro) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return String.format("Book [isbn=%s, titulo=%s, autores=%s]",
                this.isbn, this.titulo, this.autores);
    }
}
