//method1- n^2 solution.
//method 2- n solution using a third entity in the nodes isVisited(boolean data type)
//method 3- n solution. changing the reference to a dummy node.

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class detectLoop {

    public static void main(String args[]) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }

    static boolean isLoop(Node head) {
        Node temp = new Node(0);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null)
                return false;
            if (curr.next == temp)
                return true;
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

//mrthof 4 - use hashing (n solution)

// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Node {
//     int data;
//     Node next;

//     Node(int x) {
//         data = x;
//         next = null;
//     }
// }

// class Test {

//     public static void main(String args[]) {
//         Node head = new Node(15);
//         head.next = new Node(10);
//         head.next.next = new Node(12);
//         head.next.next.next = new Node(20);
//         head.next.next.next.next = head.next;
//         if (isLoop(head))
//             System.out.print("Loop found");
//         else
//             System.out.print("No Loop");
//     }

//     static boolean isLoop(Node head) {
//         HashSet<Node> s = new HashSet<Node>();
//         for (Node curr = head; curr != null; curr = curr.next) {
//             if (s.contains(curr))
//                 return true;
//             s.add(curr);
//         }
//         return false;
//     }

//     public static void printlist(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.next;
//         }
//         System.out.println();
//     }
// }