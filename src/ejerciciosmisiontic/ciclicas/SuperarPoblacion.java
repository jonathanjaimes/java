package ejerciciosmisiontic.ciclicas;

public class SuperarPoblacion {
    public static void main(String[] args){
        double paisA = 25000000;
        double paisB = 18900000;

        double copiaPaisA = paisA;
        double copiaPaisB = paisB;
        int año = 2022;

        //Permite continuar el ciclo hasta que la población de B sea mayor a la población de A

        while (copiaPaisA >= copiaPaisB){
            copiaPaisA = copiaPaisA + (copiaPaisA*0.02);
            copiaPaisB = copiaPaisB + (copiaPaisB*0.03);
            año = año + 1;
        }

        System.out.println(año+1);
    }
}
