package javafullstack;

import java.util.Scanner;

public class Oopsarray {
	String name;
	int mark1, mark2;
	String result;
	double cgpa;
	String grade;

	void getDetails(String name, int mark1, int mark2) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;

		result = (mark1 >= 50 && mark2 >= 50) ? "pass" : "fail";
		cgpa = (float) (mark1 + mark2) / 2;
		if (result != "fail") {
			if (cgpa <= 100 && cgpa >= 90) {
				grade = "1st class with distinction";
			} else if (cgpa >= 80 && cgpa < 90) {
				grade = "1st class";
			} else if (cgpa >= 70 && cgpa < 80) {
				grade = "2nd calss";
			} else if (cgpa >= 60 && cgpa < 70) {
				grade = "3rd class";
			} else {
				grade = "4th class";
			}
		} else {
			grade = "RA";
		}
	}

	void display() {

		System.out.println("Name: " + this.name);
		System.out.println("Mark 1: " + this.mark1);
		System.out.println("Mark 2: " + this.mark2);
		System.out.println("cgpa  :" + this.cgpa);
		System.out.println("Result: " + this.result);
		System.out.println("grade : " + this.grade);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();
		Oopsarray[] students = new Oopsarray[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of student " + (i + 1) + ": ");
			String name = scanner.next();
			System.out.print("Enter mark 1 of student " + (i + 1) + ": ");
			int mark1 = scanner.nextInt();
			System.out.print("Enter mark 2 of student " + (i + 1) + ": ");
			int mark2 = scanner.nextInt();
			System.out.println();

			students[i] = new Oopsarray();
			students[i].getDetails(name, mark1, mark2);
		}
		for (int i = 0; i < n; i++) {
			students[i].display();
		}

	}
}
