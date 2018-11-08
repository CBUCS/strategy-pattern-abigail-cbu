package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch implements Strategy {

    private List<Object> aList = new ArrayList<Object>();

    public List<Object> Traverse(BinaryTree<Object> binaryTree) {

        BFS(binaryTree.root);

        return aList;
    }

    public void BFS(Node startingNode) {
        Queue<Node> queue = new LinkedList<Node>();
        List<Node> visited = new ArrayList<Node>();

        queue.add(startingNode);
        visited.add(startingNode);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            aList.add(node.item);

            List<Node> neighbours = new ArrayList<Node>();
            neighbours.add(node.right);
            neighbours.add(node.left);

            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !visited.contains(n)) {
                    queue.add(n);
                    visited.add(n);
                }
            }

        }
    }

    public String StrategyName() {
        return "BreadthFirstSearch";
    }
}
