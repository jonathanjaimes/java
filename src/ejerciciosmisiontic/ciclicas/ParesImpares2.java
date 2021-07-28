package ejerciciosmisiontic.ciclicas;

public class ParesImpares2 {
    public static void main(String[] args){

        //Permite imprimir numeros imapres

        for (int i = 1; i < 1000; i++){
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        //Imprimir numeros pares

        for (int j = 1; j < 1000; j++){
            if (j%2 == 0){
                System.out.print(j + " ");
            }
        }
    }
}
