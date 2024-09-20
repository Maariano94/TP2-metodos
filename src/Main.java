import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija el ejercicio que desea revisar:");
        int ejercicio = sc.nextInt();

        if (ejercicio == 1){

            System.out.println("Ejercicio 1");
            System.out.println("Ingrese un numero decimal: ");
            double valorDecimal = sc.nextDouble();

            short valorShort = (short) valorDecimal;
            System.out.println("Valor convertido a short: " + valorShort);

            int valorInt = (int) valorDecimal;
            System.out.println("Valor convertido a int: " + valorInt);

            long valorLong = (long) valorDecimal;
            System.out.println("Valor convertido a long: " + valorLong);

            String valorString = String.valueOf(valorDecimal);
            System.out.println("Valor convertido a string: " + valorString);

            float valorFloat = (float) valorDecimal;
            System.out.println("Valor convertido a float: " + valorFloat);

        } else if (ejercicio == 2){

            //Se produce lo que se llama desbordamiento que es cuando una variable supera el rango permitido para el tipo de dato.
            //Se puede resolver utilizando una variable con un rango mayor del que se necesita abarcar.

            System.out.println("Ejemplo de derbordamiento con tipo de dato int:");

            int valorMaximo = Integer.MAX_VALUE;
            int valorDesbordado = valorMaximo + 1;

            System.out.println("Valor desbordado: " + valorDesbordado);

            System.out.println("Ejemplo de desbordamiento con tipo de dato long:");

            long valorMaximo1 = Long.MAX_VALUE;
            long valorDesbordado1 = valorMaximo1 + 1;

            System.out.println("Valor desbordado: " + valorDesbordado1);

        } else if (ejercicio == 3) {
            int numero = 0;

            while (true) {
                System.out.println("Ingrese un número entre 100 y 999: ");

                try {
                    numero = sc.nextInt();
                    if (numero >= 100 && numero <= 999){
                        break;

                    } else {
                        System.out.println("ERROR. El número ingresado debe estar entre 100 y 999. Intente de nuevo.");

                    }

                } catch (java.util.InputMismatchException e) {

                    System.out.println("ERROR: Debe ingresar un número válido. Intente de nuevo.");

                }
            }

            int sumaDigitos = 0;
            int temp = numero;

            while (temp > 0) {

                int digito = temp % 10;

                sumaDigitos += digito;

                temp /= 10;
            }
            System.out.println("La suma de los digitos " + numero + " es: " + sumaDigitos);
        } else if (ejercicio == 4) {

            System.out.print("Ingresa una cantidad de dinero (por ejemplo, 1390.55): ");
            double cantidad = sc.nextDouble();

            int[] billetes = {200, 100, 50, 20, 10, 5, 2, 1};
            double[] monedas = {0.50, 0.25, 0.10, 0.05};

            System.out.println("Para la cantidad de " + cantidad + " se necesitan:");

            for (int billete : billetes) {
                int numBilletes = (int) (cantidad / billete);
                if (numBilletes > 0) {
                    System.out.println(numBilletes + " billete(s) de " + billete);
                    cantidad -= numBilletes * billete;
                }
            }

            for (double moneda : monedas) {
                int numMonedas = (int) (cantidad / moneda);
                if (numMonedas > 0) {
                    System.out.println(numMonedas + " moneda(s) de " + moneda);
                    cantidad -= numMonedas * moneda;
                }
            }

        } else if (ejercicio == 5) {

            System.out.println("Ingrese un número: ");
            int numero = sc.nextInt();

            String Stringconvierte = String.valueOf(numero);

            System.out.println("El numero convertido a String es: " + Stringconvierte);

        } else if (ejercicio == 6) {

            String cadena = "La lluvia en Mendoza es escasa";
            String cadenaSinEspacios = cadena.replaceAll(" ", "");

            int cantidadCaracteres = cadenaSinEspacios.length();

            System.out.println("La cadena \"La lluvia en Mendoza es escasa\" tiene " + cantidadCaracteres + " caracteres.");

        } else if (ejercicio == 7) {

            System.out.print("Ingrese una cadena para determinar su tamaño: ");
            sc.nextLine();
            String cadena = sc.nextLine();

            int tamanio = cadena.length();
            int contadorVocales = 0;

            for (int i=0; i < tamanio; i++) {

                char caracter = cadena.charAt(i);

                caracter = Character.toLowerCase(caracter);

                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){

                    contadorVocales++;
                }
            }
            System.out.println("El tamaño de la cadena es: " + tamanio);
            System.out.println("La cantida de vocales que contiene es: " + contadorVocales);

        } else if (ejercicio == 8) {

            System.out.print("Ingrese una cadena: ");
            sc.nextLine();
            String cadena = sc.nextLine();
            String todoMinusculas = cadena.toLowerCase();
            String reemplazo = todoMinusculas.replaceAll("a", "e");

            System.out.println("La cadena ingresada sufrió modificaciones y quedó así: " + reemplazo);

        } else if (ejercicio == 9) {

            String cadena = "La lluvia en Mendoza es escasa";
            System.out.println("Cadena: " + cadena);

            System.out.println("La representación en código ASCII de la cadena es:");

            for (int i = 0; i < cadena.length(); i++) {

                char caracter = cadena.charAt(i);
                int codigoASCII = (int) caracter;
                System.out.print(caracter + "=" + codigoASCII + " , ");
            }

        } else if (ejercicio == 10) {

            System.out.println("Convertidor de MAYÚCULAS-minúsculas");
            System.out.print("Ingrese la cadena de texto a convertir: ");
            sc.nextLine();
            String cadena = sc.nextLine();
            System.out.println("Elija la opción que desea:");
            System.out.println("Opción 1: MAYÚSCULAS \nOpción 2: minúsculas");
            String opcion = sc.nextLine();

            if (opcion.equals("1")) {
                String mayusculas = cadena.toUpperCase();
                System.out.println("Cadena en MAYÚSCULAS: " + mayusculas);

            }else {

                String minusculas = cadena.toLowerCase();
                System.out.println("Cadena en minusculas: " + minusculas);

            }

        } else if (ejercicio == 11) {

            System.out.println("Ingrese la palabra 1 para ser comparada con la palabra 2: ");
            sc.nextLine();
            String palabra1 = sc.nextLine();
            System.out.println("Ingrese la palabra 2");
            String palabra2 = sc.nextLine();

            if(palabra1.equals(palabra2)){
                System.out.println("Las palabras son iguales (equals)");

            }else {
                System.out.println("Las palabras no son iguales (equals)");
            }

            int resultadoComparacion = palabra1.compareTo(palabra2);

            if (resultadoComparacion < 0){
                System.out.println("La comparación de la palabra 1 a la palabra 2 es menor que 0 (compareTo)");

            }else if (resultadoComparacion > 0){
                System.out.println("La comparación de la palabra 1 a la palabra 2 es mayor a 0 (compareTo)");

            } else {
                System.out.println("La comparación de las palabras da igual a 0 (compareTo)");
            }

            int resultadoComparacion2 = palabra1.compareToIgnoreCase(palabra2);

            if (resultadoComparacion2 < 0){

                System.out.println("La comparación de la palabra 1 a la palabra 2 es menor que 0 (compareToIgnoreCase)");

            }else if (resultadoComparacion2 > 0){

                System.out.println("La comparación de la palabra 1 a la palabra 2 es mayor a 0 (compareToIgnoreCase)");


            } else {

                System.out.println("La comparación de las palabras da igual a 0 (compareToIgnoreCase)");
            }

        } else if (ejercicio == 12) {

            String cadena = "Probando substring en JAVA";
            System.out.println(cadena);

            //Extracción de la cuarta y quinta letra del String
            String sub = cadena.substring(4,6);
            System.out.println("Extrayendo cuarta y quinta letra del String: " + sub);

        } else if (ejercicio == 13) {

            System.out.print("Ingrese la primer cadena: ");
            sc.nextLine();
            String texto1 = sc.nextLine();
            System.out.print("Ingrese la segunda cadena: ");
            String texto2 = sc.nextLine();

            int posicion = texto2.indexOf(texto1);

            if(posicion != -1){
                System.out.println("La primer cadena SI encuentra dentro de la segunda");

            } else {
                System.out.println("La primer cadena NO se encuentra dentro de la segunda");
            }

        } else if (ejercicio == 14) {

            //Las variables de tipo de dato primitivo son las que acceden al valor asignado directamente.
            //Ejemplos: int, char, boolean, double
            //Las variables por referencia no almacenan un valor si no un espacio de memoria.
            //Ejemplos: Integer, Character, Boolean, Double

        } else if (ejercicio == 15) {

            //int numero = null;
            //¿Qué debo modificar para poder asignar null a la variable?

            //No es posible asignar null a tipos primitivos como int porque null representa la ausencia de un objeto, y los tipos primitivos no son objetos.
            //Si se intenta declarar una variable int con el valor null, como en int numero = null;, se obtiene un error de compilación.
            //Lo que hay que modificar es el tipo de dato que para este caso sería pasar de int a Integer y quedaría:
            //Integer numero = null;

        } else if (ejercicio == 16) {

            //Para transformar una variable de tipo Double a double hay que realizar lo siguiente:

            Double prueba = 2.5;
            double datoPrimitivo = prueba;
            System.out.println("Transformando una variable de tipo Double a double");
            System.out.println("Double " + prueba);
            System.out.println("double " + datoPrimitivo);

            System.out.println("El valor de datoPrimitivo es: " + datoPrimitivo);

        } else if (ejercicio == 17) {

            Date fechaActual = new Date();
            String fechaString = FuncionesPrograma.getFechaString(fechaActual);
            System.out.println("La fecha actual es: " + fechaString);

        } else if (ejercicio == 18) {

            int dia = 26;
            int mes = 12;
            int anio = 2029;

            Date fecha = FuncionesPrograma.getFechaDate(dia, mes, anio);
            System.out.println("La fecha es: " + fecha);

        } else if (ejercicio == 19) {

            OperacionMatematica operacion1 = new OperacionMatematica("+", 5.6, 6.9 );
            System.out.println(operacion1.getOperacion());

            operacion1.setOperacion("+");
            System.out.println("Suma: " + operacion1.operacionMatematica());
            operacion1.setOperacion("-");
            System.out.println("Resta: " + operacion1.operacionMatematica());
            operacion1.setOperacion("*");
            System.out.println("Multiplicación: " + operacion1.operacionMatematica());
            operacion1.setOperacion("/");
            System.out.println("División: " + operacion1.operacionMatematica());

        } else if (ejercicio == 21) {

            System.out.println("Ingrese un número entero:");
            int numero = sc.nextInt();

            int suma = Recursividad.sumarNumeros(numero);
            System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        } else if (ejercicio == 22) {

            System.out.println("Ingrese un número entero:");
            int numero = sc.nextInt();

            int suma = Recursividad.sumarDigitos(numero);
            System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        } else if (ejercicio == 23) {

            System.out.print("Ingresa una cadena: ");
            sc.nextLine();
            String cadena = sc.nextLine();

            String cadenaInvertida = InvertirCadena.invertirCadena(cadena);
            System.out.println("La cadena invertida es: " + cadenaInvertida);

        }

    sc.close();

    }
}