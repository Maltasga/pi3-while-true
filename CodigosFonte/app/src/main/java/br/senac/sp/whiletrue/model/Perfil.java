
package br.senac.sp.whiletrue.model;

/**
 *
 * @author While True
 */
public class Perfil {
    private int id;
    private String nome;
    private boolean ativo;

    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
