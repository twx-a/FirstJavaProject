package helloWorld;

public class multiplyView {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	multiplyNum app = new multiplyNum(); // new instance variable
	app.multiply(); // call default method from instance
	System.out.println("-----");
	app.multiply(3); // call second method
	System.out.println("-----");
	app.multiply(9, 20, 30); // call third method
    }

}
