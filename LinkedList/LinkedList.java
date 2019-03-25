
public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtHead(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
            if (tail == null) {
                tail = n;
            }
        }
    }

    public void insertAtTail(int data) {
        Node n = new Node(data);
        if (tail == null) {
            head = n;
            tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
    }

    public int size() {
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            Node t = head;
            while (t != null) {
                t = t.getNext();
                count++;
            }
        }
        return count;

    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        else if(head.getData()==data)
        {
           head=head.getNext();
           // 5-> null, 
           //then head=null
        }
        else if(head.getNext().getData()==data)
        {
            head.setNext(head.getNext().getNext());
            if(head==null)
            {
                tail=null;
            }
        }
        else
        {
            //check the rem list
            Node t=head;
            while(t.getNext().getData()!=data)
            {
                t=t.getNext();
            }
            
            t.setNext(t.getNext().getNext());
            if(t.getNext()==null)
            {
                tail=t;
            }     
            
        }

    }
    
    public void insert(int d)
    {
        Node n= new Node(d);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.setNext(n);
            tail=n;
        }
        
    }
    
    public void print()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else if(head==tail)
        {
            System.out.println(head.getData());
        }
        else
        {
             Node t=head;
             while(t.getNext()!=null)
            {
                System.out.print(t.getData()+ " ");
                t=t.getNext();
            }
             
             System.out.println(t.getData());

        }
    }

    public static void main(String[] args) {

        LinkedList ll= new LinkedList();
        ll.insert(10);
        ll.insertAtHead(100);
        ll.insertAtHead(200);
        ll.insertAtHead(300);
        ll.insertAtHead(400);
        ll.insertAtHead(500);
        
        ll.print();
        
        ll.insertAtTail(3);
        ll.insertAtTail(4);
        ll.insertAtTail(5);
        
        ll.print();
        
        ll.delete(3);
        ll.print();

    }
}
