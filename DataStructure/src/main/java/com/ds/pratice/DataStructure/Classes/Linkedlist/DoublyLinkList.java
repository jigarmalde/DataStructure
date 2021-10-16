package com.ds.pratice.DataStructure.Classes.Linkedlist;

public class DoublyLinkList {

    DoublyNode head;

    public DoublyLinkList() {
        // TODO Auto-generated constructor stub
        this.head = null;
    }

    public void insertAtBegining(int data){
        DoublyNode node = new DoublyNode(data);
        if(null == head){
            head=node;
        }else{
            node.next=head;
            head.prev=node;
            head= node;
        }
    }

    public void insertAtLast(int data){
        DoublyNode node = new DoublyNode(data);
        if(null == head){
            head=node;
        }else{
            DoublyNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=node;
            node.prev=current;
        }
    }

    public void deleteFromStart(){
        if(null == head){
            System.out.println("List is Empty");
        }else{
            head=head.next;
        }
    }
    public void deleteFromLast(){
        if(null == head){
            System.out.println("List is Empty");
        }else{
            DoublyNode current =head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }


    public void printForward(){
        DoublyNode currentNode= head;
        while(null!=currentNode){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
    public void printBackword(){
        DoublyNode currentNode= head;
        while(null!=currentNode.next){
            currentNode=currentNode.next;
        }
        while(null!=currentNode){
            System.out.println(currentNode.data);
            currentNode=currentNode.prev;
        }
    }

    void reverse() {
        DoublyNode temp = null;
        DoublyNode current = head;

	        /* swap next and prev for all DoublyNodes of
	         doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

	        /* Before changing head, check for the cases like empty
	         list and list with only one DoublyNode */
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkList list= new DoublyLinkList();
        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtBegining(30);
        list.insertAtBegining(40);
        list.insertAtBegining(50);
        //list.insertAtLast(60);
        //list.insertAtLast(70);
        //list.deleteFromStart();
        //list.deleteFromLast();
        list.reverse();

        list.printForward();
       // list.printBackword();
    }
}
