package DSA_TUT3;

public class mergeSort {
    public static void main(String[] args) {

            int[] numbers = new int[]{1, 5, 0, 7, 3, 9, 2, 6, 8};
            mergesort(numbers);

            for(int i = 0; i < numbers.length; ++i) {
                System.out.print("" + numbers[i]);
            }

    }
    public static void mergesort (int [] numbers){
        if(numbers.length>=2){
            int n = numbers.length;
            int midIndex = n/2;
            int[] leftHalf = new int [midIndex];
            int [] rightHalf = new int [n-midIndex];
            int i;
            for (i=0;i<midIndex;++i){
                leftHalf[i]=numbers[i];
            }
            for (i=midIndex;i<n;++i){
                rightHalf[i-midIndex]=numbers[i];
            }
            mergesort(leftHalf);
            mergesort(rightHalf);
            merge(numbers,leftHalf,rightHalf);

        }
    }
    public static void merge (int [] numbers, int[] leftHalf, int[]rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i=0;
        int j=0;
        int k;
        for (k=0;i<leftSize&&j<rightSize;++k){
            if (leftHalf[i]<rightHalf[j]){
                numbers[k]=leftHalf[i];
                ++i;
            }
            else {
                numbers[k]=rightHalf[j];
                ++j;
            }
        }
        while (i<leftSize){
            numbers[k]=leftHalf[i];
            ++i;
            ++k;
        }
        while (j<rightSize){
            numbers[k]=rightHalf[j];
            ++j;
            ++k;
        }
    }
}
