/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fup.logica;

/**
 *
 * @author Usuario
 */
public class Numbers {

    int number = 0;//Contador
    String result = "";//Acumulador

    public String getNumbers() {
        do {
            number = number + 1;//Contador
            //result += "\n" + number;//Acumulador forma 1 
            result = result+"\n" + number;//Acumulador forma 2
        } while (number < 10);

        return result;
    }
}
