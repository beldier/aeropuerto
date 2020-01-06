import java.net.*;
import java.time.LocalTime;

import controller.graph.Dijkstra;
import controller.graph.Grafo;
import controller.graph.Nodo;
import models.aeropuertos.Aeropuerto;
import models.tiempo.Reloj;
import org.jgrapht.*;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.*;
import org.jgrapht.graph.specifics.UndirectedEdgeContainer;
import java.util.List;
import java.util.ArrayList;


public final class AeropuertoAplicacion
{
    private AeropuertoAplicacion()
    {
    }

    public static void main(String[] args)
    {
        Reloj r = new Reloj();

        Grafo grafo =new Grafo();

        List<Aeropuerto> listaAeropuertos = llenarAeropuertos();
        for( Aeropuerto a: listaAeropuertos) {
            r.addEscuchador(a);
            grafo.addNode(a);
        }


        Aeropuerto lpz=new Aeropuerto("la paz",LocalTime.of(02,0,0),LocalTime.of(23,59,0));
        Aeropuerto cbba=new Aeropuerto("cochabamba",LocalTime.of(02,0,0),LocalTime.of(23,59,0));
        Aeropuerto scz=new Aeropuerto("santa cruz",LocalTime.of(02,0,0),LocalTime.of(23,59,0));
        Aeropuerto tar=new Aeropuerto("tarija",LocalTime.of(06,10,0),LocalTime.of(18,0,0));
        Aeropuerto suc=new Aeropuerto("sucre",LocalTime.of(06,0,0),LocalTime.of(18,0,0));
        Aeropuerto oru=new Aeropuerto("oruro",LocalTime.of(06,0,0),LocalTime.of(18,0,0));
        Aeropuerto pot=new Aeropuerto("potosi",LocalTime.of(06,0,0),LocalTime.of(18,0,0));
        Aeropuerto ben=new Aeropuerto("beni",LocalTime.of(06,0,0),LocalTime.of(18,0,0));
        Aeropuerto pando =new Aeropuerto("pando",LocalTime.of(06,0,0),LocalTime.of(18,0,0));


        pando.agregarDestino(ben,595);
        pando.agregarDestino(lpz,611);

        ben.agregarDestino(cbba,314);
        ben.agregarDestino(scz,376);
        ben.agregarDestino(lpz,394);

        scz.agregarDestino(cbba,318);
        scz.agregarDestino(suc,259);
        scz.agregarDestino(tar,447);

        cbba.agregarDestino(suc,205);
        cbba.agregarDestino(lpz,234);
        cbba.agregarDestino(oru,124);

        lpz.agregarDestino(oru,196);

        oru.agregarDestino(suc,230);
        oru.agregarDestino(pot,231);
        oru.agregarDestino(tar,469);

        pot.agregarDestino(suc,80);
        pot.agregarDestino(tar,241);

        suc.agregarDestino(tar,283);


        Grafo ans = Dijkstra.calculateShortestPathFromSource(grafo,tar);
        List<Nodo> caminoMasCorto =  (pando.getShortestPath());
        System.out.println(pando.getDistance());
        for(Nodo nodo:caminoMasCorto){
            System.out.println(nodo);
        }
//
//
//        grafo.removeEdge(grafo.getEdge(listaAeropuertos.get(Aeropuerto.ORU),listaAeropuertos.get(Aeropuerto.TAR)));
//
//
//
//        DijkstraShortestPath<Aeropuerto,DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(grafo);
//        dijkstra.getPath(listaAeropuertos.get(Aeropuerto.TAR),listaAeropuertos.get(Aeropuerto.PAN)).getEdgeList().stream().forEach(System.out::println);

    }

    private static List<Aeropuerto>  llenarAeropuertos(){
        List<Aeropuerto> res = new ArrayList<>();
        res.add(new Aeropuerto("la paz",LocalTime.of(02,0,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("cochabamba",LocalTime.of(02,0,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("santa cruz",LocalTime.of(02,0,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("tarija",LocalTime.of(06,10,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("sucre",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("oruro",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("potosi",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("beni",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("pando",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));

        return res;
    }
}

