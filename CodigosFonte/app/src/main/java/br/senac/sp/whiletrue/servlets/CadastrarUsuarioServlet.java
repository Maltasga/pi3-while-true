package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Perfil;
import br.senac.sp.whiletrue.model.Usuario;
import br.senac.sp.whiletrue.servico.PerfilService;
import br.senac.sp.whiletrue.servico.UsuarioService;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet("/usuario")
public class CadastrarUsuarioServlet extends HttpServlet {

    UsuarioService userService;
    PerfilService perfilService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            userService = new UsuarioService();
            perfilService = new PerfilService();

            ArrayList<Perfil> listaPerfis = perfilService.listar();
            request.setAttribute("listaPerfis", listaPerfis);

            request.setAttribute("listaUsuarios", userService.listar());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/usuariojsp/cadastrar.jsp");
            dispatcher.forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            userService = new UsuarioService();
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            int idPerfil = Integer.parseInt(request.getParameter("perfil"));
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            Usuario usuario = new Usuario(id, nome, idPerfil, login, senha, true, GregorianCalendar.getInstance().getTime());
            userService.salvar(usuario);

            response.sendRedirect(request.getContextPath() + "/usuario");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
