package com.prepare.algo;

public class StringBuilderApp{
  // characters stored in
  char[] value;
  // number of characters used
  int count;

  StringBuilderApp(){
    value = new char[1];
    count = 0;
  }

  public void append(Object obj){
    append(String.valueOf(obj));
  }

  public void append(String obj){
    evaluateValue(obj);
  }

  public void evaluateValue(String str){
    int currentcount = value.length;
    if(currentcount < count + str.length()){
      updateSize(str.length());
    }else{
      appendValue(str);
    }
  }

   public void updateSize(int length){
     int min = value.length;
     if(value.length < count+length){
      min = (count+length)*2;
    }
     char[] value1 = new char[min];
     for(int i=0 ; i< value.length; i++){
       value1[i] = value[i];
       System.out.println("---"+value1[i]);
     }
     value = value1;
   }

   public void appendValue(String str){
     for(int i=0; i< str.length();i++){
       value[count+1]= str.charAt(i);
       count++;
     }
   }

   public String toString(){
     return String.valueOf(value);
   }
}
