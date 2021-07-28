/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmisiontic;

import java.util.Scanner;
/**
 *
 * @author Setrakian_Armitage
 */
public class ClaseMision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();
        
     
        for (int i= n; i > 0; i--){
            int suma = 1;
            for (int j = i; j > 0; j--){
                suma = suma * j;
            }
            System.out.print(i + " ");
            System.out.print(suma + " ");
        }
    }
    
}
