import java.util.Arrays;
import java.util.Scanner;

public class Main15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(input);
		System.out.println();

		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i] + " ");
		}

	}

}