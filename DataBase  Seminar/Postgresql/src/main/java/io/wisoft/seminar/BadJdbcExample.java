package io.wisoft.seminar;

import java.sql.*;

public class BadJdbcExample {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercise", "scott", "tiger");

            Statement stmt;
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()){
                System.out.print("[학번] "+ rs.getString(1)+" || ");
                System.out.print("[이름] "+ rs.getString(2)+" || ");
                System.out.println("[생일] "+ rs.getString(3));
            }

            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            System.out.format("SQLExection: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }

}
