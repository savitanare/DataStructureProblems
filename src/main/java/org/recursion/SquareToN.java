package org.recursion;

public class SquareToN {


     public static int printXSquareN(int x , int n){

         if(n == 0 ){
             return 1;
         }
         if(x == 0){
             return 0;
         }

         int xPownm1 = printXSquareN(x, n-1);
         int xPown = x * xPownm1;
         return xPown;


    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = printXSquareN(x,n);
        System.out.println(ans);
    }

}
