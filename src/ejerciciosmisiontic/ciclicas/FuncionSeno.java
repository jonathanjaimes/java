package ejerciciosmisiontic.ciclicas;

public class FuncionSeno {

    public static double factorial(double h){
        double suma = 1;
        for (int j = 1; j <= h; j++){
            suma = suma * j;
        }
        return suma;
    }

    public static double seno (double x, int n){
        double result;
        double suma = 0;

        //Permite calcular la sumatoria de la expresion result

        for (int i = 0; i <= n; i++){
            result = (Math.pow(-1, i)*Math.pow(x, 2*i+1))/(factorial(2*i+1));
            suma = suma + result;
        }
        return suma;
    }

    public static void main(String[] args){

        //Permite comparar el resultado de la sumatoria con la funcion original

        System.out.println(Math.sin(5));
        System.out.println(seno(5,20));

    }
}
