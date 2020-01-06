package controller;

import controller.graph.Dijkstra;
import controller.graph.Grafo;
import controller.graph.Nodo;
import models.aeropuertos.Aeropuerto;

public class s {
    public static void main(String args[]){





                Grafo grafo = new Grafo();
        Nodo a = new Nodo("a");
        Nodo b = new Nodo("b");
        Nodo c = new Nodo("c");
//        Nodo d = new Nodo("d");
//        Nodo e = new Nodo("e");
//
//
        a.agregarDestino(b,11);
        b.agregarDestino(a,5);
        b.agregarDestino(c,12);
//        c.agregarDestino(d,13);
//        d.agregarDestino(e,14);
//
//        a.agregarDestino(e,15);
//
//        a.agregarDestino(d,3);
//        d.agregarDestino(d,2);
//
//        grafo.addNode(a);
//        grafo.addNode(b);
//        grafo.addNode(c);
//        grafo.addNode(d);
//        grafo.addNode(e);
//
//
      grafo = Dijkstra.calculateShortestPathFromSource(grafo,a);
//
        System.out.println(c.toString());

    }
}
