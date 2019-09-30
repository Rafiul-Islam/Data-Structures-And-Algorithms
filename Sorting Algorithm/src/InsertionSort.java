import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Array Length: ");
		int arraylength = scanner.nextInt();
		int temp, j;

		System.out.println("Array Elements: ");
		int array[] = new int[arraylength];

		for (int i = 0; i < arraylength; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 1; i < array.length; i++) {
			temp = array[i];

			j = i - 1;
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}

		System.out.print("\nAfter Sorting : ");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
