
package br.senac.sp.whiletrue.model;

import java.util.Date;

/**
 *
 * @author While True
 */
public class Colecao {
    private int idColecao;
    private String nome;
    private String periodo;
    private int ano;
    private boolean ativo;
    private java.util.Date dataCriacao;

    public int getIdColecao() {
        return idColecao;
    }

    public void setIdColecao(int idColecao) {
        this.idColecao = idColecao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Colecao(int idColecao, String nome, String periodo, int ano, boolean ativo, Date dataCriacao) {
        this.idColecao = idColecao;
        this.nome = nome;
        this.periodo = periodo;
        this.ano = ano;
        this.ativo = ativo;
        this.dataCriacao = dataCriacao;
    }
}
