public class LinkedList {
    public class Node {
        public int data;
        public Node next;
        
        public Node(int value, Node nextNode){
            this.data = value;
            this.next = nextNode;
        }
    }

    public Node head;
    public int size;

    public LinkedList() {
        this.head = null;
        this.size = 0; 

    }
    public void add(int data){
        Node newNode = new Node (data, null);
        
        if (this.size == 0) {
            this.head = newNode;    
        } else {
            Node currentNode = this.head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        
        this.size++;
    }

    public void listAll(){
        if (this.size == 0) {
            System.out.println("Lista vazia");
        } else if (this.size == 1) {
            System.out.println("[head] " + this.head.data);
        } else {
            System.out.print("[head] " + this.head.data + " -> ");
            
            Node currentNode = this.head.next;
            while (currentNode.next != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
        }        
    }

    public void count() {
        System.out.println(this.size);
    }

    public void get(int index){
        int position = 0;
        Node currentNode = this.head;

        while (currentNode != null){
            if (position == index){
                break;
            }
            currentNode = currentNode.next;
            position++;
        }

        System.out.println("LinkedList[" + index + "] : " + currentNode.data);
    }

    public static void main(String[] args){
        LinkedList LL = new LinkedList();

        LL.listAll();
        LL.add(5);
        LL.add(3);
        LL.add(1);
        LL.listAll();
        LL.count();
        LL.get(2);
    }
}