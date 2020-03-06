import java.util.*;

public class AcubePlusBcube{

  public static void main(String[] args){
    int n=Integer.parseInt(args[0]);
     Map<Double,ArrayList<String>> maplist = new HashMap<>();
     for(int a=1; a<n; a++){
       for(int b=1; b<n; b++){
         double x = Math.pow(a,3)+Math.pow(b,3);
         if(maplist.containsKey(x)){
           ArrayList<String> list = maplist.get(x);
           list.add(a+","+b);
           maplist.put(x, list);
         }else{
           ArrayList<String> as= new ArrayList<String>();
           as.add(a+","+b);
           maplist.put(x,as);
         }
       }
     }
     maplist.forEach((k,v) -> {
       System.out.println("******"+k+"---->>");
       for(int i=0; i < v.size(); i++){
         for(int j=0; j< v.size(); j++){
           System.out.println("   "+v.get(i)+ "--"+v.get(j));
         }
       }
     });
     System.out.println("Total possiblities for n="+n+" is :"+maplist.size());
  }

}
