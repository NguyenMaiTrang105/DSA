package DSATUT11_FindMyCoffe;

public class GVertex {
    private int index;
    private int row;
    private int column;
    private boolean marked;
    private int numOfAdjVertex;
    private int[] adjVertex;
    public GVertex (int index, char[][]map, int m,int n){
        this.index=index;
        row=index/n;
        column=index%n;
        marked=false;
        numOfAdjVertex=0;
        adjVertex=new int [4];
        if (row>0){
            if (map[row-1][column]!='X');
        }

    }
}
