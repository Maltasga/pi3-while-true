package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;
import br.senac.sp.whiletrue.model.Perfil;
import br.senac.sp.whiletrue.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class UsuarioDao {

    Connection conexao = null;

    public void inserir(Usuario u) throws SQLException, Exception {
        String query = "INSERT INTO Usuario (Nome, IdPerfil, Login, Senha, IsActive, DateCreated)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, u.getNome());
            statement.setInt(2, u.getIdPerfil());
            statement.setString(3, u.getLogin());
            statement.setString(4, u.getSenha());
            statement.setBoolean(5, u.isAtivo());
            statement.setDate(6, new java.sql.Date(u.getDataCadastro().getTime()));
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

    public void atualizar(Usuario u) throws SQLException, Exception {
        String query = "UPDATE Usuario SET Nome = ?, IdPerfil = ?, Login = ?, Senha = ?, IsActive = ?"
                + " WHERE IdUser = ?";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, u.getNome());
            statement.setInt(2, u.getIdPerfil());
            statement.setString(3, u.getLogin());
            statement.setString(4, u.getSenha());
            statement.setBoolean(5, u.isAtivo());
            statement.setInt(6, u.getId());
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
        String query = "UPDATE Usuario SET IsActive = false WHERE IdUser = ?";
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

    public ArrayList<Usuario> listar() throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        String query = "select u.IDUSER, u.NOME, u.LOGIN, u.ISACTIVE, u.DATECREATED, p.IDPERFIL, p.NOMEPERFIL \n"
                + "from usuario u join perfil p on u.IDPERFIL = p.IDPERFIL";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            Usuario u;
            while (result.next()) {
                java.util.Date dataCriacao = new java.util.Date(result.getDate("DateCreated").getTime());
                u = new Usuario(
                        result.getInt("IdUser"),
                        result.getString("Nome"),
                        result.getInt("IdPerfil"),
                        result.getString("Login"),
                        null,
                        result.getBoolean("IsActive"),
                        dataCriacao);
                u.setPerfil(new Perfil(result.getInt("IdPerfil"), result.getString("NomePerfil")));
                usuarios.add(u);
            }
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }

        return usuarios;
    }
}
