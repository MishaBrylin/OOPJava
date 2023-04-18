public class HW01 {
    public static void main(String[] args) {
        List a = new List();
        a.insertFirst(1);
        a.insertFirst(2);
        a.insertFirst(3);
        a.printLinkedList();
        System.out.println(" ");
        a.reverse();
        a.printLinkedList();


    }
}
class List {
    private Node head;
    private Node tail;
    class Node {
        int value;
        private Node nextNode;
        private Node previous;
        public void print() {
            System.out.print( value +  " ");
        }
    }
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            current.print();
            current = current.nextNode;
            System.out.print(" ");

        }
        System.out.print("");

    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.value = data;
        newNode.nextNode = head;
        head = newNode;
    }
    public void reverse()
    {
        Node reversedPart = null;
        Node current = head;

        while(current != null)
        {
            Node next = current.nextNode;
            current.nextNode = reversedPart;
            reversedPart = current;
            current = next;
        }
        head = reversedPart;
    }

}






