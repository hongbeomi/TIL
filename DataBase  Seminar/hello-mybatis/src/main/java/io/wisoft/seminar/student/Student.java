package io.wisoft.seminar.student;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Student {

    private String no;
    private String name;
    private String birthday;
    private int sal;


    Student() {
    }

    public Student(String no, String name, String birthday, int sal) {
        this.no = no;
        this.name = name;
        this.birthday = birthday;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
//                .append("drm_code", no)
//                .append("drm_name", name)
//                .append("drm_prd", birthday)
                .append("emp_sal", sal)
                .toString();
    }

}
