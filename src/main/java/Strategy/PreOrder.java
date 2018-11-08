package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayList;

public class PreOrder implements Strategy {

    /**
     * 1. Visit the node.
     * 2. Call itself to traverse the node's left subtree.
     * 3. Call itself to traverse the node's right subtree.
     *
     * @param binaryTree
     */
    public ArrayList<Object> Traverse(BinaryTree<Object> binaryTree) {
        if (node != null) {
            //access the root element of t;
            Traverse(node.left);
            Traverse(node.right);
        }
    }
}
