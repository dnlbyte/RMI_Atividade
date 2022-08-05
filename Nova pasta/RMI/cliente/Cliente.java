package cliente;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import server.*;

public class Cliente {
    public static void main(String[] args) {
        try {

        Registry registry = LocateRegistry.getRegistry("127.0.0.2", 9100);


        Interface inteface = (Interface)registry.lookup("l");
        

        inteface.adicao(1, 2);
        
            
        } catch (Exception e) {
            System.out.println("Client side error..."+ e);
        }
    }
}
