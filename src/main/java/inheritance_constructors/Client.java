package inheritance_constructors;

public class Client {
    public static void main(String[] args) {
        D d = new D();
        B b = new B(9);
        Util util = new Util();
        util.m(d);
        util.m(b);
    }
}
