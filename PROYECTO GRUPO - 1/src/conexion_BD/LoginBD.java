
package conexion_BD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class LoginBD {
    public int Login(String user,String pass){

    int resultado = 0;
    try{
        Connection cnx = DataBaseConnect.getConnection();
         Statement ejecutor = cnx.createStatement();
         ResultSet rs = ejecutor.executeQuery("Select * from INICIO Where USUARIO = '"+user+"' and PASSWORD = '"+pass+"'");
         
         if (rs.next()){
             JOptionPane.showMessageDialog(null, "BIENVENIDOS","INFORMACION", JOptionPane.INFORMATION_MESSAGE);
             resultado = 1;
         }else{
             JOptionPane.showMessageDialog(null, "Ingresa usuario y contraseña", "ERROR", JOptionPane.ERROR_MESSAGE);

             resultado = 0;

         }
    }catch(Exception e){
       JOptionPane.showMessageDialog(null, "error" + e.getMessage(), e.getMessage(),JOptionPane.ERROR_MESSAGE);

    }
    
    
   return resultado; 
}
}
