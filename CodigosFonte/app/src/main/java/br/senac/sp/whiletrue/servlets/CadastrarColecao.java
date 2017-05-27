package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Cliente;
import br.senac.sp.whiletrue.model.Colecao;
import br.senac.sp.whiletrue.model.Endereco;
import br.senac.sp.whiletrue.model.Util;
import br.senac.sp.whiletrue.servico.ClienteService;
import br.senac.sp.whiletrue.servico.ColecaoService;
import br.senac.sp.whiletrue.servico.EnderecoService;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author While True
 */
@WebServlet("/cadastrar-colecao")
public class CadastrarColecao extends HttpServlet {

    ColecaoService colecaoService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setAttribute("tituloCliente", "Cadastro de Coleção");
            request.getRequestDispatcher("WEB-INF/colecao/cadastrar.jsp")
                    .forward(request, response);
        } catch (IOException | ServletException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            colecaoService = new ColecaoService();
            String nome = request.getParameter("colecao");
            String periodo = request.getParameter("periodo");
            int ano = Integer.parseInt(request.getParameter("ano"));
            Date dataCadastro = GregorianCalendar.getInstance().getTime();

            Colecao colecao = new Colecao(0,nome, periodo, ano, true, dataCadastro);
            
            colecaoService.salvar(colecao);
            
            response.sendRedirect(request.getContextPath() + "/colecao");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
