/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto3procesos;

import proyecto3procesos.controladores.LoginController;
import proyecto3procesos.vista.LoginJFrame;

/**
 *
 * @author dam2_alu02@inf.ald
 */
public class Proyecto3Procesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginJFrame ljf = new LoginJFrame();
        LoginController lc = new LoginController(ljf);
        ljf.setVisible(true);
    }
    
}
