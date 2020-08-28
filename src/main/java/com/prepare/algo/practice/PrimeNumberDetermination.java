package com.prepare.algo.practice;

public class PrimeNumberDetermination {

    public static void main(String[] args){
        PrimeNumberDetermination pm = new PrimeNumberDetermination();
         System.out.println("Is 3 Prime?  "+pm.isPrime(3));

    }

    // Big O(n)
    public boolean isPrime(int n){

        for(int i=2; i<n; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    // checking until n/2 is ok instead of n
    public boolean isPrimeHalf(int n){
        for(int i=2; 2*i < n ; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    // using square root method
    public boolean isPrimeRoot(int n){
        // finding if divisble by 2
        if(n%2 == 0){
            return false;
        }
        // finding if divisble by odd numbers until square root of n
        for(int i=3; i*i <=n; i+=2 ){
            if(n%i ==0)
                return false;
        }
        return true;
    }

    //Much better solution
    public boolean is_prime(int n){
        if(n <= 3) {
            return n > 1;
        } else if( n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int i = 5;

        while( i * i <= n) {
            if( n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

       return true;

    }
}
