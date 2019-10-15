package echoserver;
import java.net.*;
import java.io.*;

public class EchoServer {
public static final int portNumber = 6013;

  public static void main(String[] args) {
    try {
      // Start listening on the specified port
      ServerSocket sock = new ServerSocket(portNumber);

      // Run forever, which is common for server style services
      while (true) {
        // Wait until someone connects, thereby requesting a date
        Socket client = sock.accept();
        System.out.println("Got a request!");

        // Construct a writer so we can write to the socket, thereby
        // sending something back to the client.
        PrintStream writer = new PrintStream(client.getOutputStream(), true);

        // Send the current date back tothe client.
        while(writer){}

        // Close the client socket since we're done.
        client.close();
      }
    // *Very* minimal error handling.
    } catch (IOException ioe) {
      System.out.println("We caught an unexpected exception");
      System.err.println(ioe);
    }
  }
}
