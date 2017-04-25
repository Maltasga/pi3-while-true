package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.dao.PerfilDao;
import br.senac.sp.whiletrue.dao.UsuarioDao;
import br.senac.sp.whiletrue.model.Perfil;
import br.senac.sp.whiletrue.model.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author While True
 */
public class UsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PerfilDao dao = new PerfilDao();
            ArrayList<Perfil> listaPerfis = dao.listar(new Perfil(0, ""));
            request.setAttribute("listaPerfis", listaPerfis);

            RequestDispatcher dispatcher = request.getRequestDispatcher("novoUsuario.jsp");
            dispatcher.forward(request, response);
            processRequest(request, response);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            UsuarioDao dao = new UsuarioDao();
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            int idPerfil = Integer.parseInt(request.getParameter("perfil"));
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            Usuario usuario = new Usuario(id, nome, idPerfil, login, senha, true, GregorianCalendar.getInstance().getTime());
            dao.inserir(usuario);

            ArrayList<Usuario> listaUsuarios = dao.listar();

            RequestDispatcher dispatcher = request.getRequestDispatcher("listarUsuario.jsp");
            request.setAttribute("listaUsuarios", listaUsuarios);

            dispatcher.forward(request, response);

            processRequest(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
