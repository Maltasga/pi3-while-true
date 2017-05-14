package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Endereco;
import br.senac.sp.whiletrue.model.Filial;
import br.senac.sp.whiletrue.servico.EnderecoService;
import br.senac.sp.whiletrue.servico.FilialService;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karol
 */
@WebServlet("/filiais")
public class CadastrarFilial extends HttpServlet {
    
    FilialService filialService;
    EnderecoService enderecoService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            filialService = new FilialService();
            
            //request.setAttribute("listaFiliais", filialService.listar());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/filial/cadastrar.jsp");
            dispatcher.forward(request, response);
        } catch (IOException | ServletException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            filialService = new FilialService();
            enderecoService = new EnderecoService();
            String razaoSocial = request.getParameter("razaosocial");
            String cnpj = request.getParameter("cnpj");
            String logradouro = request.getParameter("logradouro");
            String cep = request.getParameter("cep");
            String complemento = request.getParameter("complemento");
            String bairro = request.getParameter("bairro");
            String cidade = request.getParameter("cidade");
            String uf = request.getParameter("uf");
            boolean ativo = Boolean.parseBoolean(request.getParameter("ativo"));
            boolean ativoMatriz = Boolean.parseBoolean(request.getParameter("ativo-matriz"));
            Date dataCadastro = GregorianCalendar.getInstance().getTime();
            
            Filial filial = new Filial(0, razaoSocial, cnpj, ativoMatriz, ativo, dataCadastro);
            
            int filialId = filialService.salvar(filial);
            Endereco endereco = new Endereco(filialId, "FILIAL", logradouro, cep, complemento, bairro, cidade, uf);
            enderecoService.salvar(endereco);
            
            response.sendRedirect(request.getContextPath() + "/filiais");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
