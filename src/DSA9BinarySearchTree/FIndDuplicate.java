package DSA9BinarySearchTree;

public class FIndDuplicate {
    public FIndDuplicate(){

    }

    public static void main(String[] args) {
        int[] a= {5,7,3,2,5,10,3,3};
        BinarySearchTree t = new BinarySearchTree();
        for(int i=0;i<a.length;i++){
            if(t.insert(a[i],t)==false);
            {
                System.out.println(a[i]+" is a duplicate number!");
            }
        }
    }
}
