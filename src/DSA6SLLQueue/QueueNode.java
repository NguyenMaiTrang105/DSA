package DSA6SLLQueue;

public class QueueNode {
    private int data;
    private QueueNode next;
    public QueueNode (int data){
        this.data=data;
        this.next=null;
    }
    public void setNext(QueueNode next){
        this.next=next;
    }
    public QueueNode getNext(){
        return this.next;
    }
    public void setData (int data){
        this.data=data;
    }
    public int getData(){
        return this.data;
    }
}
