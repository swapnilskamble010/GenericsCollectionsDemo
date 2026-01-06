package inheritance_constructors;

public class C extends B {
    public C() {
        //super(); //by default
        super(1);
        System.out.println("Constructor C");
    }
}
