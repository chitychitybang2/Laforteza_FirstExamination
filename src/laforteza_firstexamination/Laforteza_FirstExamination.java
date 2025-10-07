package laforteza_firstexamination;

import java.util.Scanner;

class Student {
    String fullName;
    String address;
    int gradeLevel;
    String gender;
    double gwa;
    String remarks;

   
        Student(String fullName, String address, int gradeLevel, String gender, double gwa) {
            this.fullName = fullName;
            this.address = address;
            this.gradeLevel = gradeLevel;
            this.gender = gender;
            this.gwa = gwa;
            
            if (gwa >= 75){
            remarks = "PASSED!!";
            } else {
                remarks = "FAILED!";
            }
        }

            void displayInfo() {
                System.out.println("Full Name: " + fullName);
                System.out.println("Address: " + address);
                System.out.println("Grade Level(1-12): " + gradeLevel);
                System.out.println("Gender: " + gender);
                System.out.println("GWA: " + gwa + "%");
                System.out.println("\nRemarks: " + remarks);
                System.out.println("---------------------------------");
            }
    }

public class Laforteza_FirstExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students to enroll: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
            Student[] students = new Student[n];
        
        
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter student's info " + (i + 1) + ":");

                System.out.print("Full Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("Grade Level: ");
                int gradeLevel = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Gender: ");
                String gender = sc.nextLine();

                System.out.print("GWA (%): ");
                double gwa = sc.nextDouble();
                sc.nextLine(); 
           
                students[i] = new Student(name, address, gradeLevel, gender, gwa);
            }   
       
                System.out.println("\n=== Student Enrollment ===");
                    for (int i = 0; i < n; i++) {
                    students[i].displayInfo();
            }

        sc.close();
    }
}
