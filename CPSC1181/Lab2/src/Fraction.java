//Fraction class
public class Fraction {
    private int numerator;  //instance variables
    private int denominator;

    public Fraction(){
        this.numerator = 1;
        this.denominator =1;
    }
    public Fraction(int num, int denum) {
        numerator =num;
        denominator = denum;

    }
    //method used to add the fractions
    public Fraction add(Fraction f){
        int num = numerator*f.denominator + f.numerator*denominator;
        int denum = denominator* f.denominator;
        return new Fraction(num, denum);
    }

    //method used to multiply the fractions
    public Fraction multiply(Fraction f){
        int num = numerator*f.numerator;
        int denum = denominator*f.denominator;
        return new Fraction(num,denum);
    }

    //method used to subtract the fractions
    public Fraction subtract(Fraction f){
        int num = numerator*f.denominator - f.numerator*denominator;
        int denum = denominator*f.denominator;
        return new Fraction(num,denum);
    }

    public String toString(){
        return numerator+ "/" + denominator;
    }


}
