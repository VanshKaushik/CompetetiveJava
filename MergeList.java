import java.util.PriorityQueue;
import java.util.Comparator;
public class MergeList 
{
    public static Node mergeKSortedLists(Node arr[], int k)
    {
        Node head = null, last = null;
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() 
        {
            public int compare(Node a, Node b)
                {
                    return a.data - b.data;
                }
        });
        for (int i = 0; i < k; i++)
            if (arr[i] != null)
                pq.add(arr[i]);
        while (!pq.isEmpty()) 
        {
            Node top = pq.peek();
            pq.remove();
            if (top.next != null)
                pq.add(top.next);
            if (head == null) {
                head = top;
                last = top;
            }
            else {
                last.next = top;
                last = top;
            }
        }
        return head;
    }
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
 
    // Utility function to create a new node
    public Node push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        return newNode;
    }
 
    public static void main(String args[])
    {
        int k = 3; // Number of linked lists
        
 
        // an array of pointers storing the head nodes
        // of the linked lists
        Node arr[] = new Node[k];
 
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
 
        arr[1] = new Node(0);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(7);
        arr[1].next.next.next = new Node(8);
 
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);
 
        // Merge all lists
        Node head = mergeKSortedLists(arr, k);
        printList(head);
    }
}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next = null;
    }
}
