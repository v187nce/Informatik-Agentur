public class Node<ContentType>{
    //Attribute
    private Node<ContentType> next;
    private ContentType content;
    
    //Konstruktor(en)
    public Node(ContentType pContent){
        content = pContent;
        next = null;
    }
    
    //Methode(n)
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node pNext){
        next = pNext;
    }
    
    public ContentType getContent(){
        return content;
    }
    
}