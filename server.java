
 package socket;

import java.io.*;
import java.net.*;

public class server {

   
    public static void main(String[] args) {
            try {System.out.println("Waiting for client ..");
            ServerSocket ss=new ServerSocket(9806);
            Socket soc=ss.accept();
            System.out.println("connection established  ");
            
            BufferedReader input=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str=input.readLine();
        PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
        out.println("client saying to server  "+str);
       System.out.print(in.readLine());
       
       ss.close();
        }
    catch(IOException e){e.printStackTrace();}
    }
    
}
