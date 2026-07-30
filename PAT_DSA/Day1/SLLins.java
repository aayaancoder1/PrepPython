public class SLLins{
    Node head = null;
    int len = 0;

    public class Node{
        int data;
        Node node;

        public Node(int data){
            this.data = data;
            this.node = null;
        }
    }


    // public Node insertStart(int data){
    // //    Scanner sc = new Scanner();
    //     Node newNode = new Node(data);
    //     if (head == null){
    //         head = newNode;
    //     }
    //     else{
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     len++;
    //     return newNode;
    // }

    // public node insertEnd(int data){
    //     Node newNode = new Node(data);
    //     if (head ==  null){
    //         head = newNode;
    //     }
    //     else{
    //         Node temp = null;
    //         temp = head;
    //         while(temp.next != null){
    //             temp = temp.next;
    //         }
    //         temp.next = newNode;
    //     }
    //     len++;
    //     return newNode;
    // }

    
    public static void main(String args[]){
        SLLins sll = new SLLins();
        // sll.insertStart(10);
        // sll.insertStart(20);
        // sll.insertStart(30);
        // sll.insertStart(40);
        // sll.insertEnd(50);
    }
}