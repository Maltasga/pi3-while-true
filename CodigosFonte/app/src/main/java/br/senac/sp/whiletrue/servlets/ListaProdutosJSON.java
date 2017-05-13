package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.servico.ProdutoService;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author While True
 */
@WebServlet(urlPatterns = {"/getProdutos"})
public class ListaProdutosJSON extends HttpServlet {

    Gson gson = null;
    ProdutoService produtoService = null;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        gson = new Gson();
        produtoService = new ProdutoService();
        
        response.setContentType("application/json");
        response.setHeader("cache-control", "no-cache");
        PrintWriter out = response.getWriter();
        out.println(gson.toJson(produtoService.listar()));
        out.flush();
    }
}
