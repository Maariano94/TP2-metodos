public class InvertirCadena {

    public static String invertirCadena(String str){

        if(str.isEmpty()){

            return str;

        } else {
            return invertirCadena(str.substring(1)) + str.charAt(0);

        }
    }

}
