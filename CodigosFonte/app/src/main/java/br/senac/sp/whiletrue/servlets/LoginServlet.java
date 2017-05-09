/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.Menu;
import br.senac.sp.whiletrue.model.Usuario;
import br.senac.sp.whiletrue.servico.MenuService;
import br.senac.sp.whiletrue.servico.UsuarioService;
import java.io.IOException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Karol
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Verifica se usuário já se logou, se positivo redireciona para tela principal
        HttpSession sessao = request.getSession(false);
        if (sessao != null && sessao.getAttribute("usuario") != null) {
            response.sendRedirect(request.getContextPath() + "/home");
            return;
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/loginjsp/login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // Recupera dados preenchidos pelo usuário
        String login = request.getParameter("usuario");
        String senhaDigitada = request.getParameter("senha");
        UsuarioService us = new UsuarioService();
        // Compara com o usuário/senha previamente cadastrado
        String senhaHash;
        Usuario user = us.get(login);
        if (user != null) {
            senhaHash = user.getHash(senhaDigitada);
            if (user.getSenha().equals(senhaHash)) {
                HttpSession sessao = request.getSession(false);
                if (sessao != null) {
                    sessao.invalidate();
                }
                sessao = request.getSession(true);
                sessao.setAttribute("usuario", login);

                MenuService menuService = new MenuService();
                ArrayList<Menu> menus = menuService.listarPorPerfil(user.getIdPerfil());
                sessao.setAttribute("menus", menus);

                response.sendRedirect(request.getContextPath() + "/home");

            } else {
                response.sendRedirect(
                        request.getContextPath() + "/erroLogin.jsp");
            }
        }

    }
//    if (user
//
//    
//        != null) {
//            // Usuario existe e a senha está correta
//            // Caso exista, invalida a sessão anterior (www.owasp.org)
//            HttpSession sessao = request.getSession(false);
//        if (sessao != null) {
//            sessao.invalidate();
//        }
//        // Criar uma sessão
//        sessao = request.getSession(true);
//        sessao.setAttribute("usuario", usuarioSistema);
//
//        response.sendRedirect(request.getContextPath() + "/agenda");
//    }
//
//    
//        else {
//            response.sendRedirect(
//                request.getContextPath() + "/erroLogin.jsp");
//    }

}
