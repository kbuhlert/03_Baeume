package UE02_AddAndSearch;

public class Node
{
    // TODO: Membervariablen hinzufügen
    private int number;
    private Node left;
    private Node right;
    private Node parent;

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

    public void setNumber(int number) {
        this.number = number;
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

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
