/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooeje10;

import java.util.Arrays;
import static java.util.Arrays.sort;


/**
 *
 * @author A288808
 */
public class Guia7POOEje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
//20.
        
        int A [] = new int[50];
        double B [] = new double[20];
        
        
        
        for (int i = 0; i < 50-1; i++) {
            
            A[i]=(int)(Math.random()*(100-1)+1);
            System.out.print(A[i]+" ");
        }
        
        System.out.println("");
        
        Arrays.sort(A,0,49);
        
        System.out.println("");
        
        for (int i = 0; i < 50-1; i++) {
            System.out.print(A[i]+" ");
        }
        
        
        
        for (int i = 0; i < 20-1; i++) {
            if(i<9){
               B[i]=A[i]; 
              
            }else{
                
                B[i]=0.5;
            }
            
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < 20-1; i++) {
            System.out.print(B[i]+" ");
        }
       
    }
    
}
