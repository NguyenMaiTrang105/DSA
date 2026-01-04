package DSA8ArrayTree;

import java.util.Arrays;

public class ArrayTree {
    private static final int maxSize = 10;
    private int n;
    private String[] l;
    private int[] p;

    public ArrayTree() {
        n = 0;
        l = new String[maxSize];
        p = new int[maxSize];
        Arrays.fill(p, -2);

    }

    public boolean isFull() {
        return (n == maxSize);
    }

    public boolean isEmpty() {
        return (n == 0);
    }

    public int getParent(int node) {
        return p[node];
    }

    public void addNode(String label, int parent) {
        if (!isFull()) {
            if (parent == -1) {
                l[0] = label;
                p[0] = parent;
            } else {
                int pos = parent + 1;
                while ((pos < n) && (getParent(pos) <= parent)) {
                    pos++;
                }
                for (int i = n; i > pos; i--) {
                    l[i] = l[i - 1];
                    p[i] = p[i - 1];
                }
                l[pos] = label;
                p[pos] = parent;
            }
            n++;
            System.out.println("Added node " + label);
        } else
            System.out.println("Tree is full now");
    }

    public String getNodeLabel(int node) {
        if (node != -1) {
            return l[node];
        } else {
            return null;
        }
    }

    public int leftMostChild(int node) {
        int i = node + 1;
        // tìm các con ngay sau node vì ở trên chỗ add node đã đc thiết kế là các node con sẽ nằm ngay sau node cha
        // node ở đây là index của l và p
        while ((i < n - 1) && (getParent(i) != node)) {
            i++;
        }
        if (getParent(i) == node) {
            return i;
        } else {
            return -1;
        }
    }

    public int rightMostChild(int node) {
        int i = n - 1;
        while (i > node && getParent(i) != node) {
            i--;
        }
        if (getParent(i) == node) {
            return i;
        } else {
            return -1;
        }
    }

    public int nearestRightSibling(int node) {
        int i = node + 1;
        if (getParent(i) == getParent(node)) {
            return i;
        } else return -1;
    }

    public void printTree() {
        System.out.println("Tree currently: ");
        for (int i = 0; i < n; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }

    public int rightSibling(int node) {
        int i = node + 1;
        //Find the first node i that i's parent is node's parent
        while ((i < n) && (getParent(i) != getParent(node))) {
            i++;
        }
        if (getParent(i) == getParent(node)) {
            return i;
        } else {
            return -1;
        }
    }

    public int getDegree(int node) { // degree- number of its children
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] == node) {
                count++;
            }
        }
        return count;
    }

    public boolean isLeaf(int node) { //leaf-node with no children
        return (getDegree(node) == 0);
    }

    public int countLeaves() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isLeaf(i)) {
                count++;
            }
        }
        return count;
    }

    public int getLevel(int node) {// level của 1 node là số lượng bước từ node đó đi lên root
        int count = 0;// Biến đếm số bước lên root
        int tmp = node;//tmp là node hiện tại cần xử lý
        //Lặp cho t khi gặp root (vì root có parent =-1;
        while (getParent(tmp) != -1) {
            tmp = getParent(tmp);//Đi ngược lên parent
            count++;// Mỗi lần đi thì tăng level;
        }
        return count;
    }

    public int getDepth() {// Depth tree là depth của node sâu nhất ko có con
        int maxLevel = 0;
        for (int i = 0; i < n; i++) {
            if (isLeaf(i)) {
                int level = getLevel(i);
                if (maxLevel < level) {
                    maxLevel = level;
                }
            }
        }
        return maxLevel;
    }

    public int search(String label) {
        for (int i = 0; i < n; i++) {
            if (l[i] == label) {
                return i;
            }
        }
        return -1;
    }
}

