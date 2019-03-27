/*****************************************************************
 * Funciones para BD - Lic.Santiago Rodríguez Paniagua
 *****************************************************************/
package NCapas;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
*/
public class Capa_2 {
    
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
    
    public void Conectar_ODBC(String DBODBC){
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
    
    public void Conectar_JavaDB(String laBaseDatos){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Conexion = DriverManager.getConnection("jdbc:derby://localhost:1527/"+laBaseDatos, "PruebaUsr", "");
            Objeto = Conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------    
    
     public void Conectar_SQL(String BD_SQL){
        try {//Se debe agregar la librería sqljdbc.jar para poder Correrlo
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName="+BD_SQL+";user=sa;password= ;");
            Objeto = Conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
}//--------------------------------------------------------------
        
     public void DesConectar(){
        try {
            Registro.close();
        } catch (SQLException ex) {
            Logger.getLogger(Capa_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//--------------------------------------------------------------    
     
    public void Insertar_Proc(String Ced, String Nom, String Dir, String Tel){
        try {
            //Llamar al procedimiento
            Obj_Procedimiento = Conexion.prepareCall("{call Ins_Persona(?,?,?)}");
            //Definir la Entradas o parametros (?) del Procedimiento Almacenado
            Obj_Procedimiento.setString(1, Ced); 
            Obj_Procedimiento.setString(2, Nom); 
            Obj_Procedimiento.setString(3, Tel);
            //Ejecutamos el Procedimiento
            Obj_Procedimiento.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Capa_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//--------------------------------------------------------------  
    
    public void Actualizar_Proc(String Ced, String Nom, String Dir, String Tel){
        try {
            //Llamar al procedimiento
            Obj_Procedimiento = Conexion.prepareCall("{call Up_Persona(?,?,?)}");
            //Definir la Entradas o parametros (?) del Procedimiento Almacenado
            Obj_Procedimiento.setString(1, Ced); 
            Obj_Procedimiento.setString(2, Nom); 
            Obj_Procedimiento.setString(3, Tel);
            //Ejecutamos el Procedimiento
            Obj_Procedimiento.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Capa_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//--------------------------------------------------------------  
    
     public void Buscar_Proc(String Ced){
        try {
            //Llamar al procedimiento
            Obj_Procedimiento = Conexion.prepareCall("{call All_Persona(?)}");
            //Definir la Entradas o parametros (?) del Procedimiento Almacenado
            Obj_Procedimiento.setString(1, Ced);     
            //Ejecutamos el Procedimiento
            Registro = Obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Capa_2.class.getName()).log(Level.SEVERE, null, ex);
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
