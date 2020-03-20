import java.rmi.RemoteException;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainClient {

	public static void main(String[] args) throws NamingException, RemoteException {
	        Hello hl = (Hello) new InitialContext().lookup("rmi://localhost:1099/Hello");
	        System.out.println(hl.sayHello("BOULLOOUUULL"));
	}

}
