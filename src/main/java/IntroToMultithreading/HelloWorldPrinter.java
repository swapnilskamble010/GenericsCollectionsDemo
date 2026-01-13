package IntroToMultithreading;

public class HelloWorldPrinter implements Runnable {
    void print(){
        System.out.println("Hello World from "+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() );
        print();
    }
}
