package models.tiempo;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Reloj {

    static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs

    public static void main(String args[]){
//        LocalTime tiempo = LocalTime.of(04,0);
//        Date
//        for ( tiempo.plusSeconds(==))
//        tiempo = tiempo.plusMinutes(5);
//        System.out.println(tiempo);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Calendar calendario = Calendar.getInstance();
        calendario.set(2019,0,1,6,0);



        Date fechaInicio = calendario.getTime();

        Calendar date = Calendar.getInstance();


        long t= date.getTimeInMillis();
        Date afterAddingTenMins=new Date(t + (1 * ONE_MINUTE_IN_MILLIS));

        System.out.println(df.format(fechaInicio));
    }
}
