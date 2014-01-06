
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeremygillet
 */
public class main {
    
    public static void main(String[] args){
        
        Statement stmt = null;
        ResultSet rs = null;
        /* Chargement du driver JDBC pour MySQL */
try {
    Class.forName("com.mysql.jdbc.Driver");
} 
catch ( ClassNotFoundException e ) {
            System.out.println("exception chargement driver jdbc");
    /* Gérer les éventuelles erreurs ici. */
}    

//conexion à la base de donnees
String url = "jdbc:mysql:/localhost/projetannuel-";
Connection conn = null;

try {
conn = DriverManager.getConnection(url, "root","");
stmt.executeUpdate("INSERT INTO PERSONNE VALUES ('1', 'M','MOI','JEAN' )");
rs = stmt.executeQuery("SELECT * FROM PERSONNE");
if (stmt.execute("SELECT * FROM PERSONNE")) {
    rs = stmt.getResultSet();
    
    }

}
catch (SQLException ex) {
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}

//System.out.println("resultat" + rs);



        
    }
    
}
