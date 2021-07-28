package ejerciciosmisiontic.ciclicas;

public class NumUnoCien2 {
    public static void main(String[] args){

        double cuadrado;
        for (int i = 1; i < 101; i++){
            cuadrado = Math.pow(i, 2);
            System.out.println(i + " " + cuadrado);
        }
    }
}
