public class LinkedListq1 {

    class Node {
        int data;
        Node next;
        Node(int value){
            this.data=value;
            this.next=null;
        }
    }
    private Node head;
    private int freq;
    LinkedListq1(){
        this.freq=0;
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst()
    {

        head=head.next;
        return;
    }
    public void deleteLast()
    {

        if(head==null)
        {
            return;
        }
        Node currNode=head.next;
        if(currNode==null)
        {
            head=null;
            return;
        }
        Node secondLast=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
            secondLast=secondLast.next;

        }
        secondLast.next=null;
    }
    public int count(int value){
        Node current=head;
        while(current!=null){
            if(current.data==2){
                freq+=1;
            }
            current=current.next;
        }
        return freq;
    }
    public static void main(String[] args) {
        LinkedListq1 list=new LinkedListq1();
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.printList();
        System.out.println(list.count(2));


    }
}
