package features.impl;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class LambdaInCallable {
    public static int[] numbersInArray = IntStream.rangeClosed(0, 5000).toArray();
    public static int totalByIntStreamSum = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable1 = () -> {
          int sum = 0;
          for (int i = 0; i < numbersInArray.length/2; i++)
              sum += numbersInArray[i];
          return sum;
        };

        Callable<Integer> callable2 = () -> {
            int sum = 0;
            for (int i = numbersInArray.length/2; i < numbersInArray.length; i++)
                sum += numbersInArray[i];
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> tasks = List.of(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(tasks);

        int k = 1;
        int sum = 0;
        for (Future<Integer> result : results) {
            sum = sum + result.get();
            System.out.println("Sum of " + k + " is: " + result.get());
            k++;
        }
        System.out.println("Sum from the Callable is: " + sum);
        System.out.println("Sum from IntStream is: " + totalByIntStreamSum);
        executorService.shutdown();
    }
}