//import javax.naming.spi.DirStateFactory;

//import java.lang.classfile.components.ClassPrinter;

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
    Node root;

    BinaryTree() {
        root=null;
    }
    Node Insert(Node node,int data){
        if (node==null){
            node = new Node(data);
            return node;
        }
        if (data< node.data){
            node.left=Insert (node.left,data);
        }else if (data>node.data){
            node.right=Insert(node.right,data);
        }
        return node;
        }
    void inorderTraversal(Node node){
        if(node!=null){
            inorderTraversal(node.left);
            System.out.println(node.data +" ");
            inorderTraversal(node.right);
        }
    }
    void preorderTraversal(Node node){
            if(node!=null){
                preorderTraversal(node.left);
                System.out.println(node.data +" ");
                preorderTraversal(node.right);
            }
        }
    void postorderTraversal(Node node){
                if(node!=null){
                    postorderTraversal(node.left);
                    System.out.println(node.data +" ");
                    postorderTraversal(node.right);
                }
            }       

    Node search(Node root,int key){
        if (root.data <key)
        return search(root.left, key);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.Insert(tree.root,50);
        tree.Insert(tree.root, 30);
        tree.Insert(tree.root, 20);
        tree.Insert(tree.root, 40);
        tree.Insert(tree.root, 70);
        tree.Insert(tree.root, 60);
        tree.Insert(tree.root, 80);

        System.out.println("/nInorder traversal ");
        tree.inorderTraversal(tree.root);

        System.out.println("/npreorder traversal ");
        tree.preorderTraversal(tree.root);

        System.out.println("/npostorder traversal ");
        tree.postorderTraversal(tree.root);
`


    }
    System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder traversal of the tree:");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder traversal of the tree:");
        tree.postorderTraversal(tree.root);

        System.out.println("\nSearch for node with value 40:");
        Node result = tree.search(tree.root, 40);
        if (result != null)
            System.out.println("Node found: " + result.data);
        else
            System.out.println("Node not found");

}