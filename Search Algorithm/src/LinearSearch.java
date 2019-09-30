import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("array Length: ");
		int arraylength = scanner.nextInt();

		System.out.println("Array Elements: ");
		int array[] = new int[arraylength];

		for (int i = 0; i < arraylength; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print("Finding Number: ");
		int findingNumber = scanner.nextInt();

		System.out.println(Linear_search(array, findingNumber) ? "This Number Exist" : "This Number doesn't Exist");

		scanner.close();

	}

	public static boolean Linear_search(int[] array, int findTheNumber) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == findTheNumber) {
				return true;
			}
		}

		return false;
	}

}
