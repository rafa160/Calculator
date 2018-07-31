package Calculator;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose your Operation.\n \n[1] - Multiplication \n[2] - Division \n[3] - Addition \n[4] - Subtration \n[0] - Exit");

		String typeOfOperation = scanner.next();

		System.out.println();

		String operation = typeOfOperation(typeOfOperation);

		System.out.println();

		System.out.println("Great! you choose the " + operation + " Let's Begin...");

		System.out.println("\n\nType your first number:");
		String firstNumber = scanner.next();

		System.out.println("\n\nType your second number:");
		String secondNumber = scanner.next();

		double calculatedResult = performCalculation(typeOfOperation, firstNumber, secondNumber);

		System.out.println("The result of the " + operation + " is: " + calculatedResult);

		System.out.println();

		scanner.close();

	}

	private static double performCalculation(String typeOfOperationSelected, String number1, String number2) {

		double result1 = Double.parseDouble(number1);

		double result2 = Double.parseDouble(number2);

		switch (typeOfOperationSelected) {

		case "1":
			return result1 * result2;
		case "2":
			return result1 / result2;
		case "3":
			return result1 + result2;
		case "4":
			return result1 - result2;
		default:
			return 0;

		}

	}

	private static String typeOfOperation(String typeOfOperation) {

		switch (typeOfOperation) {

		case "1":
			return "Multiplication";
		case "2":
			return "Division";
		case "3":
			return "Addition";
		case "4":
			return "Subtration";
		default:
			return "Operation Not Found! Start Again...";
		}

	}

}
