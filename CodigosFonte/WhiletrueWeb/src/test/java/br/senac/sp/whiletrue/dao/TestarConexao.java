package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.dao.util.ConnectionUtils;

/**
 *
 * @author gabri
 */
public class TestarConexao {

    public static void main(String[] args) {
        testConexao();
    }

    public static void testConexao() {
        ConnectionUtils.getConnection();
        System.out.println("Conexão realizada!");
    }
}
