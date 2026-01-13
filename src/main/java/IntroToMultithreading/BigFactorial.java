package IntroToMultithreading;

import java.math.BigInteger;

public class BigFactorial extends Thread {
    private final int number;
    private BigInteger factorial;

    public BigFactorial(int number) {
        this.number = number;
        factorial = BigInteger.ONE;
    }

    @Override
    public void run() {
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    public static void main(String[] args) throws InterruptedException {
        BigFactorial calculator = new BigFactorial(10);
        calculator.start();
        calculator.join(); // Wait for the thread to finish

        System.out.println("Factorial of 100: " + calculator.getFactorial());
    }

}
