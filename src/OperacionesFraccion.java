import java.util.Scanner;

public class OperacionesFraccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numerador: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el primer denominador: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el segundo numerador: ");
        int num3 = sc.nextInt();

        System.out.println("Ingrese el segundo denominador: ");
        int num4 = sc.nextInt();

        Fraccion f1 = new Fraccion(num1, num2);

        Fraccion f2 = new Fraccion(num3, num4);

        System.out.println(Fraccion.SumarFracciones(f1,f2));

        System.out.println(Fraccion.RestarFracciones(f1, f2));

        System.out.println(Fraccion.MultiplicarFracciones(f1, f2));

        System.out.println(Fraccion.DividirFracciones(f1, f2));

    }

}