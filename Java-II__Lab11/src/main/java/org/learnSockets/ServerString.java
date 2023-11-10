package org.learnSockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerString {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for a connection...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create a PrintWriter for sending data
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Send a string to the client
            String message = "Hello, Client!";
            out.println(message);
            System.out.println("Message sent to client: " + message);

            // Close the connections
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
