package io.wisoft.seminar.student;

import io.wisoft.seminar.util.PgSqlAccess;

import java.sql.*;

public class StudentUpdateService {

    public void updateStudentBirthday(final Student student) {
        final String query = "UPDATE student SET birthday = ? WHERE no = ?";
        try (Connection conn = PgSqlAccess.setConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            conn.setAutoCommit(false);

            ps.setDate(1, Date.valueOf(student.getBirthday()));
            ps.setString(2, student.getNo());

            final int result = ps.executeUpdate();
            conn.commit();
            System.out.println(result + "건이 처리되었습니다.");
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }

    public void updateStudentBirthdayMultiBatch(final Student[] students) {
        final String query = "UPDATE student SET birthday = ? WHERE no = ?";
        try (Connection conn = PgSqlAccess.setConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            conn.setAutoCommit(false);

            for (Student student : students) {
                if (student.getBirthday() == null) {
                    ps.setNull(1, Types.DATE);
                } else {
                    ps.setDate(1, Date.valueOf(student.getBirthday()));
                }

                ps.setString(2, student.getNo());
                ps.addBatch();
                ps.clearParameters();
            }
            //생일 널 검사 하기
            final int[] result = ps.executeBatch();
            conn.commit();
            System.out.println(result.length + "건이 처리되었습니다.");
        } catch (SQLException e) {
            System.out.format("SQLException: %s, SQLState: %s", e.getMessage(), e.getSQLState());
        }
    }

}
