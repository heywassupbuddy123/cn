import java.io.*;  
import java.net.*;  
import java.util.*; 
public class MyClient {  
public static void main(String[] args) {  
Scanner scan = new Scanner(System.in);
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
DataInputStream dis=new DataInputStream(s.getInputStream());
while(true){
System.out.print("Type your message:");
String message = scan.nextLine();
System.out.println("");
dout.writeUTF(message);  
dout.flush();  

String str=(String)dis.readUTF();
System.out.print("message from server  : " +str);
System.out.print("");
}  
}catch(Exception e){System.out.println(e);}  
}  
}  