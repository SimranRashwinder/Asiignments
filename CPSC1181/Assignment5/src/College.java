import java.util.ArrayList;
/**In this I have created A college class which contains different methods like addStudent to add the student, removeStudent to remove the student, getHighest gpa of students based on student Id
 */
public class College {
    public ArrayList<Student> students;
    public College(){
        students = new ArrayList<Student>();
    }
    /** addStudent adds a new student to teh college arraylist*/
    public void addStudent(Student a){
        students.add(a);
    }
    /** removeStudent removes a new student from the college arraylist*/
    public void removeStudent(Student a){
        students.remove(a);
    }
    /** findStudent finds a student from the  college arraylist who have some given studentNumber*/
    public Student findStudent(int studentNumber){
        for(Student a: students){
            if(a.getStudentNumber() == studentNumber) {
                return a;
            }
        }
        return null;
    }

    /** The method below identifies the student who have highestGpa
     * highestGpa is the method
     * @return highGpa is used for student object who have the highestGpa from college
     */
    public Student highestGpa() {
        Student highGpa = students.get(0);

        for (int i = 1; i < students.size(); i++) {
            Student a = students.get(i);
            if (a.calculateGpa() > highGpa.calculateGpa()) {
                highGpa = a;
            }
        }
        return highGpa;
    }


    public String toString(){
        return "College " + students.toString();
    }
}
