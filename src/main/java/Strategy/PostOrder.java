package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayList;

public class PostOrder implements Strategy {

    /**
     * 1. Call itself to traverse the node's left subtree.
     * 2. Call itself to traverse the node's right subtree.
     * 3. Visit the node.
     *
     * @param binaryTree
     */
    public ArrayList<Object> Traverse(BinaryTree<Object> binaryTree) {
        if (node != null) {
            Traverse(node.left);
            Traverse(node.right);
            Traverse(node);
        }
    }
}
