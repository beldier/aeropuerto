package controller.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public  class Nodo {

    private String name;

    private List<Nodo> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    private Map<Nodo, Integer> adjacentNodes = new HashMap<>();

    protected boolean disponible;

    public Nodo() {

    }

    public Nodo(String name) {
        this.name = name;
    }

    public void agregarDestino(Nodo destino, int distancia) {
        adjacentNodes.put(destino, distancia);
        destino.getAdjacentNodes().put(this,distancia);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Nodo, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Nodo, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<Nodo> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(LinkedList<Nodo> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}