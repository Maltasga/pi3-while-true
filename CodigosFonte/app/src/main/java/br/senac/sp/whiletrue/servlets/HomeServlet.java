package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Menu;
import br.senac.sp.whiletrue.servico.MenuService;
import br.senac.sp.whiletrue.servico.UsuarioService;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author While True
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    UsuarioService usuarioService;
    MenuService menuService = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            menuService = new MenuService();
            ArrayList<Menu> menus = menuService.listarTodos();
            HttpSession sessao = request.getSession();
            sessao.setAttribute("menus", menus);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
            dispatcher.forward(request, response);
        } catch (IOException | ServletException ex) {
            ex.printStackTrace();
        }
    }
}
