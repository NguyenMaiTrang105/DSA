package DSA_TUT3_Sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = {1,0,9,5,8,6,2,4};
        insertionSort(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }

    }
    public static void insertionSort (int [] numbers) {
        int n = numbers.length;
        for (int j = 1; j < n; j++) {
            int tmp = numbers[j];
            int i = 0;
            for (i = j - 1; i >= 0 && numbers[i] > tmp; --i) {
                numbers[i + 1] = numbers[i];
            }
            numbers[i + 1] = tmp;
        }
    }
}
