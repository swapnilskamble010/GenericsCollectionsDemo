package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<StudentType, Student> studentRegistry = new HashMap<>();

    public StudentRegistry() {
        Student dataScienceStudent = new Student(3, "DS", 90,2019);
        dataScienceStudent.setCourse(StudentType.DATA_SCIENCE);
        dataScienceStudent.setLengthOfCourse(12);
        dataScienceStudent.setAmountPaid(500);

        Student devOpsStudent = new Student(5, "DOPS", 91,2018);
        devOpsStudent.setCourse(StudentType.DEV_OPS);
        devOpsStudent.setLengthOfCourse(9);
        devOpsStudent.setAmountPaid(300);

        Student softwareStudent = new Student(4, "SWE", 92,2017);
        softwareStudent.setCourse(StudentType.SOFTWARE);
        softwareStudent.setLengthOfCourse(18);
        softwareStudent.setAmountPaid(800);

        studentRegistry.put(StudentType.DATA_SCIENCE, dataScienceStudent);
        studentRegistry.put(StudentType.DEV_OPS, devOpsStudent);
        studentRegistry.put(StudentType.SOFTWARE, softwareStudent);
    }

    public void add(StudentType studentTypeKey, Student student) {
        studentRegistry.put(studentTypeKey, student);
    }

    public Student get(StudentType studentTypeKey) {
        return studentRegistry.get(studentTypeKey).copy();
    }

}
