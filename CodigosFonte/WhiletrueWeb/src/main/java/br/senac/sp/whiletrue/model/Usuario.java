package br.senac.sp.whiletrue.model;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author While True
 */
public class Usuario implements Entidade {

    private int idUser;
    private String nome;
    private Perfil perfil;
    private String login;
    private String senha;
    private boolean ativo;
    private java.util.Date dataCriacao;

    public Usuario(int idUser, String nome, Perfil perfil) {
        this.idUser = idUser;
        this.nome = nome;
        this.perfil = perfil;
        this.ativo = true;
        this.dataCriacao = GregorianCalendar.getInstance().getTime();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public String getLogin() {
        return login;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
