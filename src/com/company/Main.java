package com.company;

public class Main {

    public static void main(String[] args) {
        int fibValue = 0;
        int i = 1;
        while(fibo(i) < 4000000){
            if (fibo(i) % 2 == 0){
                fibValue += fibo(i);
                i++;
            } else{
                i++;
            }
        }
        System.out.println(fibValue);
    }



    public static int fibo(int n){ //Finds Fibonacci of n
        if(n <= 1){
            return n;
        }
        int fibo = 1;
        int fiboPrev = 1;
        for(int i = 2; i < n; ++i){
            int temp = fibo;
            fibo += fiboPrev;
            fiboPrev = temp;
        }
        System.out.println(fibo);
        return fibo;
    }
}
