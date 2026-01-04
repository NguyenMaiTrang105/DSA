package DSATUT5Ssl;

public class SLNode {
    private String data;
    private SLNode next;
    public SLNode(String newData){
        this.data=newData;
    }
    public void setNext(SLNode abc){
        this.next=abc;
    }
    public SLNode getNext(){
        return this.next;
    }
    public void setData(String xyz){
        this.data=xyz;
    }
    public String getData(){
        return this.data;
    }
}
