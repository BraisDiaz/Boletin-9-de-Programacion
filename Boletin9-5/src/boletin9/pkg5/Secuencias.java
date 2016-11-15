
package boletin9.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Secuencias {
    
    public void calcularSec (){
        
        int nl;
        
            System.out.print("Visualizamos la serie a-> ");
        
        nl = Integer.parseInt(JOptionPane.showInputDialog("Introducir número de elementos a visualizar en la serie"));
        
        for (int i=2, j=0; j<nl; i=i+2, j++){
            
            System.out.print( i + ",");
            }
        
            System.out.print("Visualizamos la serie b-> ");
            
       
        for (int k=1; k<=nl; k++){
         
           if (k%2==0){
               System.out.print("+"+k);
           }
           else
                System.out.print("-"+k);
            }
        
        for (int i=0; i<=nl; i++){
        
        int n1 = 0, n2 = 1;
        int n3 = n1 + n2;
            
            System.out.println(n1 + "," + n2 + "," + n3 + ",");
        
        n1 = n2;
        n2 = n3;
        n3 = n1 + n2;
        
            System.out.println(n1 + "," + n2 + "," + n3 + ",");
        }
            System.out.println("Visualizamos la serie c-> ")
}
}
        
       


