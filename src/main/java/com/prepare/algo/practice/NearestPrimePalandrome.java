package com.prepare.algo.practice;

public class NearestPrimePalandrome {

    public static void main(String[] args){



    }
    public int primePalindrome(int N) {
        int x = N;
        while(!isPrimeAndPal(x)){
            x++;
            //System.out.println("--"+x);
        }
        return x;
    }

    public boolean isPrimeAndPal(int x){
        if(x == 1 || x==2 ){
            return isPalindrome(x);
        }
        if(x%2 == 0){
            return false;
        }

        for(int i=3; i*i<=x; i+=2){
            if(x%i==0){
                return false;
            }
        }
        return isPalindrome(x);
    }

    public boolean isPalindrome(int x){
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb = sb.reverse();
        if(x == Integer.parseInt(sb.toString())){
            return true;
        }
        return false;
    }
}
