package week1.day2;

public class CalculatorPractise {

	private int addTwoNumbers(int num1, int num2) {
		return num1 + num2;

	}
	public float mul(int num1, float num2) {
		return num1 * num2;
	}

	public int sub() {
		return (5 - 1);
	}

	public static void main(String[] args) {
		CalculatorPractise c = new CalculatorPractise();
		System.out.println(c.addTwoNumbers(5, 5));
	}

}
