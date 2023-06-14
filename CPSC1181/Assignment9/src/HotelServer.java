import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HotelServer extends Hotel {
    public static void main(String[] args) throws IOException {
        final int SBAP_PORT = 8888;
        Socket s;
        Hotel hotel = new Hotel();
        ServerSocket server = new ServerSocket(SBAP_PORT);
        System.out.println("waiting for client......");

        while(true){
            s = server.accept();
            System.out.println("Client is connected.");
            Thread t = new Thread();
            try{
                handleClients(s);
            }catch(IOException e){
                System.out.println("Error in the request...");
            }finally {
                s.close();
            }
            t.start();
        }


    }
    private static void handleClients(Socket s) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream());

        //To send the welcome message to the client
        out.println("Welcome to the Hotel Reservation!..");

        String firstUser = null;

        while (true){

            String command = in.readLine();
            String[] parameter = in.readLine().split( " ");
            int firstDay;
            int lastDay;
            boolean cancelled;



            //getting the commands
//            if(command== "USER"){
//                firstUser = parameter[0];
//                out.println("User is " + firstUser);
//            } else if (command=="RESERVE") {
//                firstDay = Integer.parseInt(parameter[0]);
//                lastDay = Integer.parseInt(parameter[1]);
//                boolean confirmed = Hotel.requestReservation(firstUser,firstDay,lastDay);
//
            switch (command) {
                case "USER":
                    firstUser = parameter[0];
                    out.println("User set to " + firstUser);
                    break;
                case "RESERVE":
                    firstDay = Integer.parseInt(parameter[0]);
                    lastDay = Integer.parseInt(parameter[1]);
                    boolean success = hotel.getInstance().requestReservation(firstUser, firstDay, lastDay);
                    if (success) {
                        out.println("Reservation made: " + firstUser + " from " + firstDay + " through " + lastDay);
                    } else {
                        out.println("Reservation unsuccessful: " + firstUser + " from " + firstDay + " through " + lastDay);
                    }
                    break;
            }

        }

    }

}
