package UE02_AddAndSearch;

public class Tree
{
    // TODO: Membervariable(n) hinzufügen

    private Node root;

    public void add(int number)
    {
        //add in Pseudocode:
        //0.)Neuen Knoten erstellen
        //1.) Starte bei root (=aktueller Knoten)
        //2)
        //2.a)Wenn neuer Knoten kleiner ist als aktueller Knoten, dann
                        //wenn linker Knoten vorhanden, dann aktueller Knoten auf linkes Kind setzen. Springe zu 2)
        //             //wenn linker Knoten NICHT vorhanden, dann Right-Pointer vom aktuellen Knoten auf neuen Knoten setzen
        //2.b) Wenn neuer Knoten größer ist als aktueller Knoten,
                    //wenn rechter Knoten vorhanden, dann aktueller Knoten auf rechtes Kind setzen. Springe zu 2)
                    //wenn rechter Knoten NICHT vorhanden, dann Right-Pointer vom aktuellen Knoten auf neuen Knoten setzen
            // dann aktueller Knoten auf rechtes Kind setzen
            //springe zu 2)
        // TODO: Implementierung hinzufügen
        //Knoten erstellen
        Node newNode = new Node(number);
        //Spezialfall leerer Tree
        if(root==null)
            root=newNode;
        //wenn Baum nicht leer ist kommt obige Vorgehensweise zum tragen
        else
        {
            //starte bei Root (=aktuellerKnoten)
            addRecursive(root, newNode);
        }

    }

    private void addRecursive(Node currentNode, Node newNode)
    {
        // TODO: Implementierung hinzufügen
        //1. Frage Ist Wert größer oder kleiner
        //a)kleiner -->wir müssen auf die linke Baumseite weiter
        if (newNode.getNumber()<currentNode.getNumber()){
            if (currentNode.getLeft()==null){
                //wenn kein weiterer Knoten, dann wird der aktuelle Knoten angehängt
                currentNode.setLeft((newNode));
            }
            else
            {   //ansonsten wird zum nächsten Knoten gegangen und weiter gesucht
                //Methode wird neu aufgerufen und dann mache Prüfungen mit linken Kindknoten nochmal (=rekursiver aufruf)
                addRecursive(currentNode.getLeft(), newNode);}
            //dann zum nächsten Element
        }
        //b) neuer Knoten größer als aktueller --> wir müssen auf die rechte Baumseite
        else if (newNode.getNumber()<currentNode.getNumber()){
            //Abfrage ob es noch weiteren Knoten gibt
            if (currentNode.getRight()==null){
                //wenn kein weiterer Knoten, dann wird der aktuelle Knoten angehängt
                currentNode.setRight((newNode));
            }
            else
            {//ansonsten wird zum nächsten Knoten gegangen und weiter gesucht
                addRecursive(currentNode.getRight(), newNode);}
        }
    }

    public Node searchNumber(int number)
    {
        System.out.print("SearchNumber - ");

        // TODO: Implementierung hinzufügen
        //diese search-Methode dient nur als Startpunkt, um mit der Root zu starten. Da es für die Root hier keine
        // getter-Methode gibt, brauchen wir eine Methode die die Suchfunktion in der ersten Runde mit der Root startet
        // was ja geht, da aus der eigenen Klasse auf root zugegriffen werden kann.
        //ab der nächsten rekursiven Runde wird aus der root dann der currentNode (abgeleitet von der Root)
        return searchNumberRecursive(root, number);
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number)
    {
        System.out.print("CurrentNode: " + ((currentNode == null) ? "NULL" : currentNode.getNumber()) + ", ");

        // TODO: Implementierung hinzufügen
        //wenn der Wert nicht existiert ist der rekursive Knoten, der Angeschaut wird irgendwann = null und dann wird null zurück gegeben
        //mit if(currentNode==null) wird also sowohl überprüft ob Tree leer ist, als auch ob der Suchwert nicht vorhanden ist
        if(currentNode==null)
        {return null;}
        //wenn der aktuelle Knoten die gesuchte Nummer ist, dann kann der zurückgegeben werden und hier wird Methode gestoppt
        if(currentNode.getNumber()==number)
        {return currentNode;}
        //wenn gesuchter Wert größer als aktueller Knoten ist, dann geh nach rechts und fange
        // die Untersuchung des nächsten Knoten mit rekursiven Aufruf wieder von neuem an
        else if (currentNode.getNumber()<number){
            return searchNumberRecursive(currentNode.getRight(),number);
        }
        //wenn der Wert nicht größer ist, nicht der richtige und nicht null, muss er kleiner sein, dann wird die linke Seite untersucht
        else {return searchNumberRecursive(currentNode.getLeft(),number);}
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
