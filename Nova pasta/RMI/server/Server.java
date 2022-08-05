package server;
import cliente.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {

            System.setProperty("java.rmi.server.hostname", "127.0.0.1");

           ServerAplication p1 = new ServerAplication();

            Interface  stub = (Interface) UnicastRemoteObject.exportObject(p1,0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

            registry.rebind("l", stub);

            

        } catch (Exception e) {
           System.out.println("Some server error..."+ e);
        }
    }
}
