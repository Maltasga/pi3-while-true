package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;
import br.senac.sp.whiletrue.model.Colecao;
import br.senac.sp.whiletrue.model.Perfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class ColecaoDao {

    Connection conexao = null;

    public void inserir(Colecao c) throws SQLException, Exception {
        String query = "INSERT INTO Colecao (Nome, Periodo, Ano, IsActive, DateCreated)"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, c.getNome());
            statement.setString(2, c.getPeriodo());
            statement.setInt(3, c.getAno());
            statement.setBoolean(4, c.isAtivo());
            statement.setDate(5, new java.sql.Date(c.getDataCriacao().getTime()));

            statement.execute();
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    public void editar(Colecao c) throws SQLException, Exception {
        String query = "UPDATE Colecao SET Nome = ?, Periodo = ?, Ano = ?, IsActive = ? WHERE IdColecao = ?";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, c.getNome());
            statement.setString(2, c.getPeriodo());
            statement.setInt(3, c.getAno());
            statement.setBoolean(4, c.isAtivo());
            statement.setInt(5, c.getIdColecao());

            statement.execute();
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    public void excluir(int id) throws SQLException, Exception {
        String query = "UPDATE Colecao SET IsActive = false WHERE IdColecao = ?";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setInt(1, id);

            statement.execute();
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    public ArrayList<Colecao> listar() throws SQLException, Exception {
        ArrayList<Colecao> colecoes = new ArrayList<>();
        String query = "SELECT * FROM Colecao";

        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);

            result = statement.executeQuery();

            while (result.next()) {
                colecoes.add(new Colecao(
                        result.getInt("IdColecao"),
                        result.getString("Nome"),
                        result.getString("Periodo"), 
                        result.getInt("Ano"), 
                        result.getBoolean("IsActive"), 
                        new java.util.Date(result.getDate("DateCreated").getTime()))
                );
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }

            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }
        return colecoes;
    }
}
