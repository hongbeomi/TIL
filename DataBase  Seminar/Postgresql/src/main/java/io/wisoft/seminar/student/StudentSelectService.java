package io.wisoft.seminar.student;

import io.wisoft.seminar.util.PgSqlAccess;

import java.sql.*;

public class StudentSelectService {

    public void getStudentAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = PgSqlAccess.setConnection();

            final String query = "SELECT * from student";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                printStudent(rs);
            }
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }
        }

    }

    public void getStudentAll2() {
        final String query = "SELECT * FROM student";

        try (Connection conn = PgSqlAccess.setConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                printStudent(rs);
            }
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }

    public void getStudentByNo(final String no) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            final String query = "SELECT * FROM student WHERE no = ?";
            conn = PgSqlAccess.setConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, no);
            rs = ps.executeQuery();

            while (rs.next()) {
                printStudent(rs);
            }
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }
        }
    }

    public void getStudentByName(final String name) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            final String query = "SELECT * FROM student WHERE name = ?";
            conn = PgSqlAccess.setConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();

            while (rs.next()) {
                printStudent(rs);
            }
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }
        }
    }

    public void getStudentByBirthday(final String birthday) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            final String query = "SELECT * FROM student WHERE birthday = ?";
            conn = PgSqlAccess.setConnection();
            ps = conn.prepareStatement(query);
            ps.setDate(1, Date.valueOf(birthday));
            rs = ps.executeQuery();

            while (rs.next()) {
                printStudent(rs);
            }
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
                }
            }
        }
    }

    private void printStudent(ResultSet rs) throws SQLException {
        System.out.print("[학번] " + rs.getString(1) + " || ");
        System.out.print("[이름] " + rs.getString(2) + " || ");
        System.out.println("[생일] " + rs.getString(3));
    }

}
