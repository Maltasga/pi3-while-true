package br.senac.sp.whiletrue.dao;

import br.senac.sp.whiletrue.model.Entidade;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author While True
 */
public interface RepositorioBase {
    
    void inserir(Entidade obj)throws SQLException, Exception;

    void editar(Entidade obj)throws SQLException, Exception;

    void excluir(int id)throws SQLException, Exception;

    ArrayList<Entidade> listar(Entidade obj)throws SQLException, Exception;
}
