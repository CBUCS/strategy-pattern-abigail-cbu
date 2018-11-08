package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Call itself to traverse the node's left subtree
 * 2. Visit the node
 * 3. Call itself to traverse the node's right subtree
 **/

public class InOrder implements Strategy {

    private List<Object> aList = new ArrayList<Object>();

    public List<Object> Traverse(BinaryTree<Object> binaryTree) {

        if (binaryTree != null && binaryTree.root != null) {

            inOrder(binaryTree.root);
            return aList;
        }

        return null;
    }

    public void inOrder(Node node) {
        inOrder(node.left);
        aList.add(node.item);
        inOrder(node.right);
    }
}
