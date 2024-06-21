package org.example.models;

import java.util.Date;

public class Livro {
    private String id;
    private String nome;
    private String dataLancamento;
    private Autor autor;
    private Genero genero;

    public Livro(String id, String nome, Autor autor, String dataLancamento, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
    }

    public Livro(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return  dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", autor=" + autor +
                ", genero=" + genero +
                '}';
    }
}
