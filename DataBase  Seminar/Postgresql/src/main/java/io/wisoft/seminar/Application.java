package io.wisoft.seminar;

import io.wisoft.seminar.student.*;

public class Application {

    public static void main(String[] args) {
        final StudentSelectService selectService = new StudentSelectService();

        System.out.println("전체 학생을 조회합니다.");
        selectService.getStudentAll();
        System.out.println();
//
//        selectService.getStudentByNo("20142024");
//        selectService.getStudentByName("안홍범");
//        selectService.getStudentByBirthday("1995-07-01");

        final StudentInsertService insertService = new StudentInsertService();

        final Student student = new Student();
        final Student[] students = new Student[4];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

//        System.out.println("학번이 20192020이고, 이름이 한한한인 학생을 추가합니다");
//        student.setNo("20192020");
//        student.setName("한한한");
//        insertService.insertStudent(student);
//        System.out.println();

//        System.out.println("학번이 01010101이고, 이름이 이이이인 학생을 추가합니다.");
//        students[0].setNo("01010101");
//        students[0].setName("이이이");
//
//        System.out.println("학번이 01010102이고, 이름이 최최최인 학생을 추가합니다.");
//        students[1].setNo("01010102");
//        students[1].setName("최최최");
//
//        System.out.println("학번이 01010103이고, 이름이 추추추인 학생을 추가합니다.");
//        students[2].setNo("01010103");
//        students[2].setName("추추추");
//
//        System.out.println("학번이 01010104이고, 이름이 조조조인 학생을 추가합니다.");
//        students[3].setNo("01010104");
//        students[3].setName("조조조");
//
//        insertService.insertStudentMulti(students);

//        System.out.println("학번이 01010105이고, 이름이 신신신인 학생을 추가합니다.");
//        students[0].setNo("01010105");
//        students[0].setName("신신신");
//
//        System.out.println("학번이 01010106이고, 이름이 진진진인 학생을 추가합니다.");
//        students[1].setNo("01010106");
//        students[1].setName("진진진");
//
//        System.out.println("학번이 01010107이고, 이름이 피피피인 학생을 추가합니다.");
//        students[2].setNo("01010107");
//        students[2].setName("피피피");
//
//        System.out.println("학번이 01010108이고, 이름이 키키키인 학생을 추가합니다.");
//        students[3].setNo("01010108");
//        students[3].setName("키키키");
//
//        insertService.insertStudentMultiBatch(students);

//        final StudentUpdateService updateService = new StudentUpdateService();
//        System.out.println("학번이 01010108인 학생의 생일을 1995-01-01로 변경합니다.");
//        student.setNo("01010108");
//        student.setBirthday("1995-01-01");
//        updateService.updateStudentBirthday(student);
//        System.out.println();

//        System.out.println("학번이 01010101인 학생의 생일을 1995-01-02로 변경합니다.");
//        students[0].setNo("01010101");
//        students[0].setBirthday("1995-01-02");
//
//        System.out.println("학번이 01010102인 학생의 생일을 1995-01-03로 변경합니다.");
//        students[1].setNo("01010102");
//        students[1].setBirthday("1995-01-03");
//
//        System.out.println("학번이 01010103인 학생의 생일을 1995-01-04로 변경합니다.");
//        students[2].setNo("01010103");
//        students[2].setBirthday("1995-01-04");
//
//        final StudentUpdateService updateService = new StudentUpdateService();
//        updateService.updateStudentBirthdayMultiBatch(students);
//        System.out.println();

//        final StudentDeleteService deleteService = new StudentDeleteService();
//
//        System.out.println("학번이 01010108인 학생을 목록에서 제거합니다.");
//        deleteService.deleteStudentNo("20192020");
//        System.out.println();

//        System.out.println("학번이 01010104~01010107인 학생을 목록에서 제거합니다.");
//        String[] numbers = {"01010104", "01010105", "01010106", "01010107"};
//        deleteService.deleteStudentMultiBatch(numbers);
//        System.out.println();
    }

}
