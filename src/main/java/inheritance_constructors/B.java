package inheritance_constructors;

public class B extends A {
    int x;

    public B() {
        System.out.println("Constructor B");
    }

    public B(int value) {
        this(); //call the same class constructor
        x = value;
        System.out.println("Parameterised Constructor B");
    }
}
//this() and super() has to be in the first line
//you can only do one