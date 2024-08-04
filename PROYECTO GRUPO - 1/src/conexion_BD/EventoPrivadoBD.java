package conexion_BD;

import clases.EventoPrivado;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author miche
 */
public class EventoPrivadoBD {

    public ArrayList<EventoPrivado> ListEventoPrivado() {
        ArrayList<EventoPrivado> eventop = new ArrayList();
        try {
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();
            Statement st = cnx.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet rs = st.executeQuery("  SELECT ID, NOMBRE,CEDULA,TELEFONO,CORREO,DIRECCION,TIPO_EVENTO,FECHA,HORA,PAQUETE,TIPO_PAGO "
                    + "    FROM EVENTO_PRIVADO ORDER BY 1  ");
            while (rs.next()) {
                EventoPrivado evtp = new EventoPrivado();
                evtp.setId(rs.getString("ID"));
                evtp.setNombre(rs.getString("NOMBRE"));
                evtp.setCedula(rs.getString("CEDULA"));
                evtp.setTelefono(rs.getString("TELEFONO"));
                evtp.setCorreo(rs.getString("CORREO"));
                evtp.setDireccion(rs.getString("DIRECCION"));
                evtp.setTipoEvento(rs.getString("TIPO_EVENTO"));
                evtp.setFechaEvento(rs.getString("FECHA"));
                evtp.setHoraEvento(rs.getString("HORA"));
                evtp.setPaquete(rs.getString("PAQUETE"));
                evtp.setTipoPago(rs.getString("TIPO_PAGO"));
                eventop.add(evtp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR LISTA");
        }
        return eventop;
    }

    //metodo para ingresar los datos a la base de datos 
    public void InsertarEventoP(EventoPrivado ep) {
        Integer id_sec= 0;
        try {
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();
            //se obtiene ultimo id
            
            Statement st = cnx.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet rs = st.executeQuery("  SELECT MAX(ID) ID from  EVENTO_PRIVADO");
            
            while (rs.next()) {
                id_sec = rs.getInt("ID");
            }
            
            if(id_sec > 0){
                id_sec ++;
            }else{
                id_sec = 1;
            }
            
            //se llama la tabla con sus atributos
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO EVENTO_PRIVADO(ID, NOMBRE,CEDULA,TELEFONO,CORREO,DIRECCION,TIPO_EVENTO,FECHA,HORA,PAQUETE,TIPO_PAGO)"
                    + "     VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, id_sec);
            pst.setString(2, ep.getNombre());
            pst.setString(3, ep.getCedula());
            pst.setString(4, ep.getTelefono());
            pst.setString(5, ep.getCorreo());
            pst.setString(6, ep.getDireccion());
            pst.setString(7, ep.getTipoEvento());
            pst.setString(8, ep.getFechaEvento());
            pst.setString(9, ep.getHoraEvento());
            pst.setString(10, ep.getPaquete());
            pst.setString(11, ep.getTipoPago());
            pst.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }
    }
    
    //metodo para modificar los datos a la base de datos 
    public void ModificarEventoP(EventoPrivado ep) {
        Integer exitoso=0;
        try {
            System.out.println(ep.toString());
            //conectamos
            Connection cnx = DataBaseConnect.getConnection();           
            //se llama la tabla con sus atributos
            PreparedStatement pst = cnx.prepareStatement("UPDATE EVENTO_PRIVADO SET NOMBRE = ?,CEDULA = ? ,TELEFONO = ? ,CORREO = ? ,DIRECCION = ?,TIPO_EVENTO = ? ,FECHA = ?,HORA = ? ,PAQUETE = ? , TIPO_PAGO = ? WHERE ID = ?");
            pst.setString(1, ep.getNombre());
            pst.setString(2, ep.getCedula());
            pst.setString(3, ep.getTelefono());
            pst.setString(4, ep.getCorreo());
            pst.setString(5, ep.getDireccion());
            pst.setString(6, ep.getTipoEvento());
            pst.setString(7, ep.getFechaEvento());
            pst.setString(8, ep.getHoraEvento());
            pst.setString(9, ep.getPaquete());
            pst.setString(10, ep.getTipoPago());
            pst.setString(11, ep.getId());
            exitoso = pst.executeUpdate();
            System.out.println("Registros actualizados: " + exitoso);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            System.out.println("Error en Actualizar datos");
        }
    }

}
