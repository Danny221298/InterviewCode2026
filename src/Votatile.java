
class SharedObject {

	private boolean flag = false;

	public void setFlag() {
		flag = true;
	}

	public void getFlage() {
		while (!flag) {

		}
		System.out.println("Flag set flase succesfully");
	}
}

public class Votatile {

	public static void main(String[] args) {

		SharedObject v1 = new SharedObject();

		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			v1.setFlag();
		});

		Thread t2 = new Thread(() -> {
			v1.getFlage();
		});

		t1.start();
		t2.start();

	}
}
