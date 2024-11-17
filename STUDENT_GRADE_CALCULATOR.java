

import java.util.Scanner;

public class CGPACalculator{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
                System.out.print("Re-enter marks for subject " + i + " (out of 100): ");
                marks = scanner.nextInt();
            }

            totalMarks = totalMarks + marks;
        }
        double averagePercentage = (double) totalMarks / numSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("   Result   ");
        System.out.println(" Total Marks : " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f ", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
