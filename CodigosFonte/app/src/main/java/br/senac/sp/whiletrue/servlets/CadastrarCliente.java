package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Cliente;
import br.senac.sp.whiletrue.model.Util;
import br.senac.sp.whiletrue.servico.ClienteService;
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
 * @author While True
 */
@WebServlet("/cadastrar-cliente")
public class CadastrarCliente extends HttpServlet {
    
    ClienteService clienteService;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
           
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/cliente/cadastrar.jsp");
            dispatcher.forward(request, response);
        } catch (IOException | ServletException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            clienteService = new ClienteService();
            
              String nome = request.getParameter("cliente"); 
              String cpf = request.getParameter("cpf");
              String sexo = request.getParameter("sexo");
              Date dataNascimento = Util.stringToDate(request.getParameter("nascimento"));
              Date dataCadastro = GregorianCalendar.getInstance().getTime();
              
              Cliente novoCliente = new Cliente(0, nome, cpf,sexo, dataNascimento, true, dataCadastro);
              clienteService.salvar(novoCliente);
              
              response.sendRedirect(request.getContextPath() + "/cliente");
  
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
