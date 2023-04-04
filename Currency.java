package currency;

import java.util.Scanner;

public class Currency {


	int[] sort(int arr[])
	{
		int [] arrSorted;

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		arrSorted = arr;
		return arrSorted;

	}

	void printArray(int [] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);
		}

		System.out.println();
	}


	public static void main(String[] args) {

		int sizeOfDenomination;
		int arrayCurrencyDenomination[];
		int arrayCurrencyCount[];
		int paymentValue;


		Currency currency = new Currency();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations: ");

		sizeOfDenomination = input.nextInt();

		arrayCurrencyDenomination = new int[sizeOfDenomination];
		arrayCurrencyCount = new int[sizeOfDenomination];

		System.out.println("Enter the currency denominations value: ");

		for (int i = 0; i < arrayCurrencyDenomination.length; i++) {

			arrayCurrencyDenomination[i] = input.nextInt();
		}

		
		arrayCurrencyDenomination = currency.sort(arrayCurrencyDenomination);
		currency.printArray(arrayCurrencyDenomination);

		System.out.println("Enter the amount you want to pay: ");

		paymentValue = input.nextInt();

		for (int i = arrayCurrencyDenomination.length -1 ; i >= 0; i--) {
			if (paymentValue >= arrayCurrencyDenomination[i]) {
				arrayCurrencyCount[i] = paymentValue / arrayCurrencyDenomination[i];
				paymentValue = paymentValue - arrayCurrencyCount[i] * arrayCurrencyDenomination[i];
			}
		}

		for (int i = 0; i < arrayCurrencyCount.length; i++) {
			if (arrayCurrencyCount[i] != 0) {
				System.out.println(arrayCurrencyDenomination[i] + " : " + arrayCurrencyCount[i]);  
			}
		}

		input.close();
	}

}

