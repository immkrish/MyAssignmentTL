package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 30;
		// TODO Auto-generated method stub
		for (int i = 2; i < n / 2; i++)

		{
			if (n % i == 0) {
				System.out.println(n + " is a prime number.");
			}
			System.out.println(i);
		}

	}
}