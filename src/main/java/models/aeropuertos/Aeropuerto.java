package models.aeropuertos;


import models.tiempo.Reloj;
import models.tiempo.RelojInterface;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Aeropuerto implements RelojInterface {
    private String ubicacion;
    private LocalTime horaAtencionInicio;
    private LocalTime horaAtencionFin;
    private List<Pista> pistas;

    public static int LPZ=  0;
    public static int CBBA= 1;
    public static int SCZ=  2;
    public static int TAR=  3;
    public static int SUC=  4;
    public static int ORU=  5;
    public static int POT=  6;
    public static int BEN=  7;
    public static int PAN=  8;

    public Aeropuerto(String ubicacion, LocalTime horaAtencionInicio, LocalTime horaAtencionFin) {
        this.ubicacion = ubicacion;
        this.horaAtencionInicio = horaAtencionInicio;
        this.horaAtencionFin = horaAtencionFin;
        this.pistas = new ArrayList<>();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalTime getHoraAtencionInicio() {
        return horaAtencionInicio;
    }

    public void setHoraAtencionInicio(LocalTime horaAtencionInicio) {
        this.horaAtencionInicio = horaAtencionInicio;
    }

    public LocalTime getHoraAtencionFin() {
        return horaAtencionFin;
    }

    public void setHoraAtencionFin(LocalTime horaAtencionFin) {
        this.horaAtencionFin = horaAtencionFin;
    }

    public List<Pista> getPistas() {
        return pistas;
    }

    public void setPistas(List<Pista> pistas) {
        this.pistas = pistas;
    }

    @Override
    public String toString(){
        return this.ubicacion;
    }

    @Override
    public void escucharHora() {

        LocalTime alarma = LocalDateTime.ofInstant(Reloj.getFecha().toInstant(), ZoneId.systemDefault()).truncatedTo(ChronoUnit.SECONDS).toLocalTime();
        if(horaAtencionInicio.compareTo(alarma) == 0)
            System.out.println("Alarma :"+ubicacion);

    }
}
