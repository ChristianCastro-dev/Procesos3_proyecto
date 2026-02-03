/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3procesos.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto3procesos.vista.MainJFrame;

/**
 *
 * @author dam2_alu02@inf.ald
 */
public class MainController {
    private MainJFrame view;
    private String usuarioLogueado;

    public MainController(MainJFrame mj, String usuario) {
        view = mj;
        usuarioLogueado = usuario;
    }
    private ActionListener enviarActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        return al;
    }
    private ActionListener eliminarActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        return al;
    }
    private ActionListener añadirActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        return al;
    }
    
}
