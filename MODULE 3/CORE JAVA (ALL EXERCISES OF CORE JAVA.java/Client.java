import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Server says: " + in.readLine());
        String message;
        while ((message = userInput.readLine()) != null) {
            out.println(message);
            System.out.println(in.readLine());
        }

        socket.close();
    }
}
