package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Cliente;
import br.senac.sp.whiletrue.servico.ClienteService;
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
@WebServlet(urlPatterns = {"/ponto-venda"})
public class VendaServlet extends HttpServlet {

    ClienteService clienteService = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        clienteService=new ClienteService();
        Cliente cliente = clienteService.get("35104624838");

        Date hoje = GregorianCalendar.getInstance().getTime();

        request.setAttribute("hoje", hoje);
        request.setAttribute("cliente", cliente);

        request.getRequestDispatcher("WEB-INF/pdv/caixa.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
