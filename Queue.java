public class Queue<ContentType>{
    //Attribute
    private Node<ContentType> head;
    private Node<ContentType> tail;
    
    //Konstruktor(en)
    public Queue(){
        head = null;
        tail = null;
    }
    
    //Methode(n)
    public ContentType front(){
        if (!isEmpty()){
            return head.getContent();      
        }
        return null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void dequeue(){
        if(!isEmpty())
            head = head.getNext();        
    }
    
    public void enqueue(ContentType pContent){
        Node neu = new Node<ContentType>(pContent);
        if (!isEmpty()){
            tail.setNext(neu);
            tail = neu;
        }
        else{
            head = neu;
            tail = neu;
        }
    }
    
    
    
    
    
}