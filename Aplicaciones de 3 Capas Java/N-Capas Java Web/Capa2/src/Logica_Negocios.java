import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logica_Negocios {
//-----------------------------------
//Declaración de Variables Globales
Connection Conexion = null;
Statement Objeto;
public ResultSet Registro;
//----------------------------------

    public Logica_Negocios() {} //Constructor de la Clase

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

    public ResultSet Consultar(String TablaBD){
        try {
            Registro = Objeto.executeQuery("Select * From "+TablaBD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Registro;
    }//--------------------------------------------------------------

     public void DesConectar(){
        try {
            Registro.close();
        } catch (SQLException ex) {
            Logger.getLogger(Logica_Negocios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//--------------------------------------------------------------

     public void Insertar(String Ced, String Nom, String Tel){
        try {
            Objeto.executeUpdate("Insert into Datos Values('" + Ced +"','"+ Nom +"','"+ Tel +"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------

    public void Actualizar(String Ced, String Nom, String Tel){
        try {
            Objeto.executeUpdate("Update Datos Set Nombre = '"+ Nom +"', Telefono ='"+ Tel +"' Where "+ "Cedula = '" + Ced +"'");
            //Objeto.executeUpdate("Update Personas Set Nombre= 'Lalita', Telefono = '6854627' Where Cedula = '02' ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//--------------------------------------------------------------



}
