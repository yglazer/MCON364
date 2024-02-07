package yg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort<T extends Comparable<T>> {

	    public static void main(String[] args) {
	        Student[] array = {new Student("Sue",7), new Student("Tessy",5), new Student("Esti", 9), new Student("Adeena",3)};
	        System.out.println("Original array:");
	        for (Student s: array) {
	        	System.out.println(s.getName()+" "+s.getGrade());
	        	
	        }

	        QuickSort<Student> quickSort = new QuickSort<>();
	        Student[] newArray=quickSort.sort(Arrays.copyOf(array,4), 0, array.length - 1);

	        System.out.println("\nSorted array:");
	        for (Student s: newArray) {
	        	System.out.println(s.getName()+" "+s.getGrade());
	        	
	        }
	        
	        Scanner k = new Scanner (System.in);
			System.out.println("How Many Students Would You Like To Be Include In This Test?");
			int numberOfStudents = k.nextInt();
			Student [] students = new Student [numberOfStudents];
			for (int i=0; i<numberOfStudents; i++) {
				k.nextLine();
				System.out.println("What is the name of the student number "+(i+1));
				String name = k.nextLine();
				System.out.println("What is the grade of the student number "+(i+1));
				int grade = k.nextInt();
				Student s = new Student(name,grade);
				students[i] = s;
				
			}

	    }

	    public T[] sort(T[] array, int low, int high) {
	        if (low < high) {
	            // Partition the array, and get the index of the pivot element
	            int pivotIndex = partition(array, low, high);

	            // Recursively sort the subarrays on both sides of the pivot
	            sort(array, low, pivotIndex - 1);
	            sort(array, pivotIndex + 1, high);
	            
	        }
			return array;
	    }

	    private int partition(T[] array, int low, int high) {
	        T pivot = array[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (array[j].compareTo(pivot) <= 0) {
	                i++;

	                // Swap array[i] and array[j]
	                T temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        // Swap array[i+1] and array[high] (pivot)
	        T temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        return i + 1;
	    }

	    
	}


