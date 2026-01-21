package CodePractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {

	public static void main(String[] args) {

		ExecutorService executorService = (ExecutorService) Executors.newFixedThreadPool(2);

		for (int i = 1; i < 300; i++) {
			int j = i;
			executorService.submit(() -> {
				System.out.println(j * 5);
			});
		}
		executorService.shutdown();
	}
}
