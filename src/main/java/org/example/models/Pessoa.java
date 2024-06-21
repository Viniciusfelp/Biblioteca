package org.example.models;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String dataNasimento;
    private String telefone;
    private String email;

    public Pessoa(String cpf, String nome, String dataNasimento, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasimento = dataNasimento;
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasimento() {
        return dataNasimento;
    }

    public void setDataNasimento(String dataNasimento) {
        this.dataNasimento = dataNasimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
