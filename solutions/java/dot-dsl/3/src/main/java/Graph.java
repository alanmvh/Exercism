import java.util.*;

public class Graph {

    private final Map<String, String> attributes;
    private Set<Node> nodeList = new HashSet<>();
    private Set<Edge> edgeList = new HashSet<>();

    public Graph() {
        this.attributes = Collections.emptyMap();
    }

    public Graph(Map<String, String> attributes){
        this.attributes = Map.copyOf(attributes);
    }

    public Collection<Node> getNodes() {
        return nodeList;
    }

    public Collection<Edge> getEdges() {
        return edgeList;
    }

    // Add a node with name and empty attributes
    public Graph node(String name) {
        Node nodeToAdd = new Node(name);
        this.nodeList.add(nodeToAdd);

        return this;
    }


    public Graph node(String name, Map<String, String> attributes) {
        Node nodeToAdd = new Node(name, attributes);
        this.nodeList.add(nodeToAdd);
        return this;
    }

    public Graph edge(String start, String end) {
        Edge edgeToAdd = new Edge(start, end);
        this.edgeList.add(edgeToAdd);
        return this;

    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge edgeToAdd = new Edge(start, end, attributes);
        this.edgeList.add(edgeToAdd);
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
}
