package models.tiempo;

import models.aeropuertos.Aeropuerto;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

public final class Reloj {

    private static final long MINUTO_EN_MILISEGUNDOS=60000;//millisecs
    private static Date fecha;
    private static Calendar temp = Calendar.getInstance();
    private static Timer timer;
    private static List<Aeropuerto> escuchadores;
    static {
        Calendar calendario = Calendar.getInstance();
        calendario.set(2019,0,1,5,59,0);
        fecha = calendario.getTime();
        timer = new Timer();
        RelojTask relojTask = new RelojTask();
        timer.schedule(relojTask,3000,1000);
        escuchadores = new ArrayList<>();
    }
    public static void addEscuchador(Aeropuerto a){
        escuchadores.add(a);
    }
    public static void actualizarHora()
    {
        temp.setTime(fecha);
        long tiempo= temp.getTimeInMillis();
        fecha = new Date(tiempo + (MINUTO_EN_MILISEGUNDOS));
        System.out.println(fecha);
        notificar();
    }
    private static void notificar()
    {
        for(Aeropuerto a:escuchadores)
            a.escucharHora();
    }

    public static Date getFecha() {
        return fecha;
    }
}
