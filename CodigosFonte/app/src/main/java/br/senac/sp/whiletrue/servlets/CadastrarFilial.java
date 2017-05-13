package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.servico.FilialService;
import java.io.IOException;
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
@WebServlet("/filial")
public class CadastrarFilial extends HttpServlet {
    
    FilialService filialService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            filialService = new FilialService();
            
            request.setAttribute("listaFiliais", filialService.listar());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/filialjsp/cadastrar.jsp");
            dispatcher.forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
}
