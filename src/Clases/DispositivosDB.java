package Clases;

import Ventanas.Interfaz;
import java.sql.*;

/**
 *
 * @author oscar
 */
public class DispositivosDB {

    public static Interfaz acceso = new Interfaz();

    private static final Connection conn = ConexionDB.getConexionDB(acceso.usuario1, acceso.contraseña1).getConn();

    public static void Guardar(Dispositivos dispositivo) throws SQLException {

        String nombre=dispositivo.getNombre();
        String tipo=dispositivo.getTipo();
        String encendido=dispositivo.isEncendido();
        
        String sql = "INSERT INTO admin.DISPOSITIVO(CORREO, NOMBRE, TIPO, CONEXION, VISIBLE,ENCENDIDO, NUMERO)"
                + " VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, dispositivo.getCorreoElectronico());
            st.setString(2, nombre);
            st.setString(3, tipo);
            st.setString(4, dispositivo.getConexion());
            st.setString(5, dispositivo.isVisible());
            st.setString(6, encendido);
            st.setString(7, dispositivo.getNumero());
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
            String sql = "DELETE FROM admin.Dispositivo WHERE ID = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, dato);
            st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
    }

    public static void actualizar(Dispositivos dispositivo, String dato) throws SQLException {
        String sql = "UPDATE  admin.Dispositivo SET "
                + "CORREO ='" + dispositivo.getCorreoElectronico() + "', NOMBRE ='" + dispositivo.getNombre()
                + "', VISIBLE = '" + dispositivo.isVisible() + "', ENCENDIDO = '"+dispositivo.isEncendido()+"' WHERE ID = '" + dato + "'";

        
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en editar datos");
        }

    }

   

}
