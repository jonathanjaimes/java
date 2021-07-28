package ejerciciosmisiontic.ciclicas;

public class NumUnoCien {
    public static void main(String[] args){

        int n = 0;
        double cuadrado;
        while (n < 100){

            n = n + 1;
            cuadrado = Math.pow(n, 2);
            System.out.println(n + " " + cuadrado);

        }
    }
}
