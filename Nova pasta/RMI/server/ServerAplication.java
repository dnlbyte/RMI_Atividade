package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.lang.Math;
import cliente.*;

public class ServerAplication implements cliente.Interface{

    ServerAplication() throws RemoteException{

    }

    public double adicao(double x, double y) throws RemoteException{
        return x+y;
    }

    public double subtracao(double x, double y) throws RemoteException{
        System.out.println("(Primeiro valor)-(Segundo valor)");
        return x-y;
    }

    public double multiplicacao(double x, double y) throws RemoteException{
        return x*y;
    }

    public double divisao(double x, double y) throws RemoteException{
        System.out.println("(Primeiro valor)/(Segundo valor)");
        return x/y;
    }

    public double potencia(double x, double y)throws RemoteException{
        return Math.pow(x, y);
    }

    public double raizQuadrada(double x) throws RemoteException{
        return Math.sqrt(x);
    }

     
    public double logNatural(double x) throws RemoteException{
        return Math.log(x);
    }
    
    
    public double logBaseDez(double x) throws RemoteException{
        return Math.log10(x);
    }
   
    public double seno(double x) throws RemoteException{
        return Math.sin(x);
    }
    
    public double coseno(double x)throws RemoteException {
        return Math.cos(x);
    }

}