package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.UsuarioDao;
import br.senac.sp.whiletrue.model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class UsuarioService {

    private UsuarioDao dao;

    public UsuarioService() {
        dao = new UsuarioDao();
    }

    public Usuario get(int id) {
        Usuario usuario = null;
        try {
            for (Usuario u : dao.listar()) {
                if (u.getId() == id) {
                    usuario = u;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuario;
    }

    public ArrayList<Usuario> listar(Usuario userFiltro) {
        ArrayList<Usuario> listResultado = null;
        
        
        return listResultado;
    }
}
