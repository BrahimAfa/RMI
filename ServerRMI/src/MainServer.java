import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

public class MainServer {

	public static void main(String[] args) throws Exception {
	        Hello objHello =  new Helloimpl();
	        Context ctx = new InitialContext();
	        LocateRegistry.createRegistry(1099);
	        ctx.rebind("rmi://localhost/Hello",objHello);
	        System.out.println("DONE");

}
}
