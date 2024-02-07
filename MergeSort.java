package yg;

import java.util.ArrayList;
import java.util.Arrays;



	public class MergeSort<T extends Comparable<T>> {

		public static void main(String[] args) {
			Student[] array = { new Student("Sue", 7), new Student("Tessy", 5), new Student("Esti", 9),
					new Student("Adeena", 3) };
			System.out.println("Original array:");
			for (Student s : array) {
				System.out.println(s.getName() + " " + s.getGrade());

			}

			MergeSort<Student> mergeSort = new MergeSort<>();
			Student[] newArray=mergeSort.sort(Arrays.copyOf(array,4));

			System.out.println("\nSorted array:");
			for (Student s : newArray) {
				System.out.println(s.getName() + " " + s.getGrade());

			}

		}

		public T[] sort(T[] array) {
			int n = array.length;

			if (n > 1) {
				int mid = n / 2;

				// Split the array into two halves
				T[] leftArray = Arrays.copyOfRange(array, 0, mid);
				T[] rightArray = Arrays.copyOfRange(array, mid, n);

				// Recursively sort the two halves
				sort(leftArray);
				sort(rightArray);

				// Merge the sorted halves
				merge(array, leftArray, rightArray);
			}
			return array;
		}

		private void merge(T[] array, T[] leftArray, T[] rightArray) {
			int leftLength = leftArray.length;
			int rightLength = rightArray.length;

			int i = 0, j = 0, k = 0;

			// Merge elements from leftArray and rightArray into array
			while (i < leftLength && j < rightLength) {
				if (leftArray[i].compareTo(rightArray[j]) <= 0) {
					array[k] = leftArray[i];
					i++;
				} else {
					array[k] = rightArray[j];
					j++;
				}
				k++;
			}

			// Copy remaining elements of leftArray, if any
			while (i < leftLength) {
				array[k] = leftArray[i];
				i++;
				k++;
			}

			// Copy remaining elements of rightArray, if any
			while (j < rightLength) {
				array[k] = rightArray[j];
				j++;
				k++;
			}
		}

	

}
