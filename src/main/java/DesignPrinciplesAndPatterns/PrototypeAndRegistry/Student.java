package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private double psp;
    private int gradYear;
    private StudentType course;
    private int lengthOfCourse;
    private int amountPaid;

    public Student(int id, String name, double psp, int gradYear) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.gradYear = gradYear;
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.psp = student.psp;
        this.gradYear = student.gradYear;
        this.course = student.course;
        this.lengthOfCourse = student.lengthOfCourse;
        this.amountPaid = student.amountPaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getLengthOfCourse() {
        return lengthOfCourse;
    }

    public void setLengthOfCourse(int lengthOfCourse) {
        this.lengthOfCourse = lengthOfCourse;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public StudentType getCourse() {
        return course;
    }

    public void setCourse(StudentType course) {
        this.course = course;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

}
