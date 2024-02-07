package yg;

import java.util.Arrays;
import java.util.Scanner;

public class Student implements Comparable<Student> {

	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {

		return this.grade - o.grade;
	}

	public static void main(String[] args) {
		Student[] array = { new Student("Sue", 7), new Student("Tessy", 5), new Student("Esti", 9),
				new Student("Adeena", 3) };
		System.out.println("Original array:");
		for (Student s : array) {
			System.out.println(s.getName() + " " + s.getGrade());

		}

		QuickSort<Student> quickSort = new QuickSort<>();
		Student[] newArray = quickSort.sort(Arrays.copyOf(array, 4), 0, array.length - 1);

		System.out.println("\nQuickSorted array:");
		for (Student s : newArray) {
			System.out.println(s.getName() + " " + s.getGrade());

		}
		MergeSort<Student> mergeSort = new MergeSort<>();
		Student[] mergeArray = mergeSort.sort(Arrays.copyOf(array, 4));

		System.out.println("\nMergeSorted array:");
		for (Student s : mergeArray) {
			System.out.println(s.getName() + " " + s.getGrade());

		}

		Scanner k = new Scanner(System.in);
		System.out.println("How Many Students Would You Like To Be Include In This Test?");
		int numberOfStudents = k.nextInt();
		Student[] students = new Student[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			k.nextLine();
			System.out.println("What is the name of the student number " + (i + 1));
			String name = k.nextLine();
			System.out.println("What is the grade of the student number " + (i + 1));
			int grade = k.nextInt();
			Student s = new Student(name, grade);
			students[i] = s;

		}
		
		Student[] quickStudents = quickSort.sort(Arrays.copyOf(students, 4), 0, students.length - 1);

		System.out.println("\nQuickSorted array:");
		for (Student s : quickStudents) {
			System.out.println(s.getName() + " " + s.getGrade());

		}
		
		Student[] mergedArray = mergeSort.sort(Arrays.copyOf(students, 4));

		System.out.println("\nMergeSorted array:");
		for (Student s : mergedArray) {
			System.out.println(s.getName() + " " + s.getGrade());

		}
		
	}

}
