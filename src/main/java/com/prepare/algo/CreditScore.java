package com.prepare.algo;

import java.util.*;


public class CreditScore {

    public static void main(String[] args) {

        CreditScore cs = new CreditScore();
        String[] applicant_ids = {"A","B","C","D","A","E"};
        int[] credit_scores = {6,5,4,3,2,1};
        System.out.println(cs.creditScoreChecker(applicant_ids, credit_scores));

        String sample_text = "This is the basic test that you need to update and manage according to the values we had and need to replace the content";
        String[] blacklist = {"is", "replace", "to", ","};
        String replace = "--";
        System.out.println(cs.replaceAllBlackList(sample_text,blacklist,replace));
    }

    /**
     * Given an sample_text and string array list and replace string to replace in the sample_text
     * @param sample_text
     * @param blacklist
     * @param replacement
     * @return
     */
    public String replaceAllBlackList(String sample_text, String[] blacklist, String replacement){

        for(int i=0; i<blacklist.length; i++){
            sample_text = sample_text.replaceAll(blacklist[i], replacement);
        }

        return sample_text;
    }

    /**
     *
     * @param applicant_ids
     * @param credit_scores
     * @return
     */
    public String creditScoreChecker(String[] applicant_ids, int[] credit_scores){

        Map<Integer,String> treemap = new TreeMap<Integer,String>();
        HashMap<String, Integer> elements = new HashMap<>();

        for(int i=0; i<applicant_ids.length; i++){
            if(elements.containsKey(applicant_ids[i])){
                elements.put(applicant_ids[i], -100);
            }else{
                elements.put(applicant_ids[i], credit_scores[i]);
            }
            treemap.put(credit_scores[i],applicant_ids[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> entry : treemap.entrySet()){
            if(elements.get(entry.getValue()) != -100){
                sb.append(entry.getValue());
            }
        }

        return sb.toString();

    }
}
