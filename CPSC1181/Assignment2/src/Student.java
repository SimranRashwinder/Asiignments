import javax.print.DocFlavor;
import java.util.Scanner;

/**This is Student class which contains all instance variables and methods*/
public class Student {

      //private String firstName;
      //private String lastName;

      private String StudentName;
      private String address;
      private int studentNumber;
      private double gpa;
      private int StudentNumber;
      private String loginId;
      private  int numberOfCourses;
      private int gradePoints;
      public static int lastAssignedNumber = 10000000;

      public Student() {
            StudentNumber = lastAssignedNumber++;
      }
      public Student(String address, String StdName, String FIRST, String LAST) {
            StdName = FIRST + LAST ;
            System.out.println("Enter the first Name and last Name:");
      }

      Scanner input = new Scanner(System.in);
      /**This method is used to get the name of the student*/
      private String firstName = input.next();
      //System.out.println("Enter the last NAME:");
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
            gpa = gradePoints/numberOfCourses*3;
            return gpa;
      }
/**This method will calculate the loginId */
      public String getLoginId() {
           String s = Integer.toString(studentNumber);

           loginId = firstName.substring(0,1)+ lastName.substring(0,3) +s.substring(s.length()-3); //+ s.substring(s.length()-3) ;
            return loginId;
      }



}
