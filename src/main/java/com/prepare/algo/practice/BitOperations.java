package com.prepare.algo.practice;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Random;

public class BitOperations {

    public static void main(String[] args){

        int x =50;

        System.out.println(6&4); // (0110 & 0100 = 0100)
        System.out.println(1|2); // (0001 | 0010)
        System.out.println(8>>1);// 1000>> 1 = 0100(Signed right shift)
        System.out.println(-16>>2);// -16/(2^2)
        System.out.println(-16>>>2); // UnSigned right shift
        System.out.println(1<<10);// 1*(2^10)
        System.out.println(~2); // INVERTION or NEGATION(NOT)
        System.out.println(1^1);// return 1 only if one of the operator is true(XOR)
        System.out.println(15^x);
        System.out.println(1|1);// return 1 only if any one of the operator is true(OR)
        for(int i=0; i<10;i++){
            System.out.println(i+":"+countOneBits(i));
        }
        System.out.println(1001&0);
        char[] ch = new char[]{'a','b'};

    }

    public static int countOneBits(int x){
        short count =0;
        while(x!=0){
            count += (x&1);
            x >>= 1;
        }
        return count;
    }

    /**
     * parity of a word is 1 when no:of 1's in binary is odd
     *         or else its 0
     * @param word (64 bit long word)
     * @return  1 or 0
     */
    public static short parity(long word){
        short result = 0;
        while(word !=0){
            result ^= (word & 1);
           word >>>= 1 ;
        }
        return result;
    }


}
