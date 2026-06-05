//LinkedList: chain of nodes where each node holds a data and a pointer that points to the next node, and last node points to 'null' .
public class LinkedList {

    //A node is one element in chain
    static class Node {
        int data;           //the actual value
        Node next;          //pointer to the next node

        //Constructor for Node
        Node(int data) {
            this.data = data;
            this.next = null; //Points to nothing by default
        }
    }

    //Head is the entry point of the entire list
    Node head;

    //1. Add to the END of the list
    public void addLast(int data) {
        Node newNode = new Node(data); //create new node

        //If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }
        //Otherwise, travel to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next; //keep moving forward
        }
        current.next = newNode; //attach new node at the end
    }
    //2. Add the BEGINNING of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; //new node points to old head
        head = newNode;      //new node becomes new head
    }
    //3. Delete a node by value
    public void delete(int data) {

        //If head is the node to delete
        if(head.data == data) {
            head = head.next; //Move head forward
            return;
        }

        //Otherwise, find the node before it
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; //skip over it
                return;
            }
            current = current.next;
        }
    }

    //4. Print the entire list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addLast(2);
        list.addLast(7);
        list.addLast(11);
        list.addFirst(1);
        list.print();

        list.delete(7);
        list.print();

    }
}