
package traversal;

public class Traversal 
{
    static class Node
    {
        int data;
        Node next;
    };
    
    // Allocates a new node with given data
    static Node newNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
          
    }
    
    // Insert at the end
    static Node insertEnd(Node head, int data)
    {
        if(head == null)
        {
            return newNode(data);
        }
        else
        {
            head.next = insertEnd(head.next, data);
            return head;
        }
    }
    
    
    // Traversal recursively 
    static void traverse(Node head)
    {
        if(head == null)
        {
            return;
        }
        System.out.println(head.data);
        traverse(head.next);
    } 

    public static void main(String[] args) 
    {
        Node head = null;
        head = insertEnd(head, 6);
        head = insertEnd(head, 12);
        head = insertEnd(head, 18);
        head = insertEnd(head, 24);
        head = insertEnd(head, 30);
        traverse(head);
    }
    
}
