package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args){
        Student st = new Student(1, "Rahul", 89.9, 2023);
        IntelligentStudent ist = new IntelligentStudent(2, "Mayur", 99, 2025, 111);

        //create copy of both objects
//        Student stcopy = new Student(st);
//        IntelligentStudent istcopy = new IntelligentStudent(ist);
//
//        System.out.println(st.hashCode()+st.getName()+"-"+stcopy.hashCode()+stcopy.getName());
//        System.out.println(ist.hashCode()+ist.getName()+"-"+istcopy.hashCode()+istcopy.getName());

        Student st1 = st.copy();
        System.out.println(st1.getName());
//        st1 = ist.copy();
        System.out.println(st1.getName());
        Student ist1 = ist.copy();

        System.out.println(st.hashCode()+st.getName()+"-"+st1.hashCode()+st1.getName());
        System.out.println(ist.hashCode()+ist.getName()+"-"+ist1.hashCode()+ist1.getName());

        StudentUtility.createCopy(st1);
        StudentUtility.createCopy(ist1);

        StudentRegistry studentRegistry = new StudentRegistry();
        Student devOps_student = studentRegistry.get(StudentType.DEV_OPS);
        Student swStudent = studentRegistry.get(StudentType.SOFTWARE);


    }
}
