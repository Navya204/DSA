package Trees;
//Trees Implementation

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left=null;
        right=null;
    }
}
public class TreesImpl{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
    }

}
