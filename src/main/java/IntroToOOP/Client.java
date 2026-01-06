package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Amey");
        student.age =12;
        student.id = 1;
        student.name = "Santros";
        student.setSalary(900);

        //Method 1- create copy
        Student studentCopy = student;
        studentCopy.age = student.age;
        studentCopy.name = student.name;
//        studentCopy.setSalary(student.getSalary());
        studentCopy.id = student.id;

        System.out.println(studentCopy.toString()+"--"+ student.toString());

        //Method 2 - copy constructor
        Student studentCopy1 = new Student(student);
        System.out.println(studentCopy1);

        Student student2 = new Student("Baba", 4329);
        Student studentCopy2 = new Student(student2);
        System.out.println(studentCopy1);

    }
}
