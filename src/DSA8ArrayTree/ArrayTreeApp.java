package DSA8ArrayTree;

public class ArrayTreeApp {
    /**
     * Constructor for objects of class ArrayTreeApp
     */
    public ArrayTreeApp()
    {
    }


    public static void main(String[]args)
    {
        ArrayTree T=new ArrayTree();

        T.addNode("A",-1);

        T.addNode("B",0);
        T.addNode("C",0);
        T.addNode("D",0);
        T.addNode("G",3);
        T.addNode("E",2);
        T.addNode("H",4);
        T.addNode("I",4);
        T.addNode("F",2);
        T.addNode("K",5);

        T.printTree();

        System.out.println("The left most child of A is: "+T.getNodeLabel(T.leftMostChild(0)));
        System.out.println("The right sibling of D is: "+T.getNodeLabel(T.nearestRightSibling(3)));
        System.out.println("Total leaves of the tree: " + T.countLeaves());
        System.out.println("The depth of the tree: " + T.getDepth());
        System.out.println("The node which has label H is: " + T.search("H"));

    }
}
