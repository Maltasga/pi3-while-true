/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.model.ListasFixas;
import br.senac.sp.whiletrue.servico.ColecaoService;
import br.senac.sp.whiletrue.servico.ProdutoService;
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
@WebServlet("/editar-produto")
public class EditarProduto extends HttpServlet {

    ProdutoService service;
    ColecaoService colecaoService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            service = new ProdutoService();
            colecaoService = new ColecaoService();

            int id = Integer.parseInt(request.getParameter("q"));

            request.setAttribute("produtotoedit", service.get(id));
            request.setAttribute("listaColecoes", colecaoService.listar());
            request.setAttribute("listaTipos", ListasFixas.getTipoProduto());
            request.setAttribute("listaCores", ListasFixas.getCorProduto());
            request.setAttribute("tituloProduto", "Manutenção de Produto");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/produto/cadastrar.jsp");
            dispatcher.forward(request, response);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

}
