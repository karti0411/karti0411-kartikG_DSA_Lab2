package transcation;

import java.util.Scanner;

public class TransactionNew {

	public static void main(String[] args) {

		int sizeOfArray;
		int target;

		int transcationArray[];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of transaction array: ");

		if (input.hasNextInt()) {
			sizeOfArray = input.nextInt();

			if (sizeOfArray > 0) {

				transcationArray = new int[sizeOfArray];
				
				System.out.println("Enter the values of array: ");

				for (int i = 0; i < transcationArray.length; i++) {

					if (input.hasNextInt()) {
						transcationArray[i] = input.nextInt();
					} else {
						System.out.println("Please enter a valid transaction");
					}
				}

				System.out.println("Enter the total no of targets that needs to be achieved: ");

				if (input.hasNextInt()) {

					target = input.nextInt();

					for (int i = 0; i < target; i++) {

						System.out.println("Enter the value of target: ");

						int targetValue = input.nextInt();

						int sum = 0;

						for (int j = 0; j < transcationArray.length; j++) {

							sum += sum + transcationArray[j];

							if (sum > targetValue) {

								int index = j + 1;
								System.out.println("Target achieved after " + index + " transactions");
								break;
							}
						}
					}
				} else {
					System.out.println("Please enter a valid input: ");
				}

			} else {
				System.out.println("Please enter a valid input: ");
			}

		} else {
			System.out.println(input.nextInt() + " is valid transaction");
		}

	}
}

