package org.example.service;

import org.example.exception.LivroNotFoundException;
import org.example.models.Livro;
import org.example.repository.LivroRepository;

public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro criarLivro(Livro livro){
        Livro a = null;
        if(livro.getId() != null){
            if (livroRepository.existe(livro.getId())){
                throw new RuntimeException("Livro já existe");
            }
            a = livroRepository.salvar(livro);
        }
        return a;
    }

    public Livro buscarLivro(String id) throws LivroNotFoundException{
        Livro livro = livroRepository.buscar(id);
        if(livro == null){
            throw new LivroNotFoundException();
        }else{
            return livro;
        }

    }

    public void deletar(String id) throws LivroNotFoundException {
        if(livroRepository.existe(id)){
            livroRepository.deletar(id);
        }else{
            throw new LivroNotFoundException();
        }
    }

    public Livro atualizar(String id, Livro livro) throws LivroNotFoundException {
        Livro l = buscarLivro(id);
        if(!(livro.getNome() == null)){
            l.setNome(livro.getNome());
        } if(!(livro.getGenero()==null)){
            l.setGenero(livro.getGenero());
        }
        return livroRepository.salvar(l);
    }
}
