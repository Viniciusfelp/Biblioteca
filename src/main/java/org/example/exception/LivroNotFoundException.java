package org.example.exception;

public class LivroNotFoundException extends Exception{
    public LivroNotFoundException() {
        super("Livro não encontrado na base de dados.");
    }
}
