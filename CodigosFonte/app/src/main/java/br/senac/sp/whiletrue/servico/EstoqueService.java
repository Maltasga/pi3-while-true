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
            for (Estoque est : dao.listar(e.getIdProduto(), e.getIdFilial())) {
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

    public ArrayList<Estoque> listar(int idFilial, int idProduto) {
        try {
            ArrayList<Estoque> estoque = new ArrayList<>();
            for (Estoque est : dao.listar(idProduto, idFilial)) {
                estoque.add(est);
            }
            return estoque;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
