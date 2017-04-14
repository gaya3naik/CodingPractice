/**
 * Created by gnaik on 14/04/17.
 */
public class LinkedList {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int datum){
            data = datum;
        }
    }

    private void printList(){
        Node node = head;
        while (node != null){
            System.out.print(" "+node.data);
            node = node.next;
        }
    }

    private void addNode(Node node){
        if(head == null){
            head = node;
            return;
        }
        Node node1 = head;

        while(node1.next != null){
            node1 = node1.next;
        }
        node1.next = node;
    }

    public static void main(String args[]){

        LinkedList l = new LinkedList();
        l.head = new Node(2);
        Node first = new Node(3);
        Node second = new Node(4);
        l.addNode(first);
        l.addNode(second);
        l.addNode(new Node(5));
        l.addNode(new Node(6));
        l.addNode(new Node(7));
        l.addNode(new Node(8));
        l.deleteNode(6);
        l.printList();
    }

    private Node deleteNode(int data){
        Node temp=head, previous = null;
        if(temp == null){
            return null;
        }
        while(temp != null && temp.data != data){
            previous = temp;
            temp = temp.next;
        }
        if(temp == null){
            return null;
        }
        previous.next = temp.next;
        return temp;
    }
}
