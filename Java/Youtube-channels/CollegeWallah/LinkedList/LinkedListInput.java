import java.util.Scanner;

public class LinkedListInput {

    //Node class represents each element in the Linked List
    static class Node {
        int data;                           //value stored in the node
        Node next;                          //reference to the next node

        Node(int data){
            this.data = data;
            this.next = null;               // default: no next node
        }
    }

    //Method to display nodes iteratively
    public static void display(Node head) {
        Node temp = head;                   //start from head
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;               //move to the next node
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Take numbers of nodes
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        Node head = null;                    //start with empty list
        Node tail = null;                    //keep track of last node

        //Step 2: Loop to take input and build list
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();   // read data
            Node newNode = new Node(data);  // create node

            if (head == null) {             //Case 1: first node becomes head
                head = newNode;
            } else {
                tail.next = newNode;        //Case 2: link last node to new node
            }
            tail = newNode;                 //update tail to always point to last node
        }

        //Step 3: Display the linked list
        System.out.print("Linked List: ");
        display(head);

        scanner.close();


         /*
         ========================= DRY RUN EXAMPLE ===================
         Input:
         Enter the number of nodes: 4
         5 3 9 8

         Iteration 1:
         head == null → head = newNode(5), tail = newNode(5)
         List: 5 → null

         Iteration 2:
         tail.next = newNode(3), tail = newNode(3)
         List: 5 → 3 → null

         Iteration 3:
         tail.next = newNode(9), tail = newNode(9)
         List: 5 → 3 → 9 → null

         Iteration 4:
         tail.next = newNode(8), tail = newNode(8)
         List: 5 → 3 → 9 → 8 → null

         Final Output:
         Linked List: 5 3 9 8
         ================================================================
        */


    }
}