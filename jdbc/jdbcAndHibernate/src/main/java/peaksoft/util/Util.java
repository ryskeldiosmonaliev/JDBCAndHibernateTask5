package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final  String url ="jdbc:postgresql://localhost:5432/Uzer";
    private static final String user = "postgres";
    private static final String password ="romaroma21roma";

    public static Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,user, password);
            System.out.println("connekten boldu  чын ");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
