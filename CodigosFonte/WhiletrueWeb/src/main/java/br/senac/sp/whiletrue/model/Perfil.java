package br.senac.sp.whiletrue.model;

/**
 *
 * @author While True
 */
public class Perfil implements Entidade {

    private int id;
    private String nome;

    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
