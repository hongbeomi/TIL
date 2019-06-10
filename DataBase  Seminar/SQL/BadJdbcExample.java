package com.SQL;

import java.sql.*;

public class BadJdbcExample {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercise", "scott", "tiger");

            Statement stmt;
            stmt = conn.createStatement();

            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM STUDENT ORDER BY name");

//            if (stmt.execute("SELECT * FROM STUDENT ORDER BY name")) {
//                rs = stmt.getResultSet();
//            }

            while (rs.next()) {
                System.out.print("[�й�]" + rs.getString(1) + " || ");
                System.out.print("[�̸�]" + rs.getString(2) + " || ");
                System.out.println("[����]" + rs.getString(3));
            }

            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException sqex){
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        }
    }

}
