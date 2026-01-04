package DSA_TUT3_Sort;

public class QuickSort {
    public static void main(String[] args) {
        int [] array= new int[]{1,0,4,3,8,5,6,9,12,10};
        quickSort(array,0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.print(""+array[i]);
        }

    }
    private static void quickSort (int [] array, int idleftMost, int idrightMost){
        if(idleftMost<idrightMost){
            int pivot = partition(array,idleftMost,idrightMost);
            quickSort(array,idleftMost,pivot-1);
            quickSort(array,pivot+1,idrightMost);
        }
    }
    public static int partition (int[] array, int idleftMost, int idrightMost){
        int down = idleftMost;
        int up=idrightMost;
        int pivot = array[idleftMost];
        while (down<up){
            while (down<up&&array[down]<=pivot){
                down++;
            }
            while (up>=down&&array[up]>pivot){
                up--;
            }
            if(down<up){
                int tmp=array[down];
                array[down]=array[up];
                array[up]=tmp;
            }
        }
        array[idleftMost]=array[up];
        array[up]=pivot;
        return up;
    }
}
