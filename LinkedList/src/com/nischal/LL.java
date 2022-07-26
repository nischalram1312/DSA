package com.nischal;
public class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END");

    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }



    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int val, int index){
        if(index == 0 ){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return value;
    }



    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev =  get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }


    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    private class Node{
        private final int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }



    }
}
