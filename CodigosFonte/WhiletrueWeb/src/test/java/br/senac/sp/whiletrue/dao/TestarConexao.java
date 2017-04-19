package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;
import br.senac.sp.whiletrue.model.Entidade;
import br.senac.sp.whiletrue.model.Perfil;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class TestarConexao {

    public static void main(String[] args) {
        testGetPerfil();
    }

    public static void testConexao() {
        ConnectionUtils.getConnection();
    }

    static void testGetPerfil() {
        RepositorioBase dao = new PerfilDao();
        try {
            ArrayList<Entidade> perfis = dao.listar(new Perfil(0, ""));
            for (Entidade p : perfis) {
                System.out.println(((Perfil) p).getNome());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
