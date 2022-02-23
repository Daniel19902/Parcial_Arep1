package edu.escuelaing.arem;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class HttpClima
{


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            System.out.println("Listo para recibir en el puerto:" + 36000);
            serverSocket = new ServerSocket(5000);

        }catch (IOException e){
            System.err.println("Could not listen on port:"+36000);
            System.exit(1);
        }
        while (true){
            Socket clienteSocket = null;
            try {
                System.out.println("Listo para recibir...");
                clienteSocket = serverSocket.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }

            PrintWriter out = new PrintWriter(clienteSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

            String inputLine, outputLine;
            boolean primeraLinea = true;
            String path = "";
            while ((inputLine = in.readLine()) != null) {
                System.out.println("recibi: "+inputLine);
                if(primeraLinea){
                    path = inputLine.split(" ")[1];
                    primeraLinea = false;
                }
                if(!in.ready()){
                    break;
                }
            }

            System.out.println("path: "+path);
            String url = "src/main/resources/public/";
            String s = "";
            BufferedReader leer = new BufferedReader(new FileReader(url + path));
            outputLine = "HTTP/1.1 200 OK\r\n"
                    + "Conten-Type: text/html\r\n"
                    + "\r\n";
            while ((s = leer.readLine()) != null) {
                outputLine += s;
                outputLine += "\n";
            }
            out.println(outputLine);
            out.close();
            in.close();
            clienteSocket.close();
        }

    }


}
