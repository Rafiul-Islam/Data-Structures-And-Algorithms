import java.util.Scanner;

public class QuickSort {

	private static void printArray(int[] array) {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}// end print method

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Array Length: ");
		int arraylength = scanner.nextInt();

		System.out.println("Array Elements: ");
		int array[] = new int[arraylength];

		for (int i = 0; i < arraylength; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Before Sorting : ");
		printArray(array);

		array = quick_sort(array, 0, array.length - 1);
		System.out.println("After Sorting : ");
		printArray(array);

	}// end main method here

	private static int[] quick_sort(int[] array, int left, int right) {

		if (array.length <= 1) {
			return array;
		}

		int index = partition(array, left, right);

		if (left < index - 1) {
			quick_sort(array, left, index - 1);
		}
		if (index < right) {

			quick_sort(array, index, right);
		}

		return array;
	}// end quick sort here

	private static int partition(int[] array, int left, int right) {

		int pivot = array[(left + right) / 2];

		while (left <= right) {
			while (array[left] < pivot)
				left++;

			while (array[right] > pivot)
				right--;

			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;

				left++;
				right--;
			}
		}

		return left;
	}// end partition here
}
