
package Paquetin;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
    
//-----------------------------------
//Declaración de Variables Globales
Connection Conexion = null;
Statement Objeto;
CallableStatement Obj_Procedimiento = null;
public ResultSet Registro;
//----------------------------------

     public void Conectar_MySQL(String DBODBC){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
            Objeto = Conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------  
    
/*******************************************************************************
 *  NOTA: Estas Funciones y métodos NO son Funcionales, son solo de Ejemplo
********************************************************************************/

    public void Consultar(String TablaBD){
        try {
            Registro = Objeto.executeQuery("Select * From "+TablaBD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------


    public void Buscar(String TablaBD, String Ced){
        try {
            Registro = Objeto.executeQuery("Select * From "+TablaBD + " Where "+ "Identificador = '" + Ced +"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------

      public void Actualizar(String Ced, String Nom,String Tel){
        try {
            Objeto.executeUpdate("Update Persona Set Nombre = '"+ Nom+"', Telefono ='"+ Tel +"' Where "+ "Identificador = '" + Ced +"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------

    public void Insertar(String Ced, String Nom, String Tel){
        try {
            Objeto.executeUpdate("Insert into Persona Values('" + Ced +"','"+ Nom +"','"+Tel +"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------

//******************************************************************************

}//Fin Capa_2
