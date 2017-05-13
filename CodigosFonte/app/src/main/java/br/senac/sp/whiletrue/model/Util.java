package br.senac.sp.whiletrue.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author While True
 */
public class Util {

    public static java.sql.Date toSQLDate(java.util.Date data) {
        return new java.sql.Date(data.getTime());
    }

    public static java.util.Date toUtilDate(java.sql.Date data) {
        return new java.util.Date(data.getTime());
    }
    
    public static java.util.Date stringToDate (String strData){
        Date data = null;
         String dataTexto = new String(strData);
         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
         format.setLenient(false);
         try {
             data = format.parse(dataTexto);
         } catch (ParseException ex) {
             ex.printStackTrace();
         }
         
         return data;
    }
}
