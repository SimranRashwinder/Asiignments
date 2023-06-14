/**This is the international subClass that is inherited from Student Class
 * It contains country of the student, tuition fees as fees for international students is more
 */
public class InternationalStudent extends Student{
    private int numberOfCourses;
    private int numberOfCredits;
    private double gpa;
    private String loginId;
    private double tuitionFees;

    private String countryName;
    public static double tuitionPerCredit = 637.91;

    public int addCourse(){
        super.addCourse();
        return numberOfCourses;
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

    public String getCountryName(){
        return countryName;
    }
    @Override
    public double getTuitionFees(){
        tuitionFees = tuitionPerCredit* numberOfCredits;
        return tuitionFees;

    }
    public String toString(){
        return "International Student: [" + super.toString() + " country= " + countryName + " TuitionFees = " + tuitionFees;
    }


}
