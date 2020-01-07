
import java.time.LocalTime;

import controller.graph.Dijkstra;
import controller.graph.Grafo;
import controller.graph.Nodo;
import models.aeropuertos.Aeropuerto;
import models.tiempo.Reloj;

import java.util.List;
import java.util.ArrayList;


public final class AeropuertoAplicacion
{
    public static Grafo grafo =new Grafo();
    public static List<Aeropuerto> listaAeropuertos = llenarAeropuertos();
    private AeropuertoAplicacion()
    {
    }

    public static void main(String[] args)
    {
        Reloj r = new Reloj();

        for( Aeropuerto a: listaAeropuertos) {
            r.addEscuchador(a);
            grafo.addNode(a);
        }
        listaAeropuertos.get(Aeropuerto.ORU).setDisponible(false);
        listaAeropuertos.get(Aeropuerto.CBBA).setDisponible(false);
        enlazarAeropuertos(listaAeropuertos);

        Aeropuerto destino = listaAeropuertos.get(Aeropuerto.TAR);
        Aeropuerto origen =  listaAeropuertos.get(Aeropuerto.PAN);

        Grafo ans = Dijkstra.calculateShortestPathFromSource(grafo,origen);
        List<Nodo> caminoMasCorto =  destino.getShortestPath();

        System.out.printf("El destino es desde %s\n",origen);
        for(Nodo nodo:caminoMasCorto){
            System.out.printf("Por trayectoria %s\n",nodo);
        }
        System.out.printf("Hasta :%s\n",destino);

    }

    private static void enlazarAeropuertos(List<Aeropuerto> listaAeropuertos){
        listaAeropuertos.get(Aeropuerto.PAN).agregarDestino(listaAeropuertos.get(Aeropuerto.BEN),595);
        listaAeropuertos.get(Aeropuerto.PAN).agregarDestino(listaAeropuertos.get(Aeropuerto.LPZ),611);

        listaAeropuertos.get(Aeropuerto.BEN).agregarDestino(listaAeropuertos.get(Aeropuerto.CBBA),314);
        listaAeropuertos.get(Aeropuerto.BEN).agregarDestino(listaAeropuertos.get(Aeropuerto.SCZ),376);
        listaAeropuertos.get(Aeropuerto.BEN).agregarDestino(listaAeropuertos.get(Aeropuerto.LPZ),394);

        listaAeropuertos.get(Aeropuerto.SCZ).agregarDestino(listaAeropuertos.get(Aeropuerto.CBBA),318);
        listaAeropuertos.get(Aeropuerto.SCZ).agregarDestino(listaAeropuertos.get(Aeropuerto.SUC),259);
        listaAeropuertos.get(Aeropuerto.SCZ).agregarDestino(listaAeropuertos.get(Aeropuerto.TAR),447);

        listaAeropuertos.get(Aeropuerto.CBBA).agregarDestino(listaAeropuertos.get(Aeropuerto.SUC),205);
        listaAeropuertos.get(Aeropuerto.CBBA).agregarDestino(listaAeropuertos.get(Aeropuerto.LPZ),234);
        listaAeropuertos.get(Aeropuerto.CBBA).agregarDestino(listaAeropuertos.get(Aeropuerto.ORU),124);

        listaAeropuertos.get(Aeropuerto.LPZ).agregarDestino(listaAeropuertos.get(Aeropuerto.ORU),196);

        listaAeropuertos.get(Aeropuerto.ORU).agregarDestino(listaAeropuertos.get(Aeropuerto.SUC),230);
        listaAeropuertos.get(Aeropuerto.ORU).agregarDestino(listaAeropuertos.get(Aeropuerto.POT),231);
        listaAeropuertos.get(Aeropuerto.ORU).agregarDestino(listaAeropuertos.get(Aeropuerto.TAR),469);

        listaAeropuertos.get(Aeropuerto.POT).agregarDestino(listaAeropuertos.get(Aeropuerto.SUC),80);
        listaAeropuertos.get(Aeropuerto.POT).agregarDestino(listaAeropuertos.get(Aeropuerto.TAR),241);

        listaAeropuertos.get(Aeropuerto.SUC).agregarDestino(listaAeropuertos.get(Aeropuerto.TAR),283);
    }

    /*
    Habilitracion de horarios en el aeropuerto
     */
    private static List<Aeropuerto>  llenarAeropuertos(){
        List<Aeropuerto> res = new ArrayList<>();
        res.add(new Aeropuerto("la paz",LocalTime.of(06,0,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("cochabamba",LocalTime.of(06,0,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("santa cruz",LocalTime.of(06,20,0),LocalTime.of(23,59,0)));
        res.add(new Aeropuerto("tarija",LocalTime.of(06,10,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("sucre",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("oruro",LocalTime.of(06,15,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("potosi",LocalTime.of(06,10,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("beni",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        res.add(new Aeropuerto("pando",LocalTime.of(06,0,0),LocalTime.of(18,0,0)));
        return res;
    }
}

