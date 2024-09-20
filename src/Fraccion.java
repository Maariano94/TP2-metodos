public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion (int numerador, int denominador){

        this.denominador = denominador;
        this.numerador = numerador;
    }

    public static Fraccion SumarFracciones(Fraccion f1, Fraccion f2){

        int num = f1.getDenominador() * f2.getDenominador();
        int resultado1 = (num / f1.getDenominador()) * f1.getNumerador();
        int resultado2 = (num / f2.getDenominador()) * f2.getNumerador();

        int numerador = resultado1 + resultado2;

        return new Fraccion(numerador, num);
    }

    public static Fraccion RestarFracciones(Fraccion f1, Fraccion f2){

        int num = f1.getDenominador() * f2.getDenominador();
        int resultado1 = (num / f1.getDenominador()) * f1.getNumerador();
        int resultado2 = (num / f2.getDenominador()) * f2.getNumerador();

        int numerador = resultado1 - resultado2;

        return new Fraccion(numerador, num);


    }
    public static Fraccion MultiplicarFracciones(Fraccion f1, Fraccion f2){

        int resultado1 = f1.getNumerador() * f2.getNumerador();
        int resultado2 = f1.getDenominador() * f2.getDenominador();

        return new Fraccion(resultado1, resultado2);
    }

    public static  Fraccion DividirFracciones(Fraccion f1, Fraccion f2){

        int resultado1 = f1.getNumerador() * f2.getDenominador();
        int resultado2 = f1.getDenominador() * f2.getNumerador();

        return new Fraccion(resultado1, resultado2);
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public String toString() {

        return numerador + "/" + denominador;
    }

}

