/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3procesos.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto3procesos.vista.LoginJFrame;
import proyecto3procesos.vista.MainJFrame;

/**
 *
 * @author dam2_alu02@inf.ald
 */
public class LoginController {
    private LoginJFrame view;

    public LoginController(LoginJFrame ljf) {
        view = ljf;
        view.addRegistrarseActionListener(this.registerActionListener());
    }
    private ActionListener registerActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MainJFrame mj = new MainJFrame();
                MainController mc = new MainController(mj,view.getUsuario());
                mj.setVisible(true);
                view.dispose();
            }
        };
        return al;
    }
    
}
