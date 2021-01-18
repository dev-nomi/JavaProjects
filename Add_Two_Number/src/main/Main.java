/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.Main.single_linkList.Node;

/**
 *
 * @author noman
 */
public class Main {

    public static class single_linkList{
        public static class Node{
            Node next;
            int data;
            public Node() {}
            public Node(int data) {this.data = data;}
            public Node getHead() {return next;}
            public int getData() {return data;}
            
        }
        Node head;
        Node tail;
        public single_linkList() {}
        public void insert_AtEnd(int data){
            Node new_node=new Node(data);
            if(head==null){
                this.head=this.tail=new_node;
            }
            else{
                this.tail.next=new_node;
                this.tail=new_node;
            }
        }
        public void traverse(){
            Node n1=head;
            while(n1.next!=null){
                System.out.print(n1.getData()+"->");
                n1=n1.next;
            }
            System.out.println(n1.getData());
        }
        
    }
    public static single_linkList add_two_numbers(single_linkList l1,single_linkList l2){
        single_linkList result=new single_linkList();
        Node first=l1.head;
        Node second=l2.head;
        int carry=0;
        Node n =new Node(0);
        while(first!=null || second!=null){
            if(first==null){
               first=n;
            }
            if(second==null){
               second=n;
            }
            int res=first.data+second.data+carry;
            result.insert_AtEnd(res%10);
            carry=res/10;
            first=first.next;
            second=second.next;
        }
        if(carry>0){
            result.insert_AtEnd(carry);
        }
        return result;
    }
    public static void main(String[] args) {
        single_linkList l1=new single_linkList();
        l1.insert_AtEnd(2);
        l1.insert_AtEnd(4);
        l1.insert_AtEnd(3);
        single_linkList l2=new single_linkList();
        l2.insert_AtEnd(5);
        l2.insert_AtEnd(6);
        l2.insert_AtEnd(4);
        single_linkList res=add_two_numbers(l1,l2);
        res.traverse();
    }
    
}
