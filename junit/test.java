import java.awt.Window.Type;
import java.io.*;
import java.util.*;
import java.math.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
public class test{
      public static test mytest(){
            return new test();
      }
      public static String t = "'12'";
      public static void main(String[] args) throws IOException{
            HttpServer server = HttpServer.create(new InetSocketAddress(8000) , 0);
            server.createContext("/", new MyHandler());
            server.setExecutor(null); // creates a default executor
            server.start();
            System.out.println("listening at 8000...");
            test x = mytest();
            System.out.println(x.t);
      }
      static class MyHandler implements HttpHandler {
            @Override
            public void handle(HttpExchange t) throws IOException {
                String response = "<h1>HELLO</h1>";
                System.out.println(t);
                System.out.println(t.getResponseBody());
                t.sendResponseHeaders(200, response.length());
                OutputStream os = t.getResponseBody();
                os.write(response.getBytes());
                
                os.close();
            }
        }
}