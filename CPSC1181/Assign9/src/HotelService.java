import java.io.*;
import java.net.Socket;

/**
 * This class extends Hotel and Runnable and most of the working of server is in this one
 * I used the different commands for doing different tasks like RESERVE for reservation.
 */

public class HotelService extends Hotel implements Runnable {
    private Socket socket;
    private Hotel hotel;
    private DataInputStream fromClient;
    private DataOutputStream toClient;

    public HotelService(Socket s, Hotel ahotel){
        socket=s;
        hotel=ahotel;
    }

    /**Overriding the run method:
     */
    @Override
    public void run(){
        doService();
    }

    //doService method
    public void doService(){
        try{
            fromClient = new DataInputStream(socket.getInputStream());
            toClient = new DataOutputStream(socket.getOutputStream());

            handleClients();
        }
        catch (IOException exception){
            System.out.println("There is an exception");
        }
    }
    public void handleClients() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(fromClient));
        PrintWriter output = new PrintWriter(toClient);

        //to send the welcome message to the clients
        output.println("Welcome to the Hotel Reservation!..");
//        output.println();

        String user = null;
        while (true) {
            String cmd;//this is command and user should put command and a parameter like USER myName
            String[] parameter;
            int firstDay;// these are the days for reservation
            int lastDay;
            do{
                cmd = input.readLine();
                parameter = input.readLine().split(" ");
                if (cmd == "USER") {
                    user = parameter[0];
                    output.println("User is set to" + user);
                } else if (cmd == "RESERVE") {
                    firstDay = Integer.parseInt(parameter[0]);
                    lastDay = Integer.parseInt(parameter[1]);
                    Boolean success = hotel.requestReservation(user,firstDay,lastDay);//this calls the method from hotel class
                    if(success){
                        output.println("Reservation is made for: " + user + "from " + firstDay +"to " +lastDay);
                    }else {
                        output.println("Reservation is unsuccessful: " + user + "from " + firstDay +"to " +lastDay);
                    }
                }else if(cmd == "CANCEL"){
                    Boolean cancelReservation = hotel.cancelReservation(user);
                    if(cancelReservation){
                        output.println("Reservation has been successfully cancelled for " + user);//output is shown on screen
                    }else {
                        output.println("Reservation is not cancelled for " + user);
                    }
                }else if(cmd == "INFO"){
                    String inform = hotel.toString();
                    output.println(inform);
                }else if (cmd == "QUIT") {
                    output.println("QUIT command received from client");
                    toClient.flush();
                }else{
                    output.println("Your command is valid! Please try again.");
                }

            }while (cmd!= "QUIT");
            //cmd= QUIT is to quit the process
        }

    }


}
