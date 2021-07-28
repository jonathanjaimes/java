package ejerciciosmisiontic.ciclicas;

public class FuncionLog {

    public static double factorial(double h){
        double suma = 1;
        for (int j = 1; j <= h; j++){
            suma = suma * j;
        }
        return suma;
    }

    public static double loga (double x, double n){
        double result;
        double suma = 0;

        //Permite calcular la sumatoria de la expresion result

        for (double i = 0; i <= n; i++){
            result = ((1)/(2*i+1))*Math.pow(((Math.pow(x, 2)-1)/(Math.pow(x, 2)+1)), 2*i+1);
            suma = suma + result;

        }
        return suma;
    }

    public static void main(String[] args){

        //Permite comparar el resultado de la sumatoria con la funcion original

        System.out.println(Math.log(4));
        System.out.println(loga(4,20));

    }
}
