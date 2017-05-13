package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.ClienteDao;
import br.senac.sp.whiletrue.model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public class ClienteService {

    ClienteDao dao;

    public ClienteService() {
        dao = new ClienteDao();
    }
    
    
    public Cliente get(int id) {
        Cliente cliente = null;
        try {
            for (Cliente c : dao.listar()) {
                if (c.getId() == id) {
                    cliente = c;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cliente;
    }

    public Cliente get(String cpf) {
        Cliente cliente = null;
        try {
            for (Cliente u : dao.listar()) {
                if (cpf.equals(u.getCpf())) {
                    cliente = u;
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cliente;
    }

    public ArrayList<Cliente> listar() {
        try {
            ArrayList<Cliente> usuarios = new ArrayList<>();
            for (Cliente c : dao.listar()) {
                if (c.isAtivo()) {
                    usuarios.add(c);
                }
            }
            return usuarios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
