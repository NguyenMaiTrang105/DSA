package DSA7_BaseConversion;

import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        int k;
        int b;
        System.out.println("Please input a number in base 10");
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Please input  a base to convert");
        b=sc.nextInt();
        ArrayStack s = new ArrayStack();
        while (k/b!=0){
            s.push(k%b);
            k=k/b;
        }
        s.push(k);
        System.out.println("The number in base "+b+" is: ");
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
        System.out.println("");

    }
}
