
package boletin9.ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Series {
    
    public void serieFibonacci () {
     
        int num0 = 0; int num1 = 1; int contador = 1;

        int nveces = Integer.parseInt(JOptionPane.showInputDialog("numero de veces"));
        
        do{
        
       
        
            System.out.print("," + num0 + ",");

            contador++;

            if (contador <= nveces)

            System.out.print(num1);

            num0=num1+num0;

            num1=num1+num0;

        }while(contador <= nveces);

    }
 }


