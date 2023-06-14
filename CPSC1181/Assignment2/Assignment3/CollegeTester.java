import java.util.Scanner;

/** In this class, we are going to test our program that whether it runs well or not.
 * we are going to create a new college object in which I will add the students and then perform different operations removeStudent, highestGpa etc on it.
 * I used the idea from the bank example provided by the professor in the class and notes and nothing else is used.
 */
public class CollegeTester {
   public static void main(String[] args) {
      College Langara = new College();//COLLEGE object in which we can add students
      Student S1 = new Student();
      S1.addCourse();
      int n; //number of students in the College
      System.out.println("How many students you want to add:");
      //Please enter an integer
      Scanner input = new Scanner(System.in);
      n = input.nextInt();


      for(int i =1; i<n; i++){
         Langara.addStudent(S1);
         System.out.println("Enter the first Name and last Name for the student you want to add:");
         S1.getStudentName();
         System.out.println("Enter the marks earned for that student");
         S1.calculateGpa();
      }

      System.out.println("The student Number of the student you added is:"+ "\nAs expected: " +S1.getStudentNumber() + "\nIn reality " + S1.getStudentNumber());
      System.out.println("Student with student Number " + S1.getStudentNumber() +" has the maximum gpa which is " + Langara.highestGpa());
      System.out.println("Student have loginId: \nas expected: " + S1.getLoginId() + "\nIn Reality: " + S1.getLoginId());
   }

}