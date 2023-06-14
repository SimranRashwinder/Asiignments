import java.util.Scanner;
/** In this class, we are going to test our program that whether it runs well or not.
 * we are going to create a new college object in which I will add the students and then perform different operations removeStudent, highestGpa etc on it.
 * I used the idea from the bank example provided by the professor in the class and notes and nothing else is used.
 */
public class CollegeTester {
    public static void main(String[] args) {
        College Langara = new College();//COLLEGE object in which we can add students
        int option = 0;
        int n; //number of students in the College
        System.out.println("How many students you want to add:");
        //Please enter an integer
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while  (option != 4) {
            System.out.println("You have some while adding students: option 1 for Regular Student, 2 for Graduate student and 3 for International Student and 4 to exit");
            option = input.nextInt();
            if (option == 1) {
                Student S1 = new Student();
                S1.addCourse();
                for (int i = 1; i < n; i++) {
                    Langara.addStudent(S1);
                    S1.getStudentName();
                    S1.calculateGpa();
                    S1.getAddress();
                    System.out.println(S1);
                }
            } else if (option == 2) {
                Student S2 = new GraduateStudent();
                S2.addCourse();
                for (int i = 1; i < n; i++) {
                    Langara.addStudent(S2);
                    S2.getStudentName();
                    S2.calculateGpa();
                    ((GraduateStudent) S2).getSupervisorName();
                    S2.getAddress();
                    System.out.println(S2);
                }
            } else if (option == 3) {
                Student S3 = new InternationalStudent();
                S3.addCourse();
                for (int i = 1; i < n; i++) {
                    Langara.addStudent(S3);;
                    S3.getStudentName();
                    S3.calculateGpa();
                    ((InternationalStudent) S3).getCountryName();
                    S3.getAddress();
                    System.out.println(S3);
                }
            }

        }
    }
}


