package university.management.system;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
            Driver driver = new Driver();
            c = DriverManager.getConnection("jdbc:mysql://localhost:3308/ums","root","");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
