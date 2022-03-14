/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fup.principal;

import com.fup.logica.Numbers;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numbers objNumber = new Numbers();//Instancia de la Clase Numbers
        String result;

        result = objNumber.getNumbers();
        JOptionPane.showMessageDialog(null, result);

    }
}
