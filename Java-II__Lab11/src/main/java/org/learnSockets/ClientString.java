package org.learnSockets;

import java.io.*;
import java.net.Socket;

    public class ClientString {
        public static void main(String[] args) {
            try {
                Socket clientSocket = new Socket("localhost", 12345);
                System.out.println("Connected to the server.");

                // Create a BufferedReader for receiving data
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // Receive and print the string from the server
                String message = in.readLine();
                System.out.println("Received from server: " + message);

                // Close the connections
                in.close();
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
