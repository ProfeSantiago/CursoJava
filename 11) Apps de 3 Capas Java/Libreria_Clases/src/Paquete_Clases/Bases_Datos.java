/** ********************************************
 * SGSVA 11-01-2019
 * @author: Santiago Rodríguez Paniagua
 *
 ***********************************************/
package Paquete_Clases;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Bases_Datos {
//-----------------------------------
//Declaración de Variables Globales
Connection Conexion = null;
Statement Objeto;
public ResultSet Registro;
//----------------------------------

    public Bases_Datos(){//Constructor    
    }//--------------------------------------------------------------    
    
    public void Conectar(String DBODBC){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Conexion = DriverManager.getConnection("jdbc:odbc:"+DBODBC," "," "); 
            Objeto = Conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------    

    public void ConectarSQL(String DBODBC){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName="+DBODBC+";user=sa;password= ;"); 
            Objeto = Conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
}//-------------------------------------------------------------- 
    
    public void Consultar(String TablaBD){
        try {            
            Registro = Objeto.executeQuery("Select * From "+TablaBD);            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }//--------------------------------------------------------------    
    
     public void DesConectar(){
        try {
            Registro.close();
        } catch (SQLException ex) {
            Logger.getLogger(Bases_Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//--------------------------------------------------------------    

/*****************************************************************
 * Las sigientes Funciones para BD no son generales como las de
 * arriba, solo sirven para la mini Agenda de Access
 *****************************************************************/
     public void Insertar(String Ced, String Nom, String Tel){
        try {
            Objeto.executeUpdate("Insert into Personas Values('" + Ced +"','"+ Nom +"','"+ Tel +"','0','0')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------    

    public void Actualizar(String Ced, String Nom, String Tel){
        try {
            Objeto.executeUpdate("Update Personas Set Nombre = '"+ Nom +"', Telefono ='"+ Tel +"' Where "+ "Cedula = '" + Ced +"'");
            //Objeto.executeUpdate("Update Personas Set Nombre= 'Lalita', Telefono = '6854627' Where Cedula = '02' ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------    

}//Bases_Datos
