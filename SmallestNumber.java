import java.util.Scanner;

public class SmallestNumber{
	public static int smallestNumberTernary(int a, int b, int c){
		return a<b?((a<c)?a:c):((b<c)?b:c); 
	}
	
	public static int smallestNumberMath(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	
	public static void runTests() {
        // Test case 1
        int num1 = 5;
        int num2 = 3;
        int num3 = 8;
        System.out.println("Test 1: Input: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Ternary Operator: " + smallestNumberTernary(num1, num2, num3));
        System.out.println("Math.min Operator: " + smallestNumberMath(num1, num2, num3));
        System.out.println();

        // Add more test cases as needed...
    }

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		scanner.close();
		
		System.out.println("Ternary Operator: " + smallestNumberTernary(num1, num2, num3));
		System.out.println("Math.in Operator: " + smallestNumberMath(num1, num2, num3));

		// Run the tests
        runTests();
	}
}