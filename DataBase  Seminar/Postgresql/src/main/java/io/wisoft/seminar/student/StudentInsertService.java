package io.wisoft.seminar.student;

import io.wisoft.seminar.util.PgSqlAccess;

import java.sql.*;

public class StudentInsertService {

    public void insertStudent(final Student student) {
        final String query = "INSERT INTO student VALUES(?, ?, ?)";
        try (Connection conn = PgSqlAccess.setConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            conn.setAutoCommit(false);
            ps.setString(1, student.getNo());
            ps.setString(2, student.getName());

            if (student.getBirthday() == null) {
                ps.setNull(3, Types.DATE);
            } else {
                ps.setDate(3, Date.valueOf(student.getBirthday()));
            }

            final int result = ps.executeUpdate();
            conn.commit();
            System.out.println(result + "건의 사항이 처리되었습니다.");
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }

    public void insertStudentMulti(final Student[] students) {
        final String query = "INSERT INTO student VALUES(?, ?, ?)";
        try (Connection conn = PgSqlAccess.setConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            conn.setAutoCommit(false);

            int retValue = 0;
            for (Student student : students) {
                if (student.getNo() == null || student.getName() == null) {
                    break;
                }

                ps.setString(1, student.getNo());
                ps.setString(2, student.getName());
                if (student.getBirthday() == null) {
                    ps.setNull(3, Types.DATE);
                } else {
                    ps.setDate(3, Date.valueOf(student.getBirthday()));
                }

                retValue += ps.executeUpdate();
                ps.clearParameters();
            }
            conn.commit();

            System.out.println(retValue + "건이 처리되었습니다.");
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }

    public void insertStudentMultiBatch(final Student[] students) {
        final String query = "INSERT INTO student VALUES(?, ?, ?)";
        try (Connection conn = PgSqlAccess.setConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            conn.setAutoCommit(false);

            for (Student student : students) {
                if (student.getNo() == null || student.getName() == null) {
                    break;
                }

                ps.setString(1, student.getNo());
                ps.setString(2, student.getName());
                if (student.getBirthday() == null) {
                    ps.setNull(3, Types.DATE);
                } else {
                    ps.setDate(3, Date.valueOf(student.getBirthday()));
                }

                ps.addBatch();
                ps.clearParameters();
            }

            int[] retValue = ps.executeBatch();
            conn.commit();

            System.out.println(retValue.length + "건이 처리되었습니다.");
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }


}
