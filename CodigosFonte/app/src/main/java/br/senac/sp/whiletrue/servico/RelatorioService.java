/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.RelatorioDao;
import br.senac.sp.whiletrue.model.Relatorio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Karol
 */
public class RelatorioService {

    private RelatorioDao dao;

    public RelatorioService() {
        dao = new RelatorioDao();
    }

    public ArrayList<Relatorio> listar(String periodo, int idFilial){
        return null;
    }
    
    public ArrayList<Relatorio> listar(String periodo){
        try {
            ArrayList<Relatorio> listResultado = dao.listarTudoMensal();

            return listResultado;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
