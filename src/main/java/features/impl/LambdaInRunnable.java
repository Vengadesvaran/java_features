package features.impl;

public class LambdaInRunnable {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++)
                    sum += i;
                System.out.println("Sum by traditional: " + sum);
            }
        };
        new Thread(runnable1).start();

        Runnable runnable2 = () -> {
            int sum = 0;
            for (int i = 0; i < 15; i++)
                sum += i;
            System.out.println("Sum by implement lambda: " + sum);
        };
        new Thread(runnable2).start();

        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 20; i++)
                sum += i;
            System.out.println("Sum by thread lambda: " + sum);
        }).start();
    }
}