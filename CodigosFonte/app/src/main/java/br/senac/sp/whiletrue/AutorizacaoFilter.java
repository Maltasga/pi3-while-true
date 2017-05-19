/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue;

import br.senac.sp.whiletrue.model.Usuario;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Karol
 */
@WebFilter(filterName = "AutorizacaoFilter",
        urlPatterns = {"/cadastrar-cliente", "/cadastrar-filial", "/cadastrar-usuario",
            "/editar-filial", "/editar-usuario", "/excluirfilial", "/excluirusuario",
            "/finalizar-venda", "/home", "/clientes", "/filiais", "/usuarios", "/venda"})
public class AutorizacaoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession sessao = httpRequest.getSession();
        Usuario usuario = (Usuario) sessao.getAttribute("usuario");

        if (usuario == null) {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
            return;
        }
        try {
            if (verificarAcesso(usuario, httpRequest, httpResponse)) {
                // Acesso a página está liberado.
                chain.doFilter(request, response);
            } else {
                // Usuário não tem permissão de acesso a página.
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/nao-autorizado");
            }

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static boolean verificarAcesso(Usuario usuario, HttpServletRequest request, HttpServletResponse response) {
        String paginaAcessada = request.getRequestURI();
        String pagina = paginaAcessada.replace(request.getContextPath(), "");
        
        if(pagina.equals("/q/Content/css/estilo.css")){
            return true;
        }

        int idPerfil = usuario.getIdPerfil();

        if (pagina.endsWith("home") || pagina.endsWith("utilitarios.js") || pagina.endsWith("estilo.css")) {
            return true;
        }

        if (pagina.endsWith("usuarios")) {
            if (idPerfil == 100 || idPerfil == 101) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("cadastrar-cliente")) {
            if (idPerfil == 300 || idPerfil == 400) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("cadastrar-filial")) {
            if (idPerfil == 100 || idPerfil == 300) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("cadastrar-usuario")) {
            if (idPerfil == 100 || idPerfil == 101) {
                return true;
            }
            return false;
        }

        if (pagina.contains("editar-filial")) {
            if (idPerfil == 100 || idPerfil == 300) {
                return true;
            }
            return false;
        }

        if (pagina.contains("editar-usuario")) {
            if (idPerfil == 100 || idPerfil == 101) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("excluirfilial")) {
            if (idPerfil == 100 || idPerfil == 300) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("excluirusuario")) {
            if (idPerfil == 100 || idPerfil == 101) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("cliente")) {
            if (idPerfil == 300 || idPerfil == 400) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("filiais")) {
            if (idPerfil == 100 || idPerfil == 300) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("usuarios")) {
            if (idPerfil == 100 || idPerfil == 101) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("venda")) {
            if (idPerfil == 400) {
                return true;
            }
            return false;
        }

        if (pagina.endsWith("pdv-venda")) {
            if (idPerfil == 400) {
                return true;
            }
            return false;
        }

        return false;
    }

    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
