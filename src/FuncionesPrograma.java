import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesPrograma {

    public static String getFechaString(Date fecha) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return (fecha.toString());
        //return formato.format(fecha);
    }

    public static Date getFechaDate(int dia, int mes, int anio){

        Calendar calendario = Calendar.getInstance();

        calendario.set(anio, mes -1, dia);

        return calendario.getTime();
    }
}