public class Recursividad {

    public static int sumarNumeros(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumarNumeros(num - 1);
        }
    }

    public static int sumarDigitos(int num){

        if (num == 0){

            return 0;
        } else {

            return (num % 10) + sumarDigitos((num / 10));
        }

    }
}