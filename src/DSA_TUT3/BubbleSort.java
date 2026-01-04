package DSA_TUT3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of input");
        int n = sc.nextInt();
        int[] numbers = new int [n];
        for (int i =0;i<n;++i){
            System.out.print("Enter input "+(i+1));
            numbers[i]= sc.nextInt();
        }
        bubbleSort(numbers);
        System.out.println("Sorted array is");
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }


    }
    public static void bubbleSort (int[] numbers){
        int n = numbers.length;
        for (int i=0;i<n-1;++i){
            for (int j=0;j<n-1-i;++j){
                if (numbers[j]>numbers[j+1]){
                    int tmp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=tmp;
                }
            }
        }
    }
}
