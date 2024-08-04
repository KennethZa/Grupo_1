package conexion_BD;

import java.util.logging.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author miche
 */
// clase se conecta la base de datos con la interfaz
public class DataBaseConnect {

    public static Connection getConnection() {
        try {
            //DRIVER DE SQL DEVELOPER
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //URL DE SQL DEVELOPER
            String url = "jdbc:oracle:thin:@localhost:1521:XE ";
            //nombre del usuario conectado
            String usuario = "C##GRUPO_G";
            //contraseña para ingresar al sistema
            String password = "grupog4";
            Connection cnx = DriverManager.getConnection(url, usuario, password);
            //Connection cnx = DriverManager.getConnection(url);
            return cnx;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
