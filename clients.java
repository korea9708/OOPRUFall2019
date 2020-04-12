import java.net.*;
import java.io.*;

public class clients extends userInformation {
private Socket socket=null;
@SuppressWarnings("unused")
private DataInputStream input=null;
@SuppressWarnings("unused")
private DataOutputStream out=null;

public void client1 (String address, int port) 
{
try {
socket=new Socket(address, port);
System.out.println("connected");
input= new DataInputStream(System.in);
out= new DataOutputStream(socket.getOutputStream());
}
catch(UnknownHostException u){
	System.out.println(u);
}
catch (IOException i){
	System.out.println(i);
}
	
}

}
