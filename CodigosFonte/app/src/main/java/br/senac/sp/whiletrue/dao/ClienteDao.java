package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;
import br.senac.sp.whiletrue.model.Cliente;
import br.senac.sp.whiletrue.model.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class ClienteDao {

    Connection conexao = null;

    public void inserir(Cliente c) throws SQLException, Exception {
        String query = "INSERT INTO Cliente (Nome, Cpf, Sexo, DataNascimento, Ativo, DataCadastro) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, c.getNome());
            statement.setString(2, c.getCpf());
            statement.setString(3, c.getSexo());
            statement.setDate(4, Util.toSQLDate(c.getDataNascimento()));
            statement.setBoolean(5, c.isAtivo());
            statement.setDate(6, Util.toSQLDate(c.getDataCadastro()));
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

    public void atualizar(Cliente c) throws SQLException, Exception {
        String query = "UPDATE Cliente SET Nome = ?, Sexo = ?, DataNascimeno = ? WHERE Id = ?";
        PreparedStatement statement = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, c.getNome());
            statement.setString(2, c.getSexo());
            statement.setDate(3, Util.toSQLDate(c.getDataNascimento()));
            statement.setInt(4, c.getId());
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
        String query = "UPDATE Cliente SET Ativo = FALSE WHERE Id = ?";
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

    public ArrayList<Cliente> listar() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();

        String query = "SELECT * FROM Cliente";
        PreparedStatement statement = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                clientes.add(new Cliente(
                        result.getInt("Id"),
                        result.getString("Nome"),
                        result.getString("Cpf"),
                        result.getString("Sexo"),
                        Util.toUtilDate(result.getDate("DataNascimento")),
                        result.getBoolean("Ativo"),
                        Util.toUtilDate(result.getDate("DataCadastro"))));
            }
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }
        return clientes;
    }
}
