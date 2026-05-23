package interfaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Set;

/**
 *
 * @author usuario
 */
public interface Chat extends Remote {

    public void mandarMensage(String de, String a, String mensage) throws RemoteException;
    public void recibirMensage(String de, String mensage) throws RemoteException;
    public void registrarse(String nombre, Chat stub) throws RemoteException;
    public void desRegistrarse(String nombre) throws RemoteException;
    public Set<String> listaUsuarios() throws RemoteException;

}
