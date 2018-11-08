package Strategy;

import Tree.BinaryTree;
import Tree.Node;

import java.util.*;

public class DepthFirstSearch implements Strategy {

    private List<Object> aList = new ArrayList<Object>();

    public List<Object> Traverse(BinaryTree<Object> binaryTree) {

        DFS(binaryTree);

        return aList;
    }

    public void DFS(BinaryTree<Object> binaryTree) {
        Stack<Node> stack = new Stack<Node>();
        List<Node> visited = new ArrayList<Node>();

        stack.add(binaryTree.root);
        visited.add(binaryTree.root);

        // todo: in progress...
//        while(!stack.empty())
//        {
//            // Pop a vertex from stack and print it
//            Object tempItem = stack.peek();
//            stack.pop();
//
//            // Stack may contain same vertex twice. So
//            // we need to print the popped item only
//            // if it is not visited.
//            if(!visited.get(tempItem))
//            {
//                aList.add(tempItem)l
//                visited.set(s, true);
//            }
//
//            // Get all adjacent vertices of the popped vertex s
//            // If a adjacent has not been visited, then puah it
//            // to the stack.
//            Iterator<Integer> itr = adj[s].iterator();
//
//            while (itr.hasNext())
//            {
//                int v = itr.next();
//                if(!visited.get(v))
//                    stack.push(v);
//            }
//
//        }
    }

    public String StrategyName() {
        return "DepthFirstSearch";
    }
}
