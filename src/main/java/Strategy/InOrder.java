package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayList;

public class InOrder implements Strategy {

    /**
     * 1. Call itself to traverse the node's left subtree
     * 2. Visit the node
     * 3. Call itself to traverse the node's right subtree
     *
     * @param binaryTree
     */
    public ArrayList<Object> Traverse(BinaryTree<Object> binaryTree) {

        if (node != null) {
            Traverse(node.left);
            // display node? here
            Traverse(node.right);
        }

    }
}
