
package Clases;

import Ventanas.Interfaz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author oscar
 */
public class UsuariosDB {
     public static Interfaz acceso = new Interfaz();

    private static final Connection conn = ConexionDB.getConexionDB(acceso.usuario1, acceso.contraseña1).getConn();

    
    
    public static void Guardar(Usuario usuario)  {

        String sql = "INSERT INTO admin.USUARIOS(NOMBRE, APELLIDO, CORREO_ELECTRONICO,CONTRASEÑA)"
                + " VALUES(?,?,?,?);\n "
                + "ALTER SESSION SET _ORACLE_SCRIPT =TRUE;\n" +
                "CREATE USER '"+usuario.getNombre()+"' identified by '"+usuario.getContraseña()+"';\n"
                + "GRANT CONNECT TO "+usuario.getNombre()+"\n"
                + "GRANT SELECT,INSERT,UPDATE, ON admin.Dispositivo TO "+usuario.getNombre()+";";

        
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, usuario.getNombre());
            st.setString(2, usuario.getApellido());
            st.setString(3, usuario.getCorreo());
            st.setString(4, usuario.getContraseña());
            st.executeUpdate();

            /* Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
             */
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en crear dispositivo");
        }

        /*+dispositivo.getCorreoElectronico()  + "', '" + dispositivo.getNombre() + "', '"
                + dispositivo.getTipo() + "', '" + dispositivo.getConexion() + "', '" + dispositivo.isVisible() + "', '"
                + dispositivo.isVisible() + "', '" + dispositivo.getNumero() + "');";*/
    }

    public static void eliminar(String dato) throws SQLException {
        try {
            String sql = "DELETE FROM admin.USUARIOS WHERE ID = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, dato);
            st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
    }

    public static void actualizar(Usuario usuario, String dato) throws SQLException {
        String sql = "UPDATE  admin.USUARIOS SET"
                + "(NOMBRE = '?', APELLIDO = '?', CORREO_ELECTRONICO = '?',CONTRASEÑA = '?') WHERE ID = '?'";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, usuario.getNombre());
            st.setString(2, usuario.getApellido());
            st.setString(3, usuario.getCorreo());
            st.setString(4, usuario.getContraseña());
            st.setString(5, dato);
            
            
            
            st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en editar datos");
        }

    }

   

   

}
