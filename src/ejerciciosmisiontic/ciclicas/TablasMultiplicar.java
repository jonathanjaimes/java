package ejerciciosmisiontic.ciclicas;

public class TablasMultiplicar {
    public static void main(String[] args){


        //Permite imprimir la fila título de la tabla

        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }


        for (int i = 1; i < 10; i++){
            System.out.println("");

            for (int j = 1; j < 10; j++){
                if (j < 2){
                    //Permite imprimir la primera columna
                    System.out.print(i + " ");
                }
                //Permite imprimir de la segunda columna en adelante
                System.out.print(i*j + " ");
            }
        }
    }
}
