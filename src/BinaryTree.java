/**
 * Created by gnaik on 13/04/17.
 */
public class BinaryTree {

    private Node root;

    private void addNode(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < parent.key) {
                    focusNode = parent.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = parent.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /*
     * Iterates from smallest node to the largest
     * Left, Root and Right Nodes are accessed in this traversal
     */
    private void inorderTraversal(Node focusNode){

        if(focusNode != null){
            inorderTraversal(focusNode.leftChild);
            System.out.println(focusNode.key + " - " + focusNode.value);
            inorderTraversal(focusNode.rightChild);
        }
    }

    /*
     * Walks through the root, left and right nodes respectively
     */
    private void preorderTraversal(Node focusNode){

        if(focusNode != null){
            System.out.println(focusNode.key + " - " + focusNode.value);
            preorderTraversal(focusNode.leftChild);
            preorderTraversal(focusNode.rightChild);
        }
    }

    /*
     * Traverses through the root, left and right nodes respectively
     */
    private void postorderTraversal(Node focusNode){
        if(focusNode != null){
            postorderTraversal(focusNode.leftChild);
            postorderTraversal(focusNode.rightChild);
            System.out.println(focusNode.key + " - " + focusNode.value);
        }
    }

    public static void main(String args[]){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(3, "G1");
        binaryTree.addNode(5, "G2");
        binaryTree.addNode(7, "G3");
        binaryTree.addNode(13, "G4");
        binaryTree.addNode(23, "G5");
        binaryTree.addNode(10, "G6");
        System.out.println("Inorder traversal of the tree is ");
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println("Preorder traversal of the tree is ");
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println("Postorder traversal of the tree is ");
        binaryTree.postorderTraversal(binaryTree.root);

    }
}


class Node{
    int key;
    String value;
    Node leftChild;
    Node rightChild;

    Node(int key, String value){
        this.key = key;
        this.value = value;
    }
}