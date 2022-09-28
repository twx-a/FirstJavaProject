package helloWorld;

public class multiplyNum {
    void multiply() { // if void value
	multiply(5); // default value
    }

    void multiply(int tableParams) { // if one parameter is provided
	multiply(tableParams, 1, 10);
    }

    void multiply(int tableParams, int start, int end) { // if 3 parameters is provided
	for (int i = start; i <= end; i += 1) {
	    System.out.printf("%d * %d = %d", tableParams, i, tableParams * i).println();
	}
    }
}
