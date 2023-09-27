import java.util.Scanner;
public class App {
    public static void main (String[] args) throws Exception{
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');
        Node g = new Node('g');
        Node h = new Node('h');
        Node i = new Node('i');
        Node j = new Node('j');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        c.left = g;
        d.left = h;
        e.right = i;
        e.left = j;

        boolean salir = true;

        while (salir == true){
            Scanner input = new Scanner(System.in);
            System.out.print("\nIngresa:\n1. Si quieres preorden\n2. Si quieres in order\n3. Si quieres postorden \n4. Para salir\n");
            int respuesta = input.nextInt();

            if (respuesta == 1){
                System.out.println("Recorrido en Preorden:");
                preOrder(a);
            }
            if (respuesta == 2) {
                System.out.println("Recorrido en Inorden:");
                inOrder(a);
            }
            if (respuesta == 3) {
                System.out.println("Recorrido en Postorden:");
                postOrder(a);
            }
            if (respuesta == 4) {
                System.out.println("Hasta luego :D");
                salir = false;
            }
        }
    }

    // Recorrido en Preorden
    /*
    * Primero se visita el nodo actual, luego el subárbol izquierdo y finalmente el subárbol derecho
    *  En este caso se debería imprimir a b d h e j i c g f
     */
    public static void preOrder(Node node) {
        // Si el nodo actual es nulo no hacemos nada.
        if (node == null) return;
        // Imprimimos el valor del nodo actual.
        System.out.print(node.value + " ");
        // Recorremos el subárbol izquierdo.
        preOrder(node.left);
        // Recorremos el subárbol derecho.
        preOrder(node.right);
    }
    // Recorrido en Inorden
    /*
     * Primero se visita el subárbol izquierdo, luego el nodo actual y finalmente el subárbol derecho.
     * En este caso se debería imprimir h d b j e i a g c f
     */
    public static void inOrder(Node node) {
        // Si el nodo actual es nulo no hacemos nada.
        if (node == null) return;
        // Recorremos el subárbol izquierdo.
        inOrder(node.left);
        // Imprimimos el valor del nodo actual.
        System.out.print(node.value + " ");
        // Recorremos el subárbol derecho.
        inOrder(node.right);
    }

    // Recorrido en Postorden
    /*
     * Se visita primero el subárbol izquierdo, luego el subárbol derecho y finalmente el nodo actual.
     * En este caso se debería imprimir h d j i e b g f c a
     */
    public static void postOrder(Node node) {
        // Si el nodo actual es nulo no hacemos nada.
        if (node == null) return;
        // Recorremos el subárbol izquierdo.
        postOrder(node.left);
        // Recorremos el subárbol derecho.
        postOrder(node.right);
        // Imprimimos el valor del nodo actual.
        System.out.print(node.value + " ");
    }
}
