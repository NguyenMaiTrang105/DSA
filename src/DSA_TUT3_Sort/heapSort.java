package DSA_TUT3_Sort;

public class heapSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 3, 2, 6, 4, 7, 8, 9};
        HeapSort(array);

        for(int i = 0; i < array.length; ++i) {
            System.out.print("" + array[i]);
        }
    }
    public static int leftChild(int i){
        return 2*i+1;
    }
    public static int rightChild(int i){
        return 2*i+2;
    }
    public static void trickleDown (int [] array, int n,int i){
        int l = leftChild(i);
        int r = rightChild(i);
        int maxPos =i;
        if (l<n&& array[l]>array[maxPos]){
            maxPos=l;
        }
        if (r<n&& array[r]>array[maxPos]){
            maxPos=r;
        }
        if (maxPos!=i){
            int tmp = array[i];
            array[i]=array[maxPos];
            array[maxPos]=tmp;
            trickleDown(array,n,maxPos);
        }
    }
    public static void buildHeap (int [] array, int n){
        for (int i=n/2-1;i>=0;--i){
            trickleDown(array,n,i);
        }
    }
    public static void HeapSort (int[] array){
        int n = array.length;
        buildHeap(array,n);
        for (int i = n-1;i>0;--i){
            int tmp = array[0];
            array[0]=array[i];
            array[i]=tmp;
            --n;
            trickleDown(array,n,0);
        }
    }
}
