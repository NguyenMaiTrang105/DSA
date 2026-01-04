package DSA7_PostfixEvaluation;

public class ArrayStack {
    private int [] items;
    private static final int maxSize=100;
    private int top;
    public ArrayStack(){
        items=new int[maxSize];
        top=-1;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(top==maxSize-1){
            return true;
        }
        else {
            return false;
        }
    }
    public void push (int newItem){
        if(!isFull()){
            top++;
            items[top]=newItem;
        }
    }
    public int pop(){
        if(!isEmpty()){
            int tmp = items[top];
            top--;
            return tmp;
        }
        else {
            return -1;
        }
    }
    public int peek(){
       if(!isEmpty()){
           return items[top];
       }
       else {
           return -1;
       }
    }
}
