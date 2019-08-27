
package socket;

import java.io.*;
import java.net.*;

public class client {
     public static void main(String[] args){
        
           try{
         System.out.println("client started ");
			Socket soc =new Socket("127.0.0.1",9806);
			
			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			
                        System.out.print("enter string \n");
			
                        
                        String str=input.readLine();
			PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
			out.println(str+"\n");
                        BufferedReader in=new BufferedReader (new InputStreamReader(soc.getInputStream()));
			System.out.print(in.readLine());
			
		soc.close();
			
		} 
     catch(IOException e){e.printStackTrace();}
     }
}
