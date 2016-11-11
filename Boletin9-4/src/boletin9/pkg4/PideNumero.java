/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class PideNumero {
    
    public void pideNumero (){
        
        int num;
        
        do{
            
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero positivo (si introduce 0 termina el programa)"));    
        
        if (num!=0){
        
        for (int i=1;i<=10; i++){            
            
            System.out.println(num + "x" + i + "=" + (num * i));
         
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Ha introducido 0, por lo tanto ha finalizado el programa ");
        }
        } while (num!=0);
    }
    
}

