package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**To print the tree,we need to use any of the traversal :
  1.Inorder (Left, Root, Right)
  2.Preorder (Root, Left, Right)
  3. Postorder (Left, Right, Root)
 These above three are DFS
  4. Level Order (BFS)
  **/
public class Traversal_1 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("InOrder Traversal : ");
        inOrder(root);
        System.out.println("\nPreOrder Traversal : ");
        preOrder(root);
        System.out.println("\nPostOrder Traversal : ");
        postOrder(root);
        System.out.println("\nLevel Order Traversal :");
        levelOrder(root);
    }
    /** Inorder Traversal :left->root->right
     */
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    //preOrder Traversal:root->left->right
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //PostOrder Traversal: left->right->root
    public static void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }
    // BFS -Level Order using Queue
    public static void levelOrder(Node root){
        if(root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            System.out.print(current.data+ " ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }
}

