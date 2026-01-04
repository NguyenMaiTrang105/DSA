package DSATUT5Arr;

public class Arraylist {
    private int[] items;
    private static final int maxSize=100;
    private int length;
    public Arraylist(){
        items=new int[maxSize];
        length=0;
    }
    public boolean isEmpty(){
        return (length==0);
    }
    public int getLength(){
        return length;
    }
    public void add(int pos, int newItem){
        for (int i=length;i>=pos;i--){
            items[i]=items[i-1];
            items[pos-1]=newItem;
            length++;
        }
    }
    //remove(2)
    //2514 ->>214
    public void remove(int pos){
        for (int i=pos-1;i<=length;i++){
            items[i]=items[i+1];
        }
        length--;
    }
    public void removeAll(){
        length=0;
    }
    public int get (int pos){
        return items[pos-1];
    }
}
