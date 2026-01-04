package DSA9ExpressionTree;

public class ETStack {
    private ExpressionTree [] items;
    private static final int maxSize=100;
    private int top;
    public ETStack(){
        items=new ExpressionTree[maxSize];
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
    public void push (ExpressionTree newItem){
        if(!isFull()){
            top++;
            items[top]=newItem;
        }
    }
    public ExpressionTree pop(){
        if(!isEmpty()){
            ExpressionTree tmp = items[top];
            top--;
            return tmp;
        }
        else {
            return null;
        }
    }
    public ExpressionTree peek(){
        if(!isEmpty()){
            return items[top];
        }
        else {
            return null;
        }
    }
}
