import java.util.Scanner;

public class RecursiveDisplay {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //Recursive method to display Linked List
    public static void displayRecursive(Node head) {

        if (head == null) return;          // Base case: end of list
        System.out.print(head.data + " "); // Print current node
        displayRecursive(head.next);       // Recurse on the next node
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        Node head = null;  //start with empty list
        Node tail = null;  //keep track of last node

        //Loop to take input and build list
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();   // read data
            Node newNode = new Node(data);  // create node

            if (head != null) {
                tail.next = newNode; //link last node to new node
            } else {
                head = newNode;      //first node becomes head
            }
            tail = newNode;      //update tail
        }

        //Call recursive display
        System.out.print("Linked List: ");
        displayRecursive(head);

        scanner.close();



    /*
    --------------------------------- DRY RUN EXAMPLE ------------------------------
    Input:
    n = 3
    nodes = [1, 2, 3]

    Step-by-step recursion:
    displayRecursive(1)
    prints "1 "
    calls displayRecursive(2)

    displayRecursive(2)
    prints "2 "
    calls displayRecursive(3)

    displayRecursive(3)
    prints "3 "
    calls displayRecursive(null)

    displayRecursive(null)
    base case → return

    Output:
    Linked List: 1 2 3
    ------------------------------------------------------------------------------
    */

    }
}