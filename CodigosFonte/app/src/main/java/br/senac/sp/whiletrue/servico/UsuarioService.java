package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.UsuarioDao;
import br.senac.sp.whiletrue.model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class UsuarioService implements Servico {

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

    public ArrayList<Usuario> listar() {
        try {
            ArrayList<Usuario> usuarios = new ArrayList<>();
            for (Usuario u : dao.listar()) {
                if (u.isAtivo()) {
                    usuarios.add(u);
                }
            }
            return usuarios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Usuario> listar(Usuario userFiltro) {
        try {
            ArrayList<Usuario> listResultado = dao.listar();

            return listResultado;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void salvar(Usuario u) throws Exception {
        try {
            dao = new UsuarioDao();
            if (u.getId() == 0) {
                dao.inserir(u);
            } else {
                dao.atualizar(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao atualizar usuário.");
        }
    }

    public void excluir(int id) throws Exception {
        try {
            dao = new UsuarioDao();
            dao.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao tentar excluir o cadastro de usuário");
        }
    }
}
