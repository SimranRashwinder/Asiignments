
public class Problem6_8 {
	public static void main(String[] args) {
		System.out.println( "Celsius         Fahrenheit          |   Fahrenheit       Celsius");
	    System.out.println(celsius);
	}
		
    public static double celsiusToFahrenheit (double celsius) {
			double a;
			for(celsius=40; celsius>31; celsius--) {
				a=(9.0/5)*celsius +32;
				return a;
			}
			return celsius;
			

    }
    public static double FahrenheitToCelsius (double fahrenheit) {
			double b;
			for(fahrenheit=120; fahrenheit>30; fahrenheit--) {
				b =(5.0/9)*(fahrenheit -32);
			return b;	
	      }
			return fahrenheit;

	}
   

}
