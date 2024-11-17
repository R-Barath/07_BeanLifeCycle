package in.barath.beans;

//performing lifecycle methedology
public class Motor {

	public Motor() {
		System.out.println("Motor :: constructor");
		// TODO Auto-generated constructor stub
	}

	// init
	public void start() {
		System.out.println("Motor started...");
	}

	public void doWork() {
		System.out.println("Motor is running...rwwww");

	}

//destroy
	public void stop() {
		System.out.println("Motor is stopped...ufff");
	}

}
