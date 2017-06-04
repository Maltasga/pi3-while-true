/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.whiletrue.model;

import java.sql.Date;

/**
 *
 * @author Karol
 */
public class Relatorio {

    String filial;
    Date dataVenda;
    String vendedor;
    Double valorTotal;

    public Relatorio(String filial, Date dataVenda, String vendedor, double valorTotal) {
        this.filial = filial;
        this.dataVenda = dataVenda;
        this.vendedor = vendedor;
        this.valorTotal = valorTotal;
    }

}
