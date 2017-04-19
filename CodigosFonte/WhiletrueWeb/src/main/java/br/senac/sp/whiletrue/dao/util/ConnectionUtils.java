package br.senac.sp.whiletrue.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author While True
 */
public class ConnectionUtils {

    public static Connection getConnection() {

        Connection connection = null;
        try {
            String URL = DbConstants.URL;
            Properties prop = new Properties();
            prop.put("user", DbConstants.USER);
            prop.put("password", DbConstants.PASSWORD);
            connection = DriverManager.getConnection(URL, prop);

        } catch (SQLException ex) {
            System.out.println("ERRO - " + ex.getMessage());
        }
        return connection;
    }
}
