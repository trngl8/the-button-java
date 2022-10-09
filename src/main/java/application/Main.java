package application;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);
        server.start();

        //TODO: create handle method to handle simple POST and GET requests --https://dzone.com/articles/simple-http-server-in-java
    }

}
