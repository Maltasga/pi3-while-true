package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.ColecaoDao;
import br.senac.sp.whiletrue.model.Colecao;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class ColecaoService {

    ColecaoDao dao;

    public ColecaoService() {
        dao = new ColecaoDao();
    }

    public ArrayList<Colecao> listar(boolean ativo) {
        try {
            ArrayList<Colecao> lista = new ArrayList<>();
            if (ativo) {
                for (Colecao c : dao.listar()) {
                    if (c.isAtivo()) {
                        lista.add(c);
                    }
                }
            } else {
                lista = dao.listar();
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
