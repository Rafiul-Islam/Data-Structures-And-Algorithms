import java.util.Scanner;

public class BinarySearch {

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

		System.out.println(binary_search(array, findingNumber) ? "This Number Exist" : "This Number doesn't Exist");

		scanner.close();

	}

	public static boolean binary_search(int[] array, int findingNumber) {
		int firstIndex = 0;
		int lastIndex = array.length - 1;
		int midIndex;
		boolean result = false;

		while (firstIndex <= lastIndex) {

			midIndex = (firstIndex + lastIndex) / 2;

			if (array[midIndex] == findingNumber || array[firstIndex] == findingNumber
					|| array[lastIndex] == findingNumber) {
				result = true;
			}
			if (array[midIndex] < findingNumber) {
				firstIndex = midIndex + 1;
			} else {
				lastIndex = midIndex - 1;
			}

		}
		return result;
	}

}
