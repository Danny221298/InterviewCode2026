package Accenture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		for (int i = 1; i < 5; i++) {
			int k=i;
			executorService.submit(() -> {
				System.out.println(k*5);
			});
		}
		executorService.shutdown();
	}
}
