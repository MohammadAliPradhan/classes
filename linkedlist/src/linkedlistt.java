package LinkedList.Singly;
import org.w3c.dom.Node;

import java.util.LinkedList;
public class linkedlistt {


    Node head;

    class Node{
        String data;
        Node next;    //address of node type


        Node(String data)
        {
            this.data=data;
        }
    }

    public void addLast(String str)
    {
        Node newNode= new Node(str);

        if(head==null)
        {
            head= newNode;
            return;
        }
        Node ptr= head;
        while(ptr!=null)
        {
            ptr=ptr.next;
        }
        ptr.next= newNode;
    }
    public void printList(){
        Node ptr= head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr= ptr.next;
        }
        System.out.println("null");
    }

}
