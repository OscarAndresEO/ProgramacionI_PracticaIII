
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class ConexionDB {
    
    
     private String cadenaConexion;
    private Connection conn;
    private static ConexionDB conexionDb;

    public boolean acceso;
    
    
    ConexionDB(String usuario,String contraseña) throws ClassNotFoundException{
        this.cadenaConexion = "jdbc:oracle:thin:"+usuario+"/"+contraseña+"@localhost:1521:XE";
        
        try{
           conn = DriverManager.getConnection(cadenaConexion);
            this.acceso = true;
            
        }catch(SQLException ex){
            System.out.println("Error: " +ex);
            this.acceso = false;
        }
        
    }
    
    public static ConexionDB getConexionDB(String usuario,String contraseña) {
        if(conexionDb == null){
            try {
                conexionDb = new ConexionDB(usuario, contraseña);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexionDb;
    }
    
    public Connection getConn(){
        return conn;
    }

   

    
}
