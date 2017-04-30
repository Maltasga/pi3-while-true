/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.FilialDao;
import br.senac.sp.whiletrue.model.Filial;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Karol
 */
public class FilialService {

    private FilialDao dao;

    public FilialService() {
        dao = new FilialDao();
    }

    public Filial get(int id) {
        Filial filial = null;
        try {
            for (Filial f : dao.listar()) {
                if (f.getId() == id) {
                    filial = f;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return filial;
    }

    public ArrayList<Filial> listar() {
        try {
            return dao.listar();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Filial> listar(Filial filialFiltro) {
        try {
            ArrayList<Filial> listResultado = dao.listar();

            return listResultado;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void salvar(Filial f) throws Exception {
        try {
            dao = new FilialDao();
            if (get(f.getId()) == null) {
                dao.inserir(f);
            } else {
                dao.atualizar(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao atualizar filial.");
        }
    }

    public void excluir(Filial f) throws Exception {
        try {
            dao = new FilialDao();
            dao.excluir(f.getId());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao tentar excluir o cadastro de filial");
        }
    }
}
