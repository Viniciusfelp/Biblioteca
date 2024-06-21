package org.example.models;

import java.util.Date;

public class Autor extends Pessoa{
    private String nacionalidade;

    public Autor(String cpf, String nome, String dataNasimento, String telefone, String email, String nacionalidade) {
        super(cpf, nome, dataNasimento, telefone, email);
        this.nacionalidade = nacionalidade;
    }

    public Autor(){
        super();

    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
