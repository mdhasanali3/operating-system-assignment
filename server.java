package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) {
		  try {System.out.println("Waiting for client ..");
          ServerSocket ss=new ServerSocket(9806);
          Socket soc=ss.accept();
          System.out.println("connection established  ");
          BufferedReader input=new BufferedReader(new InputStreamReader(soc.getInputStream()));
      String str=input.readLine();
      PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
      //out.flush();
      out.print("server says "+str+"\n");
     
     
     
      }
      catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }

	}

}
