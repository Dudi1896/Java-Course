package org.learnSockets;

import java.io.*;
import java.net.Socket;

public class ClientInt {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");

            // Create an OutputStream for sending data
            OutputStream outputStream = clientSocket.getOutputStream();
            DataOutputStream dataOut = new DataOutputStream(outputStream);

            int[] integers = {1, 2, 3, 4, 5, 0}; // Sending 5 integers and a zero to stop

            for (int integer : integers) {
                dataOut.writeInt(integer);
                System.out.println("Sent to server: " + integer);
            }

            // Close the connections
            dataOut.close();
            outputStream.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
