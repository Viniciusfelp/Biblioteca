package org.example.repository;

import org.example.models.Livro;

public interface LivroRepository {
    Livro salvar(Livro livro);
    void deletar(String id);
    Livro buscar(String id);
    Livro atualizar(String id, Livro livro);
    boolean existe(String id);
}
