import java.util.Random;

public class W5D4 {

	public static void main(String[] args) {
		int num[];
		num = generateNumbers();
        display(num);
        
	}
	static int[] generateNumbers() {
	   int temp[];
	   
	   Random r = new Random();
	   int size = r.nextInt(10)+1;
	   
	   temp = new int[size];
	   
	   for (int i =0; i<temp.length; i++) {
		   temp[i]= r.nextInt(100)+1;
	   }
	   return temp;
	}
    static void display(int array[]) {
    	for (int i=0; i<array.length; i++) {
    		System.out.printf("array[%d]= %d\n", i , array[i]);
    	}
    }
}
