package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Usuario;
import br.senac.sp.whiletrue.servico.FilialService;
import br.senac.sp.whiletrue.servico.PerfilService;
import br.senac.sp.whiletrue.servico.UsuarioService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabri
 */
@WebServlet("/editarusuario")
public class EditarUsuarioServlet extends HttpServlet {

    UsuarioService service;
    PerfilService perfilService;
    FilialService filialService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("q"));
            service = new UsuarioService();
            perfilService = new PerfilService();
            filialService = new FilialService();
            
            request.setAttribute("listaPerfil", perfilService.listar());
            request.setAttribute("listaFilial", filialService.listar());
            request.setAttribute("usuario", service.get(id));

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/usuariojsp/editar.jsp");
            dispatcher.forward(request, response);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            service = new UsuarioService();
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            Usuario usuario = new Usuario(id, 0, 0, nome, email, null, false, null);
            usuario.setSenha(senha);
            service.salvar(usuario);
            
            response.sendRedirect(request.getContextPath() + "/usuarios");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
