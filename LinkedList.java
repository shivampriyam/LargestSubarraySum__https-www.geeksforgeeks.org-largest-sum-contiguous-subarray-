class Linkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){ data=d;next=null; }
    }
    public void InsertAtFront(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void InsertAtLast(int new_data){
        Node new_node = new Node(new_data);
        if(head==null){head=new Node(new_data);return;}
        new_node.next=null;
        Node last=head;
        while(last.next!=null){last=last.next;}
        last.next=new_node;
    }
    public void InsertAfter(int new_data, Node previousNode){
        Node new_node=new Node(new_data);
        new_node.next=previousNode.next;
        previousNode.next=new_node;
    }
    public void printlist(){
        Node tempnode=head;
        while(tempnode!=null){
            System.out.print(" "+tempnode.data);
            tempnode=tempnode.next;
        }
    }
    
}
public class Main
{
	
    public static void main (String[] args) {
        Linkedlist llst = new Linkedlist();
        llst.InsertAtFront(7);
        llst.InsertAtFront(9);
        llst.InsertAtFront(8);
        llst.InsertAtLast(11);
        llst.InsertAtLast(20);
        llst.InsertAtFront(8);
        llst.printlist();
    }
}
