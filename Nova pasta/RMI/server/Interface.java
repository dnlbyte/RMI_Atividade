package server;
import java.rmi.Remote;
import java.rmi.RemoteException;
import cliente.*;
public interface Interface extends Remote{
    public double adicao(double x, double y) throws RemoteException;
    public double subtracao(double x, double y) throws RemoteException;
    public double multiplicacao(double x, double y) throws RemoteException;
    public double divisao(double x, double y) throws RemoteException;
    public double potencia(double x, double y) throws RemoteException;
    public double raizQuadrada(double x) throws RemoteException;
    public double logNatural(double x) throws RemoteException;
    public double logBaseDez(double x) throws RemoteException;
    public double seno(double x) throws RemoteException;
    public double coseno(double x) throws RemoteException;

}
