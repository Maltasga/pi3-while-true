package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.dao.PerfilDao;
import br.senac.sp.whiletrue.dao.RepositorioBase;
import br.senac.sp.whiletrue.model.Entidade;
import br.senac.sp.whiletrue.model.Perfil;
import java.io.IOException;
import java.util.ArrayList;
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
public class UsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("usuario.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            RepositorioBase dao = new PerfilDao();
            ArrayList<Entidade> entidades = dao.listar(new Perfil(0, ""));
            ArrayList<Perfil> perfis = new ArrayList<Perfil>();
            for (Entidade e : entidades) {
                perfis.add((Perfil) e);
            }
            request.setAttribute("perfis", null);
        } catch (Exception ex) {
            System.out.println("ERROR USUARIO SERVLET - " + ex.getMessage());
        }

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }
}
