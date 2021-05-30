//remove duplicates from a singly Linked List
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

class removeDuplicates {

    static Node insertEnding(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    static Node remDup(Node head)
    {
        Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)
                curr.next=curr.next.next;
            else
                curr=curr.next;
        }
        return head;
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertEnding(head, 10);
        head = insertEnding(head, 20);
        head = insertEnding(head, 20);
        head = insertEnding(head, 30);
        head = insertEnding(head, 40);
        head = insertEnding(head, 40);
        head = insertEnding(head, 50);
        head = insertEnding(head, 50);
        printlist(head);
        head=remDup(head);
        System.out.println();
        printlist(head);
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}