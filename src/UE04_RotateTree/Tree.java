package UE04_RotateTree;

public class Tree
{
    private Node root;

    public void addNode(TvShow newTvShow)
    {
        Node newNode = new Node(newTvShow);

        if (root == null)
            root = newNode;
        else
            addNodeRecursive(root, newNode);
    }

    // Variante: Rekursion
    private void addNodeRecursive(Node currentNode, Node newNode)
    {
        // Neuer Wert ist kleiner als der Wert beim aktuellen Knoten
        if (newNode.getTvShow().getRank() < currentNode.getTvShow().getRank())
        {
            // TODO: Implementierung hinzufügen
        }
        // Neuer Wert ist größer als der Wert beim aktuellen Knoten
        else
        {
            // TODO: Implementierung hinzufügen
        }
    }

    public int getMaxDepth()
    {
        return getMaxDepth(root);
    }

    private int getMaxDepth(Node currentTree)
    {
        if (currentTree == null)
            return 0;
        else
        {
            int leftDepth = getMaxDepth(currentTree.getLeft());
            int rightDepth = getMaxDepth(currentTree.getRight());

            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    /**
     * Knoten nach rechts rotieren:
     *
     *       N				 L
     *      / \             / \
     *     L   r     =>    ll  N
     *    / \			      / \
     *   ll lr               lr  r
     */
    public void rotateRight()
    {
        // TODO: Implementierung hinzufügen
    }


    /**
     * Knoten nach links rotieren:
     *
     *       N				 R
     *      / \             / \
     *     l   R     =>    N  rr
     *        / \	      / \
     *       rl rr       l  rl
     */
    public void rotateLeft()
    {
        // TODO: Implementierung hinzufügen
    }

    public int getNodeCount()
    {
        return getNodeCount(root);
    }

    private int getNodeCount(Node currentNode)
    {
        if (currentNode == null)
            return 0;
        else
        {
            Node leftNode = currentNode.getLeft();
            if (leftNode != null)
                return (1 + getNodeCount(leftNode));

            Node rightNode = currentNode.getRight();
            if (rightNode != null)
                return (1 + getNodeCount(rightNode));

            return 1;
        }
    }
}
