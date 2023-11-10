package org.learnSockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInt {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for a connection...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create an InputStream for receiving data
            InputStream inputStream = clientSocket.getInputStream();
            DataInputStream dataIn = new DataInputStream(inputStream);

            int receivedInt;
            do {
                receivedInt = dataIn.readInt();
                System.out.println("Received from client: " + receivedInt);
            } while (receivedInt != 0);

            // Close the connections
            dataIn.close();
            inputStream.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
