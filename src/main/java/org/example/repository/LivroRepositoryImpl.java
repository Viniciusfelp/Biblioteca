package org.example.repository;

import org.example.models.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LivroRepositoryImpl implements LivroRepository{

    private Connection connection;

    public LivroRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Livro salvar(Livro livro) {
        String sql = "INSERT INTO livros(id, nome,data_lancamento, id_autor, genero) VALUES(?, ?,?,?,?)";
        try(
                PreparedStatement statement = connection.prepareStatement(sql)){
                    statement.setString(1, livro.getId());
                    statement.setString(2, livro.getNome());
                    statement.setString(3, livro.getDataLancamento().toString());
                    statement.setString(4, livro.getAutor().getCpf());
                    statement.setString(5, livro.getGenero().toString());
                    statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return livro;
    }

    @Override
    public void deletar(String id) {
        String sql = "DELETE FROM livros WHERE id = ?";

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, id);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Livro buscar(String id) {
        Livro a = null;
        String sql = "SELECT * FROM livros WHERE id = ?";
        try (
                PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            if(result.next()){
                a =  new Livro(result.getString("id"),
                        result.getString("nome"),
                        null,
                        null,
                        null);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    @Override
    public Livro atualizar(String id, Livro livro) {
        return null;
    }

    @Override
    public boolean existe(String id) {
        Livro a = buscar(id);
        if(a==null){
            return false;
        }else{
            return true;
        }
    }
}
