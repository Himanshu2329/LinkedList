import java.util.Scanner;

public class ApnaCollTress {

    static Scanner sc;

    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        sc = new Scanner(System.in);
        Node root=createTree();
        // System.out.println(root.data);  
    }

    static Node createTree() {
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        root =new Node(data);
        System.out.println("enter left "+ data);
        root.left=createTree();
        System.out.println("enter right "+ data);
        root.right=createTree();
        return root;
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }

}
