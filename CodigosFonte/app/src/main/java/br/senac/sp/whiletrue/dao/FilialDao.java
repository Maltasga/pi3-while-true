/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import br.senac.sp.whiletrue.model.Filial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Karol
 */
public class FilialDao {

    Connection conexao = null;

    public void inserir(Filial f) throws SQLException, Exception {
        String query = "INSERT INTO Filial (NomeLoja, CNPJ, Logradouro, CEP, Complemento, Bairro, Cidade, UF, IsActive, DateCreated)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement.setString(1, f.getRazaosocial());
            statement.setString(2, f.getCnpj());
            statement.setString(3, f.getLogradouro());
            statement.setString(4, f.getCep());
            statement.setString(5, f.getComplemento());
            statement.setString(6, f.getBairro());
            statement.setString(7, f.getCidade());
            statement.setString(8, f.getUf());
            statement.setBoolean(9, f.isAtivo());
            statement.setDate(10, new java.sql.Date(f.getDataCadastro().getTime()));
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

    public void atualizar(Filial f) throws SQLException, Exception {
        String query = "UPDATE Usuario SET NomeLoja = ?, CNPJ = ?, Logradouro = ?, CEP = ?, Complemento = ?, Bairro = ?, Cidade = ?, UF = ?, IsActive = ?"
                + " WHERE IdFilial = ?";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            statement = conexao.prepareStatement(query);
            statement.setString(1, f.getRazaosocial());
            statement.setString(2, f.getCnpj());
            statement.setString(3, f.getLogradouro());
            statement.setString(4, f.getCep());
            statement.setString(5, f.getComplemento());
            statement.setString(6, f.getBairro());
            statement.setString(7, f.getCidade());
            statement.setString(8, f.getUf());
            statement.setBoolean(9, f.isAtivo());
            statement.setInt(10, f.getId());
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
        String query = "UPDATE Filial SET IsActive = false WHERE IdFilial = ?";
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

    public ArrayList<Filial> listar() throws SQLException {
        ArrayList<Filial> filiais = new ArrayList<>();

        String query = "select f.IDFILIAL, f.NOMELOJA, f.CNPJ, f.UF, f.CIDADE, f.ISACTIVE \n"
                + "from Filial f";
        PreparedStatement statement = null;
        try {
            conexao = ConnectionUtils.getConnection();
            statement = conexao.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            Filial f;
            while (result.next()) {
                //java.util.Date dataCriacao = new java.util.Date(result.getDate("DateCreated").getTime());
                f = new Filial(
                        result.getInt("IdFilial"),
                        result.getString("NomeLoja"),
                        result.getString("CNPJ"),
                        null,
                        null,
                        null,
                        null,
                        result.getString("UF"),
                        result.getString("Cidade"),
                        result.getBoolean("IsActive"),
                        null
                );
                filiais.add(f);
            }
        } finally {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            if (conexao != null || !conexao.isClosed()) {
                conexao.close();
            }
        }

        return filiais;
    }
}
