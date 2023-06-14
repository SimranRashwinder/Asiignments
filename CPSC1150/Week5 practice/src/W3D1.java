
public class W3D1 {

	public static void main(String[] args) {
		int val = 15;
		int val2[] = {1,5,7};

	}
	
	{
	
	
	
	System.out.printf("main method.val = %d\n",val);
	
	System.out.printf("main method.val = %d\n",val2[i]);
	
}
	static void change (int a) {
		a=a*10;
		System.out.printf("inside the world. a=%d\n",a);
	}
    static void change (int a[]) {
    	
    	for(int i=0; i< a.length; i++) {
    		a[i] +=5;
    	    System.out.printf("inside the world. a[%d]=%d\n",i,a[i]);
    	}
    }
}
