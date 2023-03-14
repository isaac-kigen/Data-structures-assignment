
/**
 *
 * @author ISAAC KIGEN
 */

public class MMUST {

    private Node head;


    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addNode(int dat) {
        Node newNode = new Node(dat);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printLST() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MMUST mmust = new MMUST();

        mmust.addNode(3);
        mmust.addNode(4);
        mmust.addNode(2);
        mmust.addNode(1);
        mmust.addNode(5);

        mmust.printLST();
    }
}