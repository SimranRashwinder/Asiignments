import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** This is the assignment made by SIMRAN, 100377444, CPSC 1181.
 * I used HotelService, HotelServer, HotelClient and Hotel classes in this
 * I used the content from the lectures on D2L and the examples provided by professor on d2L or in class
 */
public class HotelServer extends Hotel {

    //main method
    public static void main(String[] args) throws IOException {
        //defining server socket
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server started");
        //try catch statement for connecting and waiting for the client
        try {
            while (true) {
                System.out.println("Waitin...");
                Socket socket = serverSocket.accept();

                System.out.println("Client connected.");

                HotelService service = new HotelService(socket,new Hotel());
                Thread t = new Thread(service);
                t.start();
                service.doService();

            }
        } finally {
            serverSocket.close();//closing the socket
        }

    }
}
