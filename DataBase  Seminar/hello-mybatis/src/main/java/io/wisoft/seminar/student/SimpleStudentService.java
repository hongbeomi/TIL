package io.wisoft.seminar.student;

import io.wisoft.seminar.configure.ConnectionMaker;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class SimpleStudentService implements StudentService {

    final ConnectionMaker connectionMaker = new ConnectionMaker();

    @Override
    public int insertStudent(final Student student) {
        int result = 0;

        try (final SqlSession sqlSession = connectionMaker.getSqlSession()) {
            final StudentService service = sqlSession.getMapper(StudentService.class);
            result = service.insertStudent(student);
            sqlSession.commit();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertStudentList(final List<Student> studentList) {
        int result = 0;

        try (final SqlSession sqlSession = connectionMaker.getSqlSession()) {
            final StudentService service = sqlSession.getMapper(StudentService.class);
            result = service.insertStudentList(studentList);
            sqlSession.commit();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertStudentListBatch(final List<Student> studentList) {
        int result = 0;

        try (final SqlSession sqlSession = connectionMaker.getSqlSession(ExecutorType.BATCH)) {
            final StudentService service = sqlSession.getMapper(StudentService.class);
            for (final  Student student : studentList) {
                result += service.insertStudent(student);

            }
            sqlSession.flushStatements();
            sqlSession.commit();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Student> getStudentAll() {
        List<Student> studentList = new ArrayList<>();

        try (final SqlSession sqlSession = connectionMaker.getSqlSession()) {
            final StudentService service = sqlSession.getMapper(StudentService.class);
            studentList = service.getStudentAll();
        } catch (final  Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public List<Student> getStudentListByNo(final List<String> studentNoList) {
        List<Student> studentList = new ArrayList<>();

        try (final SqlSession sqlSession = connectionMaker.getSqlSession()) {
            final StudentService service = sqlSession.getMapper(StudentService.class);
            studentList = service.getStudentListByNo(studentNoList);
        } catch (final  Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

}
