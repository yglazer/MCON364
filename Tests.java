package yg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Tests {

	
	@Test
	public void StudentCompareTo() {
		Student s = new Student("Sue", 3);
		Student f = new Student("Rose", 4);
		assertEquals(-1, s.compareTo(f));
	}
	@Test
	public void studentQuickSortGetGradeFirst() {
		Student[] array = { new Student("Sue", 7), new Student("Tessy", 5), new Student("Esti", 9),
				new Student("Adeena", 3) };
		QuickSort<Student> quickSort = new QuickSort<>();
		Student [] newArray = quickSort.sort(array, 0, array.length - 1);
		assertEquals(3,newArray[0].getGrade());
		
	}
	@Test
	public void studentQuickSortGetNameFirst() {
		Student[] array = { new Student("Sue", 7), new Student("Tessy", 5), new Student("Esti", 9),
				new Student("Adeena", 3) };
		QuickSort<Student> quickSort = new QuickSort<>();
		Student [] newArray = quickSort.sort(array, 0, array.length - 1);
		assertEquals("Adeena",newArray[0].getName());
		
	}
	@Test
	public void studentQuickSortGetGradeLast() {
		Student[] array = { new Student("Sue", 7), new Student("Tessy", 5), new Student("Esti", 9),
				new Student("Adeena", 3) };
		QuickSort<Student> quickSort = new QuickSort<>();
		Student [] newArray = quickSort.sort(array, 0, array.length - 1);
		assertEquals(9,newArray[3].getGrade());
		
	}

	

}
