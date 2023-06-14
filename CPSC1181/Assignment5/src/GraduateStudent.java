public class GraduateStudent extends Student{
    private int numberOfCourses;
    private double gpa;
    private String loginId;
    private String researchTopic;
    private String supervisorName;
    public int addCourse(){
        super.addCourse();
        return numberOfCourses;
    }

    public String getResearchTopic() {
        return researchTopic;
    }
    public String getSupervisorName(){
        return supervisorName;
    }

    /**calculateGpa will calculate the gpa of every student which is total grades/total credits*/

    public double calculateGpa(){
        super.calculateGpa();
        return gpa;
    }
    /**This method will calculate the loginId */
    public String getLoginId() {
        super.getLoginId();
        return loginId;
    }
    public String toString(){
        return "Graduate Student: [" + super.toString() +" Research Topic= " + researchTopic + " Supervisor Name= "+ supervisorName;
    }


}
