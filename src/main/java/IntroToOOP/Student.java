package IntroToOOP;

public class Student {
    int id;
    public String name;
    protected int age;
    private int salary;
    private Exam enrollmentExam;

    public Student(){

    }

    public Student(String newName){
        id = 0;
        name = newName;
        age = 21;
        salary = 8000;
        enrollmentExam = new Exam(1,0);
    }

    public Student(String newName, int newSalary){
        id = 0;
        name = newName;
        age = 21;
        salary = newSalary ;
        enrollmentExam = new Exam(1,0);
    }

    public Student(String newName, int newAge, int newSalary, int newId, Exam newEnrollmentExam){
        name = newName;
        age = newAge;
        salary = newSalary;
        id = newId;
        enrollmentExam = newEnrollmentExam;
    }

    public Student(Student original) {
        name = original.name;
        age = original.age;
        salary = original.salary;
        id = original.id;
//        enrollmentExam = original.enrollmentExam; //it will not new exam object - shallow copy
        enrollmentExam = new Exam(original.enrollmentExam);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
