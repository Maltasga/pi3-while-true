
package br.senac.sp.whiletrue.model;

import java.util.Date;

/**
 *
 * @author While True
 */
public class Filial {
    private int idFilial;
    private String NomeLoja;
    private String cnpj;
    private String logradouro;
    private String cep;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private boolean ativo;
    private java.util.Date dataCadastro;

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public String getNomeLoja() {
        return NomeLoja;
    }

    public void setNomeLoja(String NomeLoja) {
        this.NomeLoja = NomeLoja;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Filial(int idFilial, String NomeLoja, String cnpj, String logradouro, String cep, String complemento, String bairro, String cidade, String uf, boolean ativo, Date dataCadastro) {
        this.idFilial = idFilial;
        this.NomeLoja = NomeLoja;
        this.cnpj = cnpj;
        this.logradouro = logradouro;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }
}
