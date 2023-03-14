

/**
 *
 * @author MIKE KIMUTAI
 */
public class Stack {

    private Node top;


    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }


    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }


    public boolean isEmpty() {
        return top == null;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();


        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(45);
        stack.push(9);



        while (!stack.isEmpty()) {
            int data = stack.pop();
            System.out.println(data);
        }
    }
}
//THE TIME COMPLEXITY FOR THE CODE IS :
//push: O(1)
//pop: O(1)
