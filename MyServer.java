import java.io.*;  
import java.net.*; 
import java.util.*; 
public class MyServer {  
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(6666);  
Scanner scan=new Scanner(System.in);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream()); 
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
while(true){ 
String str=(String)dis.readUTF();  
System.out.println("message= "+str);
System.out.println("");
System.out.println("Type message to client:");
String message =scan.nextLine();
System.out.println("");
dout.writeUTF(message);
dout.flush();
}
}catch(Exception e){System.out.println(e);}  
}  
}  