package DSA_TUT3_Sort;

public class selectionSort {
    public static void main(String[] args) {
            int[] numbers = new int[]{1, 4, 2, 8, 5, 9, 0, 3};
            selectionSort(numbers);

            for(int i = 0; i < numbers.length; ++i) {
                System.out.print("" + numbers[i]);
            }
    }
    public static void selectionSort (int [] numbers){
        int n = numbers.length;
        for (int i=0;i<n;++i){
            int min = numbers[i];
            int pos =i;
            for (int j=i+1;j<n;++j){
                if(numbers[j]<min){
                    pos=j;
                    min=numbers[j];
                }
            }
           int temp = numbers[i];
            numbers[i]=numbers[pos];
            numbers[pos]=temp;
        }
    }
}
