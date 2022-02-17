package SinglyLinkedList;

public class SinglyLinkedList implements ISinglyLinkedList {

    private Node head;

    /* Every newly added element is being replaced with the head because add() in
    head/tail in LinkedList has O(1) complexity. The last added element becomes head
    and it's easier to get() an element */
    @Override
    public void add(int index) {
        Node node = new Node(index);
        node.next = head;
        head = node;
    }

    /* I'm using a counter that's equal to the index, entered by the user. The counter is being
    decremented each time the searched element is not found until it reaches 0. Then the element is found.
    The method's body is enclosed in a try-catch block so if the index is a negative number or is higher
    than the size of the linked list, a message will be printed. */
    @Override
    public void get(int index) {
        try {
            int temp = index;
            Node node = head;

            while(index >= temp) {
                if (temp == 0) {
                    System.out.println(node.value);
                    break;
                } else {
                    node = node.next;
                    temp--;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The index you're trying to reach is invalid.");
        }
    }

    //Private inner class to create the nodes for the linked list
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
