package com.task2;

import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        double total = 0;
        double average;
        char grade;

        // 1️⃣ Input: Take number of subjects
        System.out.print("Enter number of subjects: ");
        numberOfSubjects = sc.nextInt();

        // 2️⃣ Input: Take marks for each subject (out of 100)
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = sc.nextDouble();

            // Validate input (marks should be between 0 and 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--; // repeat same subject
                continue;
            }

            total += marks;
        }

        // 3️⃣ Calculate Total Marks
        System.out.println("\nTotal Marks: " + total);

        // 4️⃣ Calculate Average Percentage
        average = total / numberOfSubjects;
        System.out.println("Average Percentage: " + average + "%");

        // 5️⃣ Grade Calculation
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 6️⃣ Display Grade
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
