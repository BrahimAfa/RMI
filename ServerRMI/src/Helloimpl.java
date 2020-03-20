import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Helloimpl extends UnicastRemoteObject implements Hello{
    protected Helloimpl() throws RemoteException { }

    @Override
    public String sayHello(String name) {
        return "Hello Mr."+name;
    }
}
