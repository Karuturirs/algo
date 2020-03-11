package com.prepare.algo.practice.crackingcodinginterview;

/**
 * Cracking coding interview
 * Chapter 1 Arrays and Strings
 * (1.2) Page 90
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith   ", 13
 * Output: "Mr%20John%20Smith"
 */
public class URLify {

    public static void main(String[] args) {
        String url = "Mr John Smith   ";
        int len = 13;
        URLify urlifyobj = new URLify();
        System.out.println(urlifyobj.checkurlify(url,len));
    }

    public  String checkurlify(String url, int length){
        StringBuilder db = new StringBuilder();

        int i=0;
        while(i<length){
            if(url.charAt(i)== ' ') {
                db.append("%20");
            }else{
                db.append(url.charAt(i));
            }
            i++;
        }

        return db.toString();
    }
}
