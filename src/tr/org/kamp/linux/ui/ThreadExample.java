package tr.org.kamp.linux.ui;

public class ThreadExample {
	public static void main(String[] args) {
		new Thread (new Runnable() {
			public void run() {
				System.out.println("0th job.");
			};
		}).start();
		System.out.println("First job.");
		System.out.println("Second job.");
		System.out.println("3rd job.");
		
		new Thread (new Runnable() {
			public void run() {
				System.out.println("4th job.");
			};
		}).start();
		new Thread (new Runnable() {
			public void run() {
				System.out.println("5th job.");
			};
		}).start();
		new Thread (new Runnable() {
			public void run() {
				System.out.println("6th job.");
			};
		}).start();
	}

}
