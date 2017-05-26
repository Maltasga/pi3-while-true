package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;
import br.senac.sp.whiletrue.model.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class EstoqueDao {

    Connection conexao = null;

    public void inserir(ArrayList<Estoque> lista) throws SQLException {
        for (Estoque e : lista) {
            inserir(e);
        }
    }

    public void inserir(Estoque e) throws SQLException {
        String query = "INSERT INTO ESTOQUE (IdProduto, IdFilial, Tamanho, Quantidade) "
                + "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setInt(1, e.getIdProduto());
            statement.setInt(2, e.getIdFilial());
            statement.setString(3, e.getTamanho());
            statement.setInt(4, e.getQuantidade());
            statement.execute();
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    public void atualizar(Estoque e) throws SQLException {
        String query = "UPDATE Estoque SET Quantidade = ? WHERE Id = ?";
        PreparedStatement statement = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setInt(1, e.getQuantidade());
            statement.setInt(2, e.getId());
            statement.execute();
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    public ArrayList<Estoque> listar(int idProduto, int idFilial) throws SQLException {
        ArrayList<Estoque> lista = new ArrayList<>();
        String query = "SELECT "
                + "Id, "
                + "IdProduto, "
                + "IdFilial, "
                + "Tamanho, "
                + "Quantidade "
                + "WHERE IdFilial = ? AND IdProduto = ?";
        PreparedStatement statement = null;

        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setInt(1, idFilial);
            statement.setInt(2, idProduto);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                lista.add(new Estoque(
                        result.getInt("Id"),
                        result.getInt("IdProduto"),
                        result.getInt("IdFilial"),
                        result.getString("Tamanho"),
                        result.getInt("Quantidade")));
            }
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return lista;
    }
}
