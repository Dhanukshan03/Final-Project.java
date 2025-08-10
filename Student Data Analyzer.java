import java.util.Scanner;
class Person {
    String name_p;
    int age_p;
    
    Person(String val1, int val2) {
        this.name_p = val1;
        this.age_p = val2;
    }
    
    void displayBasicDetails(){
        System.out.println("Name: " + name_p);
        System.out.println("Age: " + age_p);
        System.out.println("You are a major.\nKindly try again and enter a student's details.");
    }
    
    boolean isMinor(){
        if (age_p<18) {
            return true;
        }
        else {
            return false;
        }
    }
}
class Student {
    String name_s;
    int age_s;
    double grade1, grade2, grade3, average;
    
    Student(String val3, int val4){
        this.name_s = val3;
        this.age_s = val4;
    }
    
    Student(double x, double y, double z){
        this.grade1 = x;
        this.grade2 = y;
        this.grade3 = z;
    }

      void displayStudentDetails(){
        System.out.println("\n\n--- Student Details ---\n\n");
        System.out.println("Name: " + name_s);
        System.out.println("Age: " + age_s);
    }
    
    void calculateAverage(){
        double average = (grade1 + grade2 + grade3)/3;
        System.out.println("Average: " + average);
    }
    
    void getHighestGrade(){
        double max = Math.max(grade1, Math.max(grade2, grade3));
        System.out.println("Highest Grade: " + max);
    }
    
    void hasPassed(){
        average = (grade1 + grade2 + grade3)/3;
        if (average >= 50){
            System.out.println("Status: Passed\nCongratulations for your achievement!");
        }
        else {
            System.out.println("Status: Failed\nDon't worry. Better luck next time!");
        }
    } 

    void displayGrades(){
        System.out.println("Grade 1:" + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
    }
}

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    
    if (age > 18) {
    Person someone = new Person(name, age);
    someone.displayBasicDetails();
    }
    else {
    System.out.print("Enter your Grade 1: ");
    double grade1 = scanner.nextDouble();
    System.out.print("Enter your Grade 2: ");
    double grade2 = scanner.nextDouble();
    System.out.print("Enter your Grade 3: ");
    double grade3 = scanner.nextDouble();
    Student student = new Student(name, age);
    student.displayStudentDetails();
    Student student1 = new Student(grade1, grade2, grade3);
    student1.displayGrades();
    Student student2 = new Student(grade1, grade2, grade3);
    student2.calculateAverage();
    Student student3 = new Student(grade1, grade2, grade3);
    student3.getHighestGrade();
    Student student4 = new Student(grade1, grade2, grade3);
    student4.hasPassed();
    System.out.println("Note: " + "Student is a Minor.");
    scanner.close();    
        }
    }
}