package com.prepare.algo.practice.crackingcodinginterview;

public class GenericsPrac {

    public static void main(String[] args) {
        GenericsPrac gp = new GenericsPrac();



    }


    public <T> T getAllCOmbinations(String a, Class<T> t, boolean flag){

        return (flag) ? t.cast(a) : t.cast(a.getBytes());

    }



}



