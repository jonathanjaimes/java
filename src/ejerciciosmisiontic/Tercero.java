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
public class Tercero {

    /**
     * @param args the command line arguments
     */
    
    public static double area (double alto, double largo, double radio1, double radio2){
        double areaVagon = alto * largo;
        double areaEsferas;
        if (radio1 == radio2){
            areaEsferas = (Math.PI * Math.pow(radio1, 2))*2;
        }else {
            areaEsferas = (Math.PI * Math.pow(radio1, 2)) + (Math.PI * Math.pow(radio2, 2));
        }
        double areaTotal = areaVagon + areaEsferas;
        return areaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el alto del vagón: ");
        double alto = sc.nextDouble();
        System.out.println("Ingrese el largo del vagón: ");
        double largo = sc.nextDouble();
        System.out.println("Ingrese el radio de la esfera 1: ");
        double radio1 = sc.nextDouble();
        System.out.println("Ingree el radio de la esfera 2: ");
        double radio2 = sc.nextDouble();
        
        double resultado = area(alto, largo, radio1, radio2);
        System.out.println("El área total es: " + resultado);
    }
    
}
