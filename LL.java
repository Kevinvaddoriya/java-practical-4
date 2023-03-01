import java.awt.*;
import java.util.Scanner;

public class LL {
    private Node head = null;
    private Node tail = null;
    private Node curr = null;
    private Node temp = null;
    private Node prev = null;
    private Node next = null;
    Scanner sc = new Scanner(System.in);
    void createNode(){
        System.out.print("Enter a value :> ");
        int d = sc.nextInt();
        temp = new LL.Node(d);
        if (head==null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        display();
    }
    public void insert(){

        if(tail == null){
            insertFirst();
        } else {
            System.out.print("Enter a value :> ");
            int d = sc.nextInt();
            temp = new LL.Node(d);
            tail.next = temp;
            tail = temp;
            display();

        }

    }

    public void insertFirst(){
        System.out.print("Enter a value :> ");
        int d = sc.nextInt();
        temp = new LL.Node(d);
        temp.next = head;
        head = temp;

        if(tail == null){
            tail = head;
        }
        display();

    }

    public void insertAtPosition(){
        System.out.print("Enter a value :> ");
        int d = sc.nextInt();
        temp = new LL.Node(d);
        System.out.print("Enter a position :> ");
        int index = sc.nextInt();
        curr = head;
        int i = 1;


        if(index==1){
            insertFirst();
        } else{
            index--;
            while(i<index){
                curr = curr.next;
                i++;
            }
            temp.next = curr.next;
            curr.next = temp;
            display();
        }

    }

    public void insertAfterNode(){
        System.out.print("Enter a value :> ");
        int d = sc.nextInt();
        temp = new LL.Node(d);
        System.out.print("Enter a Node :> ");
        int data = sc.nextInt();
        curr = head;
        while (curr.data!=data){
            curr=curr.next;
        }
        temp.next = curr.next;
        curr.next =temp;
        display();
    }

    public void insertBeforeNode(){
        System.out.print("Enter a value :> ");
        int d = sc.nextInt();
        temp = new LL.Node(d);
        System.out.print("Enter a Node :> ");
        int data = sc.nextInt();
        curr = head;
        while (curr.next.data!=data){
            curr=curr.next;
        }
        temp.next = curr.next;
        curr.next =temp;
        display();
    }

    public void update(){
        System.out.print("Enter a value :> ");
        int d = sc.nextInt();
        temp = new LL.Node(d);
        System.out.print("Enter a Node :> ");
        int data = sc.nextInt();
        curr = head;
        while (curr.next.data!=data){
            curr=curr.next;
        }
        temp.next=curr.next.next;
        curr.next = temp;
        display();
    }
    public void deletelast(){
        curr=head;
        while(curr.next != tail){
            curr = curr.next;
        }
        curr.next = null;
        tail= curr;
        display();
    }

    public void deleteFirst(){
        if(head == tail){
            System.out.println("linked list is empty...");
        } else{
            head = head.next;
            display();
        }
    }

    public void deleteAtPosition(){
        System.out.print("Enter a position :> ");
        int index = sc.nextInt();
        curr = head;
        int i = 1;

        Node pre;
        if(index == 1){
            deleteFirst();
        } else{
            index--;
            while(i<index){
                curr = curr.next;
                i++;
            }
            pre = curr.next;
            curr.next = null;
            curr.next = pre.next;

            display();
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print("|"+temp.data+"|==>");
            temp=temp.next;
        }
        System.out.println();

    }

    public void totalNode(){
        curr = head;
        int i=1;
        while (curr.next != null){
            curr = curr.next;
            i++;
        }
        System.out.println("Total nodes : "+i);
    }

    public void SearchPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an value : ");
        int data;
        data = sc.nextInt();
        curr=head;
        int p =1;
        while (curr.data!= data){
            curr = curr.next;
            p++;
        }
        System.out.println("element is "+curr.data + " poition is " + p);
    }

    public void findDelete(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an value : ");
        int data;
        data = sc.nextInt();
        curr=head;
        while (curr.next.data!=data){
            curr = curr.next;
        }
        curr.next= curr.next.next;

        display();
    }

    public void CreteReveres(){
        while (curr!=null){
            next =curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }head = prev;
        curr = head;
        while (curr!=null){
            System.out.print("|"+curr.data+"|==>");
            curr = curr.next;
        }
    }
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        public Node (int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}

class Demo{
    public static void main(String[] args) {
        LL l = new LL();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n0.Exit");
            System.out.println("1.Create LinkList.");
            System.out.println("2.Display list.");
            System.out.println("3.insert last.");
            System.out.println("4.insert first.");
            System.out.println("5.insert at position.");
            System.out.println("6.delete last.");
            System.out.println("7.delete first.");
            System.out.println("8.delete at position.");
            System.out.println("9.Total nodes.");
            System.out.println("10.Search and display position.");
            System.out.println("11.Insert after spacific Node.");
            System.out.println("12.Insert before spacific Node.");
            System.out.println("13.update Node.");
            System.out.println("14.find and delete Node.");
            System.out.println("15.Create reveres Linked list.");
            ch = sc.nextInt();
            switch(ch){
                case 0:break;
                case 1:l.createNode();break;
                case 2:l.display();break;
                case 3:l.insert();break;
                case 4:l.insertFirst();break;
                case 5:l.insertAtPosition();break;
                case 6:l.deletelast();break;
                case 7:l.deleteFirst();break;
                case 8:l.deleteAtPosition();break;
                case 9:l.totalNode();break;
                case 10:l.SearchPosition();break;
                case 11:l.insertAfterNode();break;
                case 12:l.insertBeforeNode();break;
                case 13:l.update();break;
                case 14:l.findDelete();break;
                case 15:l.CreteReveres();break;
            }
        }while (ch!=0);
    }
}