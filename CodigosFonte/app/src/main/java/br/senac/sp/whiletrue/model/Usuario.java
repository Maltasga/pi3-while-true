package br.senac.sp.whiletrue.model;

import java.util.Date;

/**
 *
 * @author While True
 */
public class Usuario {

    private int id;
    private String nome;
    private int idPerfil;
    private String login;
    private String senha;
    private boolean ativo;
    private java.util.Date dataCadastro;
    private Perfil perfil;

    public Usuario(int id, String nome, int idPerfil, String login, String senha, boolean ativo, java.util.Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.idPerfil = idPerfil;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        return ((Usuario) o).getId() == this.id;
    }
}
