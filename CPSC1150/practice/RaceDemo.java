import java.util.Scanner;

public class RaceDemo{

   public static void main(String[] args) {
      String runner1, runner2, runner3;
      int t1,t2,t3;
      
      //input
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the name of first runner:");
      runner1 = input.next();

      System.out.print("Enter the time of first runner:");
      t1 = input.nextInt();

      System.out.print("Enter the name of second runner:");
      runner2 = input.next();

      System.out.print("Enter the time of second runner:");
      t2 = input.nextInt();

      System.out.print("Enter the name of third runner:");
      runner3 = input.next();

      System.out.print("Enter the time of third runner:");
      t3 = input.nextInt();

      //process
      if (t1<t2 && t1<t3){
          System.out.println("First place: " + runner1);

          if(t2<t3){
              display(runner1, runner2, runner3);
             // System.out.println("2nd place: "+ runner2);
              //System.out.println("3rd place: "+ runner3);
          }
          else {
            display(runner1, runner3, runner2);
              //System.out.println("2nd place: "+runner3);
              //System.out.pritnln("3rd place: "+runner2);

          }
      }
      else if (t2<t1 && t2<t3){
          System.out.println("First place: " + runner2);

          if(t1<t3){
            display(runner2, runner1, runner3);
            //System.out.println("2nd place: "+ runner1);
            //System.out.println("3rd place: "+ runner3);
          }
          else {
            display(runner2, runner3, runner1);
            //System.out.println("2nd place: "+runner3);
            //System.out.pritnln("3rd place: "+runner1);

          }
      }
      else if (t3<t1 && t3<t2){
        System.out.println("First place: " + runner3);

        if(t1<t2){
           display(runner3, runner1, runner2);
          //System.out.println("2nd place: "+ runner1);
          //System.out.println("3rd place: "+ runner2);
        }
        else {
          display(runner3, runner2, runner1);
          //System.out.println("2nd place: "+runner2);
          //System.out.pritnln("3rd place: "+runner1);

        }
    }
    input.close();
    }//end of main

    void display(String w1, String w2, String w3){
        System.out.println("First place: "+ w1);
        System.out.println("2nd place: "+ w2);
        System.out.println("3rd place: "+ w3);
    }

}