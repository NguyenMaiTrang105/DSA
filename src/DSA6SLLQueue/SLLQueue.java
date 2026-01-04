package DSA6SLLQueue;

public class SLLQueue {
    private QueueNode front;
    private  QueueNode rear;
    public SLLQueue(){
        front=null;
        rear=null;
    }
    public boolean isEmpty(){
        if ((front==null)&&(rear==null)){
            return true;
        }
        else {
            return false;
        }
    }
    public void enqueue (QueueNode newNode){
        if (isEmpty()){
            front=newNode;
            rear=newNode;
        }
        else {
            rear.setNext(newNode);
            rear=newNode;
        }
    }
    public QueueNode dequeue(){
        QueueNode tmp;
        if (!isEmpty()){
            tmp=front;
            if (front==rear){
                front=null;
                rear=null;
            }
            else {
                front=front.getNext();

            }
            return tmp;
        }
        else return null;
    }
    public QueueNode peek(){
        if(!isEmpty()){
            return front;
        }
        else {
            return null;
        }
    }
}
