package UE02_AddAndSearch;

public class Tree
{
    // TODO: Membervariable(n) hinzufügen

    private Node root;

    public void add(int number)
    {
        // TODO: Implementierung hinzufügen
    }

    private void addRecursive(Node currentNode, Node newNode)
    {
        // TODO: Implementierung hinzufügen
    }

    public Node searchNumber(int number)
    {
        System.out.print("SearchNumber - ");

        // TODO: Implementierung hinzufügen
        return null;
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number)
    {
        System.out.print("CurrentNode: " + ((currentNode == null) ? "NULL" : currentNode.getNumber()) + ", ");

        // TODO: Implementierung hinzufügen
        return null;
    }

    // Suche - Variante Schleife
    private Node searchNumberLoop(int number)
    {
        // TODO: Implementierung hinzufügen
        return null;
    }

    /**
     * Funktion zur Ausgabe des gesamten Baums.
     */
    public void printTree()
    {
        // TODO: temporären Kommentar entfernen
        /* temporär auskommentiert
        printTree(root, "");
        */
    }

    /**
     * Funktion zur Ausgabe des Baums unterhalb eines Knotens
     * @param currentNode Knoten, dessen Teilbaum ausgegeben werden soll
     * @param prefix  Zur Einr�ckung
     */
    public void printTree(Node currentNode, String prefix) {
        // TODO: temporären Kommentar entfernen
        /* temporär auskommentiert
        if (currentNode == null) {
            return;
        }
        System.out.println(prefix + currentNode.getNumber());
        printTree(currentNode.getLeft(), prefix + "L ");
        printTree(currentNode.getRight(), prefix + "R ");
         */
    }


}
