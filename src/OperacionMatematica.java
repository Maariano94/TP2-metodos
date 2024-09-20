public class OperacionMatematica {

    private String operacion;
    private double valor1;
    private double valor2;

    public OperacionMatematica(String operacion, double valor1, double valor2){

        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor2() {
        return valor2;
    }

    private double sumarNumeros(){
        return valor1 + valor2;
    }
    private double restarNumeros(){
        return valor1 - valor2;
    }
    private double multiplicarNumeros(){
        return valor1 * valor2;
    }
    private double dividirNumeros(){
        if(valor2 == 0){

            throw new Error("NO SE PUEDE TOMAR COMO VALOR 2 AL NUMERO 0 EN LA DIVISION");
        }
        return valor1 / valor2;

    }

    public double operacionMatematica(){

        switch (operacion){

            case "+":
                return sumarNumeros();
            //break;
            case "-":
                return restarNumeros();
            //break;
            case "*":
                return multiplicarNumeros();
            //break;
            case "/":
                return dividirNumeros();
            //break;
            default:
                return 0;


        }

    }

}
