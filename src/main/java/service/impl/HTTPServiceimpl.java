package service.impl;

import commons.SimpleHTTPServer;
import service.HTTPService;
import utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static commons.SimpleHTTPServer.PORT;

public class HTTPServiceimpl implements HTTPService {
    @Override
    public void start(int port) {
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Server started on port "+ port);

            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection established");

                new HttpHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
