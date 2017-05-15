/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.EnderecoDao;
import br.senac.sp.whiletrue.model.Endereco;
import java.sql.SQLException;

/**
 *
 * @author 'Gabi
 */
public class EnderecoService {

    EnderecoDao dao;

    public EnderecoService() {
        dao = new EnderecoDao();
    }

    public Endereco get(int id, String origem) throws Exception {
        Endereco endereco = null;
        try {      
            endereco = dao.obter(id,origem);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return endereco;
    }

    public void salvar(Endereco e) throws Exception {
        try {
            if (get(e.getId(), e.getOrigem())== null) {
                dao.inserir(e);
            } else {
                dao.atualizar(e);
            }
        } catch (Exception x) {
            x.printStackTrace();
            throw new Exception("Falha ao atualizar endereço.");
        }
    }

}
