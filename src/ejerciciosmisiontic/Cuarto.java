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
public class Cuarto {

    /**
     * @param args the command line arguments
     */
    
    public static double area (double alto1, double largo1, double alto2, double largo2, double radio1, double radio2){
        double areaCaja1 = alto1 * largo1;
        double areaCaja2 = alto2 * largo2;
        double areaCirculo1 = Math.PI * Math.pow(radio1, 2);
        double areaCirculo2 = Math.PI * Math.pow(radio2, 2);
        double areaTotal = areaCaja1 + areaCaja2 + areaCirculo1 + areaCirculo2;
        return areaTotal;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el alto de la caja 1: ");
        double alto1 = sc.nextDouble();
        System.out.println("Ingrese el largo de la caja 1: ");
        double largo1 = sc.nextDouble();
        System.out.println("Ingrese el alto de la caja 2: ");
        double alto2 = sc.nextDouble();
        System.out.println("Ingrese el largo de la caja 2: ");
        double largo2 = sc.nextDouble();
        System.out.println("Ingrese el radio del primer círculo: ");
        double radio1 = sc.nextDouble();
        System.out.println("Ingrese el radio del segundo círculo: ");
        double radio2 = sc.nextDouble();
        
        double resultado = area(alto1, largo1, alto2, largo2, radio1, radio2);
        
        System.out.println("El area total es de: " + resultado);
    }
    
}
