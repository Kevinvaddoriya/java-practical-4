import java.util.Scanner;

class SSL{
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node temp =null;
        Node first =null;
        Node last =null;
        Node curr =null;

        void createNode(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value :> ");
            int d = sc.nextInt();
            temp = new Node(d); 
            if (first==null){
                first = temp;
                last = temp;
            } else {
                last.next = temp;
                last = temp;
            }
            displayList();
        }

        void displayList(){
            curr = first;
            while (curr != null){
                System.out.println("|"+curr.data+"|==>");
                curr = curr.next;
            }
        }

        void deleteNode(){
            curr = first;
            while (curr!= null){
                curr = curr.next;
            }
        }
}

public class pa18 {
    public static void main(String[] args) {
        SSL l = new SSL();
        int ch;
        do {
            System.out.println("\n0.Exit");
            System.out.println("1.Create LinkList.");
            System.out.println("2.Display list.");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch){
                case 0:break;
                case 1:l.createNode();break;
                case 2:l.displayList();break;

            }
        }while (ch!=0);
    }
}
