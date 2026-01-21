package interviewcode;

public class SynBlock extends Thread {

	@Override
	public void run() {
			synchronized (this) {
				
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 7);
			}
		}
	}

	public static void main(String[] args) {

		SynBlock s1 = new SynBlock();
		s1.start();

		Thread t2 = new Thread(s1);
		t2.start();

		Thread t3 = new Thread(s1);
		t3.start();
	}

}
