
/**
 *
 * @author ISAIAH KIBET
 */
public class Cube {

    private Node head;
    private class Node {
        int width, height, depth;
        Node next;

        Node(int width, int height, int depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            next = null;
        }

        int getVolume() {
            return width * height * depth;
        }
    }

    public void add(int width, int height, int depth) {
        Node newNode = new Node(width, height, depth);
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
    public void printVolumes() {
        Node current = head;
        while (current != null) {
            System.out.println("Volume: " + current.getVolume());
            current = current.next;
        }
    }


    public static void main(String[] args) {
        Cube cubeList = new Cube();


        cubeList.add(1, 2, 3);
        cubeList.add(4, 5, 6);
        cubeList.add(7, 8, 9);


        cubeList.printVolumes();
    }
}
//The time complexity for the add method is O(1)
