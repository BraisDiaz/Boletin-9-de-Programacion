
package boletin9.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Calculos {
    
    int npositivo, nneutro, nnegativo;
    
    
    public void calcularNumeros(){
        
        do{
        
            int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
            if (num>0){
              npositivo = npositivo + 1;
            }
            else if (num==0){
              nneutro = nneutro + 1;   
              }
            else if(num<0){
              nnegativo = nnegativo + 1;
        }        
            System.out.println("Hay " + npositivo + " números positivos");
            System.out.println("Hay " + nneutro + " ceros");
            System.out.println("Hay " + nnegativo + " números negativos");
            
        }
            while(npositivo+nneutro+nnegativo<10);
            JOptionPane.showMessageDialog(null,"Ya ha introducido 10 números, si quiere comprobar otros 10 empiece de nuevo");
    }
    }

   

