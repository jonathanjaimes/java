package ejerciciosmisiontic.ciclicas;

public class ParesImpares {
    public static void main(String[] args){
        int n = 1;

        //Permite imprimir impares

        while (n <= 999){
            if (n%2 != 0){
                System.out.print(n + " ");
            }
            n = n + 1;
        }

        System.out.println("");

        //Permite imprimir pares

        int m = 1;
        while (m <= 999){
            if (m%2 == 0){
                System.out.print(m + " ");
            }
            m = m + 1;
        }
    }
}
