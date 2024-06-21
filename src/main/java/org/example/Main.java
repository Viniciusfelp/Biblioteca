package org.example;

import org.example.exception.LivroNotFoundException;
import org.example.infra.DatabaseConfig;
import org.example.models.Autor;
import org.example.models.Genero;
import org.example.models.Livro;
import org.example.models.Pessoa;
import org.example.repository.LivroRepository;
import org.example.repository.LivroRepositoryImpl;
import org.example.service.LivroService;

import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws LivroNotFoundException {

        try (Connection connection = DatabaseConfig.getConnection()) {
            LivroRepository livroRepository = new LivroRepositoryImpl(connection);
            LivroService livroService = new LivroService(livroRepository);

            //livroService.deletar("a");
            System.out.println((livroService.criarLivro(new Livro("a", "Chimpanzé Magrelo",
                                    new Autor("123","Xaolin", "01/01/2001", "", "", "Angolano"),
                                                "23/02/2004", Genero.SUSPENSE))));

            //livroService.deletar("a");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    }
