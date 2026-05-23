/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import interfaz.Chat;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class ServidorRMI implements Chat{

  
    Map<String, Chat> clientesConectados = new HashMap();
    
    public static void main(String[] args) {
        try{
            ServidorRMI servidor = new ServidorRMI();
            Chat stub = (Chat) UnicastRemoteObject.exportObject(servidor, 0);
            
            // Se añaden la direccion al registro
            Registry registro = LocateRegistry.createRegistry(1099);
            // Se asocia nombre e instancia al chat
            registro.rebind("Chat", stub);
            
        
        }catch(Exception ex){
            System.out.println("Hubo algun error");
        }
    }

    @Override
    public void mandarMensage(String de, String a, String mensage) throws RemoteException {

        Chat destinatario = clientesConectados.get(a);
        if(destinatario != null){
            destinatario.recibirMensage(de, mensage);
        }
    }

    @Override
    public void recibirMensage(String de, String mensage) throws RemoteException {
        
    }

    @Override
    public void registrarse(String nombre, Chat chat) throws RemoteException {
        clientesConectados.put(nombre, chat);
    }

    @Override
    public Set<String> listaUsuarios() throws RemoteException {
        return new HashSet<>(clientesConectados.keySet());
    }

    @Override
    public void desRegistrarse(String nombre) throws RemoteException {
        clientesConectados.remove(nombre);
    }

}
