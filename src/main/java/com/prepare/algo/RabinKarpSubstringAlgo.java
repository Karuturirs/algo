package com.prepare.algo;

public class RabinKarpSubstringAlgo {

    public static void main(String[] args){

        String main = "dddadsda";
        String sub = "adsda";

        boolean flag = false;
        int index = -1;
        for(int i=0; i<= main.length()-sub.length(); i++){
            if(main.substring(i, i+sub.length()).equals(sub)){
                flag =true;
                index =i;
               break;
            }
        }

        System.out.println("-->"+flag+ " index:"+index);

        //RabinKarpSubstringAlgo rr = new RabinKarpSubstringAlgo();
       // System.out.println(rr.containSubstring(main, sub));

    }



    public boolean containSubstring(String main, String sub){

        long sub_hash = hash(sub);
        long hash = hash(main.substring( 0 , sub.length() ));
        System.out.println("subhash::"+sub_hash);
        for(int i = sub.length(); i < main.length(); i++){
            System.out.println(" hash::"+hash);
            if(hash == sub_hash){
                return true;
            }else{
                hash = (long) (((hash -  ( hash(main.charAt(i - sub.length())) * Math.pow(2, i-sub.length()) )) * 2 )
                                        + hash(main.charAt(i)));
            }
        }

        return false;
    }

    public int ascii(char c){
        return (int)c;
    }

    public long hash(char c){
        return hash(String.valueOf(c));
    }

    public long hash(String S) {

        if(S != null){
            long x = 0;
            for (int i = 0; i < S.length(); i++) {
                x += (ascii(S.charAt(i)) * Math.pow(2, S.length() - i + 1));
            }
            System.out.println(S+"  :: " + x);
            return x;
        }else{
            return -1;
        }

    }

}
