package ejerciciosmisiontic.ciclicas;

public class EpsilonDeLaMaquina {
    public static void main(String[] args){
        int n = 1;
        int p = 0;
        double e = Math.pow(2, p);

        double suma = n + e;
        int veces = 0;
        System.out.println(suma);

        //Permite repetir el ciclo hasta que suma sea igual a uno, o sea hasta que e sea lo suficientemente pequeño para que no altere a n

        while (suma != 1){
            p = p - 1;
            e = Math.pow(2, p);
            suma = n + e;
            System.out.println(suma);
            veces = veces + 1;
        }
        System.out.println(veces);
    }
}
