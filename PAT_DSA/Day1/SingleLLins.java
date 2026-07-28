public class SingleLLins{
    Node head;
    int len = 0;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node insertStart(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }       
        else{
            newNode.next = head;
            head = newNode;
        }
        len++;
        return newNode;
    }

    public Node insertEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        temp = head;
        if(head != null){
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            len++;
        }
        else{
            System.out.println("List is Empty!");
        }
        return newNode;
    }

    public void printing(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" null");
    }

    public static void main(String arg[]){
        SingleLLins sll = new SingleLLins();
        sll.insertStart(10);
        sll.insertStart(20);
        sll.insertStart(30);
        sll.insertStart(40);
        sll.insertEnd(50);
        sll.insertEnd(60);
        sll.printing();
    }
}