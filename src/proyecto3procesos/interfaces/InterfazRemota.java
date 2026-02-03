/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto3procesos.interfaces;
import java.rmi.Remote;

/**
 *
 * @author dam2_alu02@inf.ald
 */
public interface InterfazRemota extends Remote{
    public void enviarMensage(String mensage) throws java.rmi.RemoteException;
    public void leerMensage() throws java.rmi.RemoteException;
}
