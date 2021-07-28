package ejerciciosmisiontic.ciclicas;

public class FuncionExpo {

    public static double factorial(double h){
        double suma = 1;
        for (int j = 1; j <= h; j++){
            suma = suma * j;
        }
        return suma;
    }

    public static double expo (double x, int n){
        double result;
        double suma = 0;

        //Permite calcular la sumatoria de la expresion result

        for (int i = 0; i <= n; i++){
            result = (Math.pow(x, i)/factorial(i));
            suma = suma + result;
        }
        return suma;
    }

    public static void main(String[] args){

        //Permite comparar el resultado de la sumatoria con la funcion original

        System.out.println(Math.exp(5));
        System.out.println(expo(5,20));

    }
}
