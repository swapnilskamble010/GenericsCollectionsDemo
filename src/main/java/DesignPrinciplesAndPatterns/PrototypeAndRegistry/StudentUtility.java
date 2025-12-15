package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class StudentUtility {
    public static void createCopy(Student student) {
        Student s1 = student.copy();
        System.out.println("Name: " + s1.getName()+"--"+s1.hashCode());
    }
}
