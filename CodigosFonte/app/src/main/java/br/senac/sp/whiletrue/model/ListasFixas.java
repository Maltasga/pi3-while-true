package br.senac.sp.whiletrue.model;

import java.util.ArrayList;

/**
 *
 * @author While True
 */
public abstract class ListasFixas {

    public static ArrayList<String> getUf() {
        ArrayList<String> estados = new ArrayList<>();
        estados.add("AC");
        estados.add("AL");
        estados.add("AP");
        estados.add("AM");
        estados.add("BA");
        estados.add("CE");
        estados.add("DF");
        estados.add("ES");
        estados.add("GO");
        estados.add("MA");
        estados.add("MT");
        estados.add("MS");
        estados.add("MG");
        estados.add("PA");
        estados.add("PB");
        estados.add("PR");
        estados.add("PE");
        estados.add("PI");
        estados.add("RJ");
        estados.add("RN");
        estados.add("RS");
        estados.add("RO");
        estados.add("RR");
        estados.add("SC");
        estados.add("SP");
        estados.add("SE");
        estados.add("TO");
        return estados;
    }
    
    public static ArrayList<String> getSexo(){
        ArrayList<String> sexo = new ArrayList<>();
        sexo.add("Feminino");
        sexo.add("Masculino");
        
        return sexo;
    }
}
