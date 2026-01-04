package DSA9ExpressionTree;

public class ArrayStack {
    private char[] items;
    private static final int maxSize=100;
    private int top;
    public ArrayStack(){
        items=new char[maxSize];
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
    public void push (char newItem){
        if(!isFull()){
            top++;
            items[top]=newItem;
        }
    }
    public char pop(){
        if(!isEmpty()){
            char tmp = items[top];
            top--;
            return tmp;
        }
        else
            return '\u0000';
    }
    public char peek(){
        if(!isEmpty()){
            return items[top];
        }
        else {
            return '\u0000';
        }
    }
}
