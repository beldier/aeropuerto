import java.net.*;
import java.time.LocalTime;

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
        System.out.println("olis");
////        mxGraph graph = new mxGraph();
//        LocalTime hora = LocalTime.of(10,0,0,0);
////        Graph<String, DefaultEdge> stringGraph = createStringGraph();
//
//        DefaultUndirectedWeightedGraph<Aeropuerto, DefaultWeightedEdge> grafo = new DefaultUndirectedWeightedGraph<Aeropuerto,DefaultWeightedEdge>(DefaultWeightedEdge.class);
//
        List<Aeropuerto> listaAeropuertos = llenarAeropuertos();
        for( Aeropuerto a: listaAeropuertos)
            r.addEscuchador(a);

//        grafo.addVertex(listaAeropuertos.get(0));
//        grafo.addVertex(listaAeropuertos.get(1));
//        grafo.addVertex(listaAeropuertos.get(2));
//        grafo.addVertex(listaAeropuertos.get(3));
//        grafo.addVertex(listaAeropuertos.get(4));
//        grafo.addVertex(listaAeropuertos.get(5));
//        grafo.addVertex(listaAeropuertos.get(6));
//        grafo.addVertex(listaAeropuertos.get(7));
//        grafo.addVertex(listaAeropuertos.get(8));
//
//        DefaultWeightedEdge e = new DefaultWeightedEdge();
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.PAN),listaAeropuertos.get(Aeropuerto.BEN));
//        grafo.setEdgeWeight(e,595.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.PAN),listaAeropuertos.get(Aeropuerto.LPZ));
//        grafo.setEdgeWeight(e,611.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.BEN),listaAeropuertos.get(Aeropuerto.CBBA));
//        grafo.setEdgeWeight(e,314.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.BEN),listaAeropuertos.get(Aeropuerto.SCZ));
//        grafo.setEdgeWeight(e,376.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.BEN),listaAeropuertos.get(Aeropuerto.LPZ));
//        grafo.setEdgeWeight(e,394.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.SCZ),listaAeropuertos.get(Aeropuerto.CBBA));
//        grafo.setEdgeWeight(e,318.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.SCZ),listaAeropuertos.get(Aeropuerto.SUC));
//        grafo.setEdgeWeight(e,259.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.SCZ),listaAeropuertos.get(Aeropuerto.TAR));
//        grafo.setEdgeWeight(e,447.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.CBBA),listaAeropuertos.get(Aeropuerto.SUC));
//        grafo.setEdgeWeight(e,205.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.CBBA),listaAeropuertos.get(Aeropuerto.LPZ));
//        grafo.setEdgeWeight(e,234.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.CBBA),listaAeropuertos.get(Aeropuerto.ORU));
//        grafo.setEdgeWeight(e,124.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.LPZ),listaAeropuertos.get(Aeropuerto.ORU));
//        grafo.setEdgeWeight(e,196.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.ORU),listaAeropuertos.get(Aeropuerto.SUC));
//        grafo.setEdgeWeight(e,230.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.ORU),listaAeropuertos.get(Aeropuerto.POT));
//        grafo.setEdgeWeight(e,231.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.ORU),listaAeropuertos.get(Aeropuerto.TAR));
//        grafo.setEdgeWeight(e,469.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.POT),listaAeropuertos.get(Aeropuerto.SUC));
//        grafo.setEdgeWeight(e,80.0);
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.POT),listaAeropuertos.get(Aeropuerto.TAR));
//        grafo.setEdgeWeight(e,241.0);
//
//        e = grafo.addEdge(listaAeropuertos.get(Aeropuerto.SUC),listaAeropuertos.get(Aeropuerto.TAR));
//        grafo.setEdgeWeight(e,283.0);
//
//
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
//        res.add(new Aeropuerto("la paz",LocalTime.of(02,0,0),LocalTime.of(23,59,0)));
//        res.add(new Aeropuerto("cochabamba",LocalTime.of(02,0,0),LocalTime.of(23,59,0)));
//        res.add(new Aeropuerto("santa cruz",LocalTime.of(02,0,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("tarija",LocalTime.of(06,10,0),LocalTime.of(18,0,0)));
//        res.add(new Aeropuerto("sucre",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
//        res.add(new Aeropuerto("oruro",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
//        res.add(new Aeropuerto("potosi",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
//        res.add(new Aeropuerto("beni",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
//        res.add(new Aeropuerto("pando",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));

        return res;
    }
    /**
     * Creates a toy directed graph based on URL objects that represents link structure.
     *
     * @return a graph based on URL objects.
     */
    private static Graph<URL, DefaultEdge> createHrefGraph()
    {
        Graph<URL, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);


        try {
//            Aeropuerto amazon = new Aeropuerto("La paz");
            URL yahoo = new URL("http://www.yahoo.com");
            URL ebay = new URL("http://www.ebay.com");
            // add the vertices
//            g.addVertex(amazon);
//            g.addVertex(yahoo);
//            g.addVertex(ebay);
//
//            // add edges to create linking structure
//            g.addEdge(yahoo, amazon);
//            g.addEdge(yahoo, ebay);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return g;
    }
}

