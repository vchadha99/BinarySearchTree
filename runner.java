import java.util.*;

public class runner
{
    public static void main(String []agrs)
    {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int num = sc.nextInt();
        System.out.println("Enter nodes");
        /*Enter the data nodes in PreOrder or just enter root node first*/
        for(int i =0 ; i<num ; i++)
        {
            tree.insert(sc.nextInt());
        }
        //Prints height of tree in terms of edges
        System.out.println("Edge height " + (tree.height()-1));
        //Prints level order traversal
        System.out.println("Level order");
        tree.level();
        //Prints reverse of level order traversal
        System.out.println("\nReverse level order");
        tree.revlevel();
        //Prints level order traversal with data aligned right to left
        System.out.println("\nData left to right in level order");
        tree.rtllevel();
        //Prints tree levels spirally
        System.out.println("\nSpiral printing");
        tree.spiral();
        //Prints preorder traversal
        System.out.println("\nPrints in order");
        tree.preorder();
        //Prints postorder traversal
        System.out.println("\nPrints post order");
        tree.postorder();
        sc.close();
        
    }
}
