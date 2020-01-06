package controller.graph;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Dijkstra {

    public static Grafo calculateShortestPathFromSource(Grafo graph, Nodo source) {

        source.setDistance(0);

        Set<Nodo> settledNodes = new HashSet<>();
        Set<Nodo> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Nodo currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<Nodo, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Nodo adjacentNode = adjacencyPair.getKey();
                Integer edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode)) {
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private static void CalculateMinimumDistance(Nodo evaluationNode, Integer edgeWeigh, Nodo sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Nodo> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    private static Nodo getLowestDistanceNode(Set<Nodo> unsettledNodes) {
        Nodo lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Nodo nodo : unsettledNodes) {
            int nodeDistance = nodo.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = nodo;
            }
        }
        return lowestDistanceNode;
    }
}