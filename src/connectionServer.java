import java.net.*; 
import java.io.*;

class connectionServer
{ 
	public static void main(String[ ] args)
{
try
{ 
	System.out.println("hi");
	String message = args[0];
int serverPortNumber = Integer.parseInt(args[1]);
ServerSocket connectionSocket = new ServerSocket(serverPortNumber); 
Socket dataSocket = connectionSocket.accept();
PrintStream socketOutput = new PrintStream(dataSocket.getOutputStream()); 
socketOutput.println(message);
System.out.println("sent response to client"); 
socketOutput.flush( );
dataSocket.close( ); 
connectionSocket.close( );
}
catch(Exception e)
{ 
	e.printStackTrace( );
}
}
}