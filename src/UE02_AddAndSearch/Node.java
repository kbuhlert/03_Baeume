package UE02_AddAndSearch;

public class Node
{
    // TODO: Membervariablen hinzufügen
    private final int number;
    private Node left;
    private Node right;
    // private Node parent; --> Parent-Knoten brauchen wir hier nicht, da in diesen Beispielen nicht wichtig

    // *** Konstruktor ***

    // TODO: Konstruktor implementieren

    public Node(int number) {
        this.number = number;
    }

    // *** Getter- & Setter-Methoden ***

    // TODO: Fehlende Getter- & Setter-Methoden implementieren


    public int getNumber() {
        return number;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
