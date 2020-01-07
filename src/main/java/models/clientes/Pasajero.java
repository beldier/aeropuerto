package models.clientes;

import controller.graph.Dijkstra;
import controller.graph.Grafo;
import controller.graph.Nodo;
import models.aeropuertos.Aeropuerto;
import models.tiempo.Reloj;
import models.tiempo.RelojInterface;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Pasajero implements RelojInterface {
    private String nombre;

    private int origen;

    private int destino;

    private LocalTime hora;


    public Pasajero(String nombre, int origen, int destino, LocalTime hora) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public void escucharHora() {
        LocalTime alarma = LocalDateTime.ofInstant(Reloj.getFecha().toInstant(), ZoneId.systemDefault()).truncatedTo(ChronoUnit.SECONDS).toLocalTime();
        if(hora.compareTo(alarma) == 0) {
//            Aeropuerto destino = listaAeropuertos.get(Aeropuerto.TAR);
//            Aeropuerto origen =  listaAeropuertos.get(Aeropuerto.PAN);
//
//            Grafo ans = Dijkstra.calculateShortestPathFromSource(grafo,origen);
//            List<Nodo> caminoMasCorto =  destino.getShortestPath();
//
//            for(Nodo nodo:caminoMasCorto){
//                System.out.println(nodo);
//            }
//            System.out.println(destino);

        }
    }
}
