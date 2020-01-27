package tree;

public class Node {

    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value, Node leftChild, Node rightChild){

        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


    public Node(int key) {

        this.value = key;
        this.leftChild = null;
        this.rightChild = null;
    }
}
