package br.senac.sp.whiletrue.servico;

import br.senac.sp.whiletrue.dao.VendaDao;
import br.senac.sp.whiletrue.model.ItemVenda;
import br.senac.sp.whiletrue.model.Venda;

/**
 *
 * @author While True
 */
public class VendaService {

    VendaDao dao;

    public VendaService() {
        dao = new VendaDao();
    }

    public void salvar(Venda venda) {
        try {
            dao.inserir(venda);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void calcularTotal(Venda venda){
        ProdutoService service = new ProdutoService();
        double total = 0;
        for (ItemVenda item : venda.getItens()) {
            total += (service.get(item.getIdProduto()).getValorVenda() * item.getQuantidade());
        }
        venda.setValor(total);
    }
}
