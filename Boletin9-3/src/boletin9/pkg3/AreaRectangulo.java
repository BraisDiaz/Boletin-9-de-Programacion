
package boletin9.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class AreaRectangulo {
    
    public void AreaRectangulo (){
        
        float base, altura;
        
        do {
             
            base = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un valor positivo para la base"));
            
        }  while (base<=0);
      
               
        do  {
            altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un valor positivo para la altura"));
            
            System.out.println("El área del rectángulo es " + base * altura);
            
        }    while (altura<=0);
                
            
        }        
        
    }
        

    
    
    

