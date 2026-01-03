
package javaapplication8;

/**
 *Clase para tener en cuenta las notas introducidas y ser apto, no apto y si recibe bonificacion
 * @author Jorge
 * @version primera, 30/12/2025
 */
public class JorgeClass {
    /**
     * Calcula el promedio de tres notas
     * @param n1 nota primera
     * @param n2 nota segunda
     * @param n3 nota tercera
     * @return el resultado del promedio calculado como variable float
     */
   public float promedioNota(float n1, float n2,float n3){
       float suma = n1 + n2 + n3;
       float promedio = suma/3;
       return promedio;
   }
   /**
    * Evaluar la nota obtenida y si supera un 7 aplicaremos un extra del 15%
    * @param promedio el valor del resultado obtenido en el metodo anterior
    * @return Un String diciendo: Apto/No apto y la nota final.
    */
   public String conclusionFinal(float promedio){
       String mensaje;
       
       if (promedio < 5) {
           mensaje = "NO APTO. NOTA: "+promedio;
       }else if(promedio >= 5 && promedio <= 7){
           mensaje = "APTO (SIN EXTRA). NOTA: "+promedio;
       }else{
           float extra = promedio * 0.15f;
           float notaFinal = promedio + extra;
           mensaje = "APTO (CON EXTRA DE 15%). NOTA: "+notaFinal;
       }
       return mensaje;
   }
}
