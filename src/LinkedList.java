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
        if (temp != null && temp.data == data)
        {
            head = temp.next;
            return temp;
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

    // Delete a node from some position
    private Node delete(int position) {
        if(position <0 || head == null){
            return null;
        }
        if(position == 0){
            head = head.next;
        }
        Node tempNode= null;
        for(int i=0; tempNode != null && i<position-1; i++){
            tempNode = tempNode.next;
        }
        if(tempNode == null || tempNode.next == null){
            return null;
        }
        Node next = tempNode.next.next;
        Node deletingNode = tempNode.next;
        tempNode.next = next;
        return deletingNode;
    }

    private void insertFirst(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    private void inserAfter(Node previousNode, int data) {
        if(previousNode == null){
            System.out.print("Previous cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    private void insertLast(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = new Node(data);
        return;
    }
}
