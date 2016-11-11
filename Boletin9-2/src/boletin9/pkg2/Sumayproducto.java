
package boletin9.pkg2;

/**
 *
 * @author Brais
 */
public class Sumayproducto {

public void calcularSumayProd(){
      int acusuma = 0;
      double acuprod = 1;
        
      for (int i=10; i<=90; i++){
         acusuma = acusuma + i;
         acuprod = acuprod * i;
        }
      System.out.println("El valor total de la suma es de " + acusuma);
      System.out.println("El valor total del producto es de " + acuprod);
      System.out.println("El valor total de la suma más el valor total del producto es de " + acusuma + acuprod);
}
    
}

