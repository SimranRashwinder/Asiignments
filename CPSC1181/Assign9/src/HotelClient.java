import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * In this class, I used inputStream and output streams to get the input and output values from and to the client
 * I used the while loop to keep the process going on untill user chooses option 4 which is to quit.I provided a menu at the starting to user to know about the options.
 */
public class HotelClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8888);
        InputStream instream = s.getInputStream();
        OutputStream outstream = s.getOutputStream();
        //I used the concept of reader and printwriter from the notes of networking lecture on D2L
        BufferedReader input = new BufferedReader(new InputStreamReader(instream));
        PrintWriter output = new PrintWriter(outstream);
        Scanner in = new Scanner(System.in);
        int options = 0 ;

        //Getting the name of the user
        System.out.println("Please give your good name: ");
        String clientName = in.nextLine();
        //writing welcome statement
        System.out.println("Welcome to the Hotel Reservation Systems " + clientName+ "!" );

        //menu of options available
        System.out.println("HERE are your options. Please type the number for what you need to do: ");

        while(options != 4){
            System.out.println("Menu: \n 1.Reserve the room \n2. Cancel the reservation \n3.Check the availability of the rooms \n4.Quit");

            System.out.println("Please enter the number for your choice: ");
            options = in.nextInt();
            if (options == 1) {
                System.out.println("Enter the room number you want to reserve");
                String roomNo = in.nextLine();
                output.println("RESERVE");
                String reserveResponse = input.readLine();
                System.out.println(reserveResponse);

            }else if(options==2){
                System.out.println("Enter the room number");
                String cancelRoomNo = in.nextLine();
                output.println("cancel " + cancelRoomNo +"for " + clientName);
                String cancellationResponse = input.readLine();
                System.out.println(cancellationResponse);

            }else if(options==3){
                System.out.println("We will provide you with the availability of rooms");
                output.println("availability");
                String availablityResponse = input.readLine();
                System.out.println(availablityResponse);

            }else if(options == 4){//this is for quiting
                System.out.println("Thank you visiting our Reservation Systems");
            }else{
                System.out.println("Oops! Invalid option...");//this is for anything else
            }
        }
        s.close();
    }
}
