import DataBase.database;

import java.sql.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String Url="jdbc:postgresql://localhost:5432/school";
        String username="postgres";
        String password="123jongmin";
        try{
            Connection conn = DriverManager.getConnection(Url,username,password);
            System.out.println("connection established");
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        catch (SQLException e){
            e.printStackTrace();

        }


    }

}