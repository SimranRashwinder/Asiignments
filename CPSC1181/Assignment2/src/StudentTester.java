import java.util.Scanner;
/**This is the test class for Student having main method in it*/
public class StudentTester {
    public static void main(String[] args){
/**Let us say S1 is the first student, so we will find the student number, name and gpa for that student
 we will also find the login the id
 we will get the input for the first name and last name
 */
        Student S1 = new Student();

        S1.addCourse();

        Scanner input = new Scanner(System.in);

 /** The following print statements shows the expected values of name, student number gpa and loginid and the one that is obtained by the code*/
        System.out.println("The student number of the first student is: \n as expected" +S1.getStudentNumber() +"\nReal is " + S1.getStudentNumber() );
        System.out.println("The name of the first student is: \n as expected- "+ S1.getStudentName() + "\n Real is " + S1.getStudentName());

        System.out.println("The gpa of the first student is: \n as expected- "+S1.calculateGpa() +"\n Real gpa is "+ S1.calculateGpa());

        System.out.println("The loginId of the first student is: \n as expected- "+S1.getLoginId() +"\n Real loginId is "+ S1.getLoginId());
    }
}
