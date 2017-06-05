/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.servlets;

import br.senac.sp.whiletrue.servico.FilialService;
import br.senac.sp.whiletrue.servico.RelatorioService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karol
 */
@WebServlet("/rel-vendas-geral")
public class Relatorio extends HttpServlet {

    FilialService filialService = null;
    RelatorioService service = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        filialService = new FilialService();
        request.setAttribute("listaFiliais", filialService.listar());
        request.setAttribute("filialAtiva", 1);
        request.getRequestDispatcher("/WEB-INF/relatorios/relatorios.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        filialService = new FilialService();
        
        String paramFilial = request.getParameter("filial");
        String paramPeriodo = request.getParameter("periodo");

        ArrayList<br.senac.sp.whiletrue.model.Relatorio> hell = new ArrayList<>();
        hell.add(new br.senac.sp.whiletrue.model.Relatorio("MATRIZ", (Date) Calendar.getInstance().getTime(), "Gabriel", 1987.43));

        for (int i = 0; i < 25; i++) {
            hell.add(new br.senac.sp.whiletrue.model.Relatorio(
                    "MATRIZ",
                    (Date) Calendar.getInstance().getTime(),
                    "Vendedor_" + (i + 1),
                    (new Random().nextDouble() * 10)));
        }
        request.setAttribute("listaFiliais", filialService.listar());
        request.setAttribute("listaVendas", hell);

        request.getRequestDispatcher("/WEB-INF/relatorios/relatorios.jsp")
                .forward(request, response);
    }
}
