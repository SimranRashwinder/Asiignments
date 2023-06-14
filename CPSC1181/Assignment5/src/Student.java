import java.util.Scanner;
/**This project(Assignment 5) is submitted by Name:Simran(SID: 100377444)
 * Course: CPSC 1181
 * This is Student class which is super class and contains all instance variables and methods*/
public class Student {
    private String StudentName;
    private String address;
    private int studentNumber;
    private double gpa;
    private int StudentNumber;
    private String loginId;
    private  int numberOfCourses;
    private  int numberOfCredits;
    private int gradePoints;
    private double tuitionFees;
    public static double feesPerCredit = 107.62;
    public static int lastAssignedNumber = 10000000;

    public Student() {
        StudentNumber = lastAssignedNumber++;
    }
    public Student(String address, String StdName, String FIRST, String LAST) {
        StdName = FIRST + LAST ;
        System.out.println("Enter the first Name and last Name:");
        String firstName = input.next();
        // System.out.println("Enter the last NAME:");
        String lastName = input.next();
    }

    Scanner input = new Scanner(System.in);
    /**This method is used to get the name of the student*/
    private String firstName = input.next();
   // System.out.println("Enter the last NAME:");
    private String lastName = input.next();
    public String getStudentName() {

        this.StudentName = firstName + lastName;
        return StudentName;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentNumber(){
        studentNumber = lastAssignedNumber++;
        return StudentNumber;
    }
    public int addCourse(){
        numberOfCourses++;
        System.out.println("Enter the grades for the this course:");
        gradePoints = input.nextInt();
        gradePoints++;
        return numberOfCourses;
    }
    /**calculateGpa will calculate the gpa of every student which is total grades/total credits*/

    public double calculateGpa(){
        gpa = (gradePoints/numberOfCourses)*3;
        return gpa;
    }
    /**This method will calculate the loginId */
    public String getLoginId() {
        String s = Integer.toString(studentNumber);
        if(lastName.length()>3){
            loginId = firstName.substring(0,1)+ lastName.substring(0,3) +s.substring(s.length()-3);
        }else if (lastName.length() <3){
            String last = lastName +"  ";
            loginId = firstName.substring(0,1)+ last.substring(0,3) +s.substring(s.length()-3);
        }

        return loginId;
    }
    public double getTuitionFees(){
        tuitionFees = numberOfCredits*feesPerCredit;
        return tuitionFees;
    }
    @Override
    public boolean equals(Object otherObject ){
        Student other = (Student) otherObject;
        return StudentName.equals(other.StudentName) && StudentNumber == other.StudentNumber;
    }


    @Override
    public String toString(){
        return "Student[StudentName= " + StudentName + " StudentNumber= " + StudentNumber +" Address= " + address + " Login Id= " + "]";
    }

}
