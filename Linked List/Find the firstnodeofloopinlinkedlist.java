// Java program to find starting node 
// of loop using Hasing

import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// Function to detect a loop in the linked list and 
// return the node where the cycle starts using HashSet
class GfG {
    static Node findFirstNode(Node head) {
  
        // HashSet to store visited nodes
        HashSet<Node> st = new HashSet<>(); 
        
        Node currNode = head; 
        
        // Traverse the linked list
        while (currNode != null) {
          
            // If the current node is already in the HashSet,
            // then this is the starting node of the loop
            if (st.contains(currNode)) {
                return currNode;
            }
            
            // If not, add the current node to the HashSet
            st.add(currNode);
            
            // Move to the next node
            currNode = currNode.next;
        }
        
        // If no loop found, return null
        return null;
    }

    public static void main(String[] args) {
      
        // Create a linked list: 10 -> 15 -> 4 -> 20
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        head.next.next.next.next = head;

        Node loopNode = findFirstNode(head);

        if (loopNode != null)
            System.out.println(loopNode.data);
        else
            System.out.println(-1);
    }
}
