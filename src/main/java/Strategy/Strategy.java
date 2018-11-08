package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayList;

public interface Strategy {

    ArrayList<Object> Traverse(BinaryTree<Object> binaryTree);
}
