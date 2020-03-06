package com.prepare.algo.practice;


import java.util.*;

public class MaxSleepingTimeforBusinessMan {

    public static  void main(String[] args){
       /* String S = "Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:00-23:00\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:00-23:00";*/

        String S = "Sun 10:00-20:00\n" +
                "Fri 05:00-10:00\n" +
                "Fri 16:30-23:50\n" +
                "Sat 10:00-24:00\n" +
                "Sun 01:00-04:00\n" +
                "Sat 02:00-06:00\n" +
                "Tue 03:30-18:15\n" +
                "Tue 19:00-20:00\n" +
                "Wed 04:25-15:14\n" +
                "Wed 15:14-22:40\n" +
                "Thu 00:00-23:59\n" +
                "Mon 05:00-13:00\n" +
                "Mon 15:00-21:00";
        MaxSleepingTimeforBusinessMan m = new MaxSleepingTimeforBusinessMan();
        System.out.println(" "+m.solution(S));
    }

    public  int solution(String S) {
        // write your code in Java SE 8
        String[] meetings = S.split("\n");
        int max = 0;
        String prevTime = "00:00";
        String prevDay ="Mon";
        HashMap<String, Integer> daysmapping = new HashMap<>();
        daysmapping.put("Mon",0);
        daysmapping.put("Tue",1);
        daysmapping.put("Wed",2);
        daysmapping.put("Thu",3);
        daysmapping.put("Fri",4);
        daysmapping.put("Sat",5);
        daysmapping.put("Sun",6);
        for(int i=0; i<meetings.length;i++){
            String[] day = meetings[i].split(" ");
            String[] time =  day[1].split("-");
            System.out.println(day[0]+ " "+ prevTime+" "+ time[0]);

            int free = diffMinutes(prevTime, time[0], daysmapping.get(prevDay.trim()), daysmapping.get(day[0].trim()));
            prevTime = time[1];
            prevDay = day[0];
            System.out.println( "  "+free );
            if( max < free){
                max = free;
            }
        }
        return max;
    }

    public int diffMinutes(String f1, String f2 , int f1daysdiff, int f2daydiff){
        System.out.println("f1:"+f1 +" f1daysdiff:"+f1daysdiff+" f2:"+f2+" f2daydiff:"+f2daydiff);
        int a = (mintuesconvert(f2, f2daydiff)-mintuesconvert(f1, f2daydiff));
        return (a<0)? a*-1 : a;
    }

    public int mintuesconvert(String x, int y){
        String[] time = x.split(":");
        int k =Integer.parseInt(time[1])+(Integer.parseInt(time[0])*60)+(y*24); //mitues since Monday 00::00
        System.out.println("k:"+k+" ");
        return k;
    }
}
