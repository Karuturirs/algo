package com.prepare.algo.practice;

public class MaxSumOfSubArray {


    public static void main(String[] args )
    {
        int A[] = {6,1,4,6,3,2,7,4};
        int K =3;
        int L =2;
        System.out.println("-----"+solution(A,K,L));

    }

    public static int solution(int[] A, int K, int L) {

        int len = A.length; //8

        int x = K + L; //5

        if (x <= len) { //true
            int max = -1;
            for (int i = 0; i < (len - x); i++) { //1<3
                int ali = findSumForIndexB(A,i,K);
                System.out.println("ali:"+ali);
                for(int j= i+K ; j<= len - L ; j++){
                    int bob = findSumForIndexB(A, j, L);
                   // System.out.println("  bob:"+bob + "--> Max:"+max);
                    if(max < ali+bob){
                        max = ali+bob;
                    }
                }
            }
            return max;
        } else {
            return -1;
        }
    }

    public static int findSumForIndexB(int A[],int b,int d){

        int a = 0;
        //System.out.println(b + "--" +d);
        for (int x = b; x < b+d; x++) { //1<5
            a += A[x];
        }
        return a;
    }
}

