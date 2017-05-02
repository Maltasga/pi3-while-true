package br.senac.sp.whiletrue.model;

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
}
