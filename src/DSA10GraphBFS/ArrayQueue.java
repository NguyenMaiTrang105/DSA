package DSA10GraphBFS;

import java.awt.desktop.PreferencesEvent;

public class ArrayQueue {
    private int [] items;
    private static final int maxSize=10000;
    private int front;
    private int rear;
    public ArrayQueue(){
        items=new int[maxSize];
        front=0;
        front=0;
    }
    public boolean isEmpty()
    {
        if(front==rear)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(rear==(front-1)%maxSize)
            return true;
        else
            return false;
    }
    public void enqueue(int newItem){
        if(!isFull()){
            items[rear]=newItem;
            rear=(rear+1)%maxSize;
        }
    }
    public int dequeue(){
        if(!isEmpty()){
            int pos = front;
            front=(front+1)%maxSize;
            return items[pos];
        }
        else
            return -1;
    }
    public int peek(){
        if(!isEmpty())
            return items[front];
        else {
            return -1;
        }
    }
}
