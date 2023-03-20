
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rnals
 */
public class DB_MAN {
    String strDriver = "com.mysql.jdbc.Driver";
    //String strURL = "jdbc:sqlserver://10.70.31.80:1433;DatabaseName=Automobile;";
    String strURL = "jdbc:mysql://127.0.0.1:3306/Point?characterEncoding=UTF-8&serverTimezone=UTC";
        String strUser = "root";
    String strPWD = "inha1958";
    //String strURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Automobile;";
    
    //String strURL = "jdbc:oracle:thin:@10.70.41.80:1433";

    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException{
        try{
            Class.forName(strDriver);
            
            DB_con = DriverManager.getConnection(strURL,strUser,strPWD);
            DB_stmt = DB_con.createStatement();
            
        } catch(Exception e){
            System.out.println("SQLException: "+e.getMessage());
        }
    }
    
    
    public void dbClose() throws IOException{
        try{
            DB_stmt.close();
            DB_con.close();
        } catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
    
