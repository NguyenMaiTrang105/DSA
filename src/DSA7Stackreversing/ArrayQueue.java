package DSA7Stackreversing;

public class ArrayQueue {
    private char[] items;
    private static final int maxSize=100;
    private int front;
    private int rear;
    public ArrayQueue(){
        items=new char[maxSize];
        front=0;
        rear=0;
    }
    public boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(rear==front-1){
            return true;
        }
        else {
            return false;
        }
    }
    public void enqueue (char newItem){
        if(!isFull()){
            items[rear]=newItem;
            rear=(rear+1)%maxSize;
        }
    }
    public char dequeue (){
        if(!isEmpty()){
            int pos=front;
            front=(front+1)%maxSize;
            return items[pos];
        }
        else {
            return '\u0000';
        }
    }
    public char peek(){
        if(!isEmpty()){
            return items[front];
        }
        else return '\u0000';
    }
}
