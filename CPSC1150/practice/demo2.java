import java.util.Scanner;

public class RaceDemo{

   /*public static void main(String[] args) {
     for (int i=0; i<10; i++){

         //if ( i%2 ==1 )
        //    continue;
        // or 
        if( i%2 == 0){
         System.out.pritnln("year: " + i);
         System.out.pritnln("Time to review the financials");

     }
     ///continue means that satisfy the particular condition and then conitue but braek terminates the loop


}*/
    int a=0;

     while(a<5){
         System.out.println(a);
         a+=2;
     }

     System.out.println(a);

     System.out.println("\n\n");

    int i=0;

    do{
        System.out.println(i);
        i++;
    }while(i<5);






} 


FOR ASCII TABLE PROBLEM __

for (int i= 65; i <75; i++){
    System.out.println(i+ "=" + ((char)i));
}

for (int i= 'A'; i <'K'; i++){
    System.out.println(i+ "=" + ((char)i));
}
//}