package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.EstoqueDao;
import br.senac.sp.whiletrue.model.Estoque;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class EstoqueService {

    EstoqueDao dao;

    public EstoqueService() {
        dao = new EstoqueDao();
    }

    public Estoque get(Estoque e) {
        Estoque estoque = null;
        try {
            for (Estoque est : dao.listarPorProduto(e.getIdProduto(), e.getIdFilial())) {
                if (est.equals(e)) {
                    estoque = est;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return estoque;
    }

    public ArrayList<Estoque> listarPorFilial(int idFilial) {
        try {
            ArrayList<Estoque> listaRetorno = new ArrayList<>();
            for (Estoque est : dao.listarPorFilial(idFilial)) {
                listaRetorno.add(est);
            }
            return listaRetorno;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Estoque> listarPorProduto(int idProduto, int idFilial) {
        try {
            ArrayList<Estoque> listaRetorno = dao.listarPorProduto(idProduto, idFilial);
            if (listaRetorno.size() > 0) {
                return listaRetorno;
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
