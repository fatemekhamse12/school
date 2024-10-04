package DataBase;

import java.sql.*;

public class database {
    public database() {
    }

    public static Connection getConnection(){
        String Url = "jdbc:postgresql://localhost:5432/school";
        String username = "postgres";
        String password = "123jongmin";
        try {
            Connection conn = DriverManager.getConnection(Url, username, password);
            System.out.println("connection established");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (
                SQLException e) {
                    e.printStackTrace();

        }
    }

}
