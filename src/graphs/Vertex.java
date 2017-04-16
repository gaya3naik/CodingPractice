package graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gnaik on 16/04/17.
 */
public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbours;

    public Vertex(int data) {
        this.data = data;
        this.neighbours = new ArrayList<Vertex>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }

    public void addNeighbour(Vertex neighbour){
        this.neighbours.add(neighbour);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }
}

