import java.util.Collection;
import java.util.Collections;

import java.util.Map;

public class Graph {

    private Map<String, String> attributes;
    private Map<Node, Edge> graphElements;

    public Graph() {
    }

    public Graph(Map<String, String> attributes){
        this.attributes = Map.copyOf(attributes);
    }

    public Collection<Node> getNodes() {
        return graphElements.keySet();
    }

    public Collection<Edge> getEdges() {
        return graphElements.values();
    }

    // Add a node with name and empty attributes
    public Graph node(String name) {
        Graph graph = new Graph();
        Node nodeToAdd = new Node(name);
        Edge emptyEdge = new Edge("", "");
        graph.graphElements.put(nodeToAdd, emptyEdge);

        return graph;
    }

    //
    public Graph node(String name, Map<String, String> attributes) {
        Graph graph =  new Graph();
        Node nodeToAdd = new Node(name, attributes);
        Edge edgeToAdd = new Edge("", "");
        graph.graphElements.put(nodeToAdd, edgeToAdd);

        return graph;
    }

    public Graph edge(String start, String end) {
        Graph graph = new Graph();
        Edge edgeToAdd = new Edge(start, end);
        Node nodeToAdd = new Node("");
        graphElements.put(nodeToAdd, edgeToAdd);

        return graph;

    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Graph graph = new Graph();
        Edge edgeToAdd = new Edge(start, end, attributes);
        Node nodeToAdd = new Node("");
        graphElements.put(nodeToAdd, edgeToAdd);

        return graph;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
}
