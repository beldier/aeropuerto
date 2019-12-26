package models;

import models.aeropuertos.Pista;
import models.clientes.Pasajero;

import java.util.Date;
import java.util.List;

public class Vuelo {
    private Date horaPartir;
    private Date horaLlegada;
    private String estado;
    private List<Pista> pistasVuelo;
    private List<Pasajero> pasajeros;
    private double capacidadTiempoViaje;
}
