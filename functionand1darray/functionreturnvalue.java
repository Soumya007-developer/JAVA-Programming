package functionand1darray;

public class functionreturnvalue {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		int sum = additionReturn(30,40);
		System.out.println(sum);
		System.out.println("Bye");

	}
	public static int additionReturn(int a, int b) {
		int sum = a + b;
		return sum;
		
		
	}

}
