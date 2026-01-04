package DSA10GraphBFS;

public class GVertex {
    private char label;
    private char color;
    public GVertex (char label){
        this.label=label;
        color='B';
    }
    public char getLabel (){
        return label;
    }
    public void setLabel (char label){
        this.label=label;
    }
    public char getColor(){
        return color;
    }
    public void setColor (char color){
        this.color=color;
    }
}
