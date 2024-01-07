package concurrency;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFactorialMultiThreading {

	public static void main(String[] args) throws InterruptedException,ExecutionException {


	    Scanner scanner = new Scanner(new InputStreamReader(System.in));
	    System.out.println(" Please enter the number for which you want to calculate Factorial");
	    String input = scanner.nextLine();
	    int number = 0;
	    int answer = 1;
	    scanner.close();
	    if (input != null)
	            number = Integer.valueOf(input);
	    if (number == 0 || number == 1){
	            answer = 1;
	    }
	    calcuateFactorial(number, answer);

	}

	private static void calcuateFactorial(int number, int answer) throws InterruptedException, ExecutionException {
	    ExecutorService executor = Executors.newFixedThreadPool(10);
	    List<Future<Integer>> totalTaskResults = new ArrayList<Future<Integer>>();
	    for (int start = 1; start <= number; start++){
	        int end = start + 1;
	        Future<Integer> taskResult;
	        if(end > start)
	            taskResult = executor.submit(new Multiply(start, 1));
	        else 
	            taskResult = executor.submit(new Multiply(start, end));
	        totalTaskResults.add(taskResult);

	    }

	    for (Future<Integer> future : totalTaskResults){
	        answer = answer * future.get();
	    }
	    executor.shutdown();
	    System.out.println("Answer "+ answer);
	}

}
