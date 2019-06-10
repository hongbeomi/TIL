package io.wisoft.seminar;

import io.wisoft.seminar.student.SimpleStudentService;
import io.wisoft.seminar.student.Student;
import io.wisoft.seminar.student.StudentService;
import org.apache.commons.lang3.time.StopWatch;

import java.util.List;

public class Application {

    public static void main(final String... args) {

        final StudentService service = new SimpleStudentService();
        int count = 0;
        final StopWatch stopWatch = new StopWatch();
        List<Student> studentList;
        System.out.println();

        System.out.println("전체 사용자 목록 조회");
        studentList = service.getStudentAll();
        studentList.forEach(System.out::println);
        System.out.println();

//        System.out.println("여러 사용자 목록 조회");
//        List<String> noList = List.of("KBC", "SBC");
//        studentList = service.getStudentListByNo(noList);
//        studentList.forEach(System.out::println);
//        System.out.println();

//        System.out.println("사용자 등록");
//        final Student student = new Student("00000001", "하녕구", "2000-01-01");
//        count = service.insertStudent(student);
//        System.out.println(count + "행이 등록되었습니다.");
//        System.out.println();
//
//        System.out.println("사용자 목록 등록 1");
//        final List<Student> newStudentList1 = List.of(
//                new Student("00000002", "알파고1", "2000-01-01" ),
//                new Student("00000003", "알파고2", "2000-01-01" ),
//                new Student("00000004", "알파고3", "2000-01-01" ),
//                new Student("00000005", "알파고4", "2000-01-01" )
//                );
//
//        stopWatch.start();
//        count = service.insertStudentList(newStudentList1);
//        stopWatch.stop();
//        System.out.println(count + "행이 등록되었습니다. [소요시간]" + stopWatch.getNanoTime());
//        System.out.println();
//
//        System.out.println("사용자 목록 등록 2");
//        final List<Student> newStudentList2 = List.of(
//                new Student("00000006", "알파고5", "2000-01-01"),
//                new Student("00000007", "알파고6", "2000-01-01"),
//                new Student("00000008", "알파고7", "2000-01-01"),
//                new Student("00000009", "알파고8", "2000-01-01")
//        );
//
//        stopWatch.reset();
//        stopWatch.start();
//        count = service.insertStudentListBatch(newStudentList2);
//        stopWatch.stop();
//        System.out.println(count + "행이 등록되었습니다. [소요시간]" + stopWatch.getNanoTime());
//        System.out.println();
    }

}
