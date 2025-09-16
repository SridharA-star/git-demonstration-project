package basic;

public class HelloWorld {
	public void weclomeMsg() { // from d1 branch
		System.out.println("welcome to java programming!");
	}
    public void displayMsg() { // from c1 branch 
		System.out.println("This is my first java program");
	}
    // from branch b1
    public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		obj.weclomeMsg();

	}

}
