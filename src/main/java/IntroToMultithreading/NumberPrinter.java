package IntroToMultithreading;

public class NumberPrinter implements Runnable{
    private int number;

    public NumberPrinter(int number){
        this.number = number;
    }

    void print(){
        System.out.println("Printing "+number+" from "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}
