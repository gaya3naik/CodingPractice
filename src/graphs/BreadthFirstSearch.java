package graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by gnaik on 16/04/17.
 */
public class BreadthFirstSearch {

    private void breadFirstSearch(Vertex root){

        Queue<Vertex> queue = new LinkedList<Vertex>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
          Vertex actualVertex = queue.remove();
            System.out.println(" " +actualVertex.getData());
            for(Vertex vertex : actualVertex.getNeighbours()){
                 if(!vertex.isVisited()){
                     vertex.setVisited(true);
                     queue.add(vertex);
                 }
            }
        }
    }

    public static void main(String args[]){
        BreadthFirstSearch breadthFirstSearch =  new BreadthFirstSearch();
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        Vertex vertex6 = new Vertex(6);
        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex4);
        vertex3.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);
        vertex4.addNeighbour(vertex6);
        vertex5.addNeighbour(vertex6);
        breadthFirstSearch.breadFirstSearch(vertex1);
    }
}
