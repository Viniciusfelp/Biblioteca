package org.example.models;

public class Cliente extends Pessoa{

    public Cliente(String cpf, String nome, String dataNasimento, String telefone, String email) {
        super(cpf, nome, dataNasimento, telefone, email);
    }

    public Cliente() {
    }
}
