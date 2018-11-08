import Strategy.*;
import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 *
    Implement the following algorithms for you binary search tree algorithm:

        Breadth First Traverse
        Depth First Traverse
        Inorder
        Preorder
        Postorder
        Minimum Depth
        Max Depth
*/

public class Main {

    public static void main (String args[]) {

        List<Strategy> strategies = new ArrayList<Strategy>();
        // Add strategies here.
        strategies.add(new BreadthFirstSearch());
        strategies.add(new DepthFirstSearch());
        strategies.add(new InOrder());
        strategies.add(new PreOrder());
        strategies.add(new PostOrder());
        strategies.add(new MinimumDepth());
        strategies.add(new MaxDepth());

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);



    }
}
