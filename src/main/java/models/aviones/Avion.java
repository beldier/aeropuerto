package models.aviones;

public class Avion {
    private String modelo;
    private int cantidadMaximaPasajeros;
    private int capacidadMaximaVuelo;
    private boolean estaEnHangar;

    public Avion(String modelo, int cantidadMaximaPasajeros, int capacidadMaximaVuelo) {
        this.modelo = modelo;
        this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
        this.capacidadMaximaVuelo = capacidadMaximaVuelo;
        this.estaEnHangar = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadMaximaPasajeros() {
        return cantidadMaximaPasajeros;
    }

    public void setCantidadMaximaPasajeros(int cantidadMaximaPasajeros) {
        this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
    }

    public int getCapacidadMaximaVuelo() {
        return capacidadMaximaVuelo;
    }

    public void setCapacidadMaximaVuelo(int capacidadMaximaVuelo) {
        this.capacidadMaximaVuelo = capacidadMaximaVuelo;
    }

    public boolean isEstaEnHangar() {
        return estaEnHangar;
    }

    public void setEstaEnHangar(boolean estaEnHangar) {
        this.estaEnHangar = estaEnHangar;
    }
}
