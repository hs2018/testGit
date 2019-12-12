package Algorithm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCount {
    public static void main(String[] args) {
       /* Long start = System.currentTimeMillis();
        String str =  "Look to the skies above London and you'll see the usual suspects rainclouds, plane and pigeons. But by the end of the year, you might just see something else.";
        str = str.replace('\'',' ');
        str = str.replace(',',' ');
        str = str.replace('.',' ');
        String[] strings = str.split(" ");
        Map<String,Integer> mapWord = new HashMap<String, Integer>();
        List<String> listWord = new ArrayList<String>();
        for(String s : strings){
            if (mapWord.containsKey(s)){
                int t = mapWord.get(s);
                t++;
                mapWord.put(s,t);
            }else {
                mapWord.put(s,1);
                listWord.add(s);
            }
        }
        int max = 0;
        String maxString = null;
        for(String s : listWord){
            Integer t = mapWord.get(s);
            if(t>max){
                max = t;
                maxString = s;
            }
        }
        System.out.println("maxWord: "+maxString  +'\n' +"times:  " +max);
        Long end = System.currentTimeMillis();
        System.out.println("time:  "+(end - start)+"ms");
    }*/
        String str1 = "tathiis";
        String str2 = "this";
        int total = 0;
        for (String tmp = str1; tmp != null && tmp.length() >= str2.length(); ) {
            int mark = tmp.indexOf(str2);
            if(mark == -1){
                break;
            }else {
                total++;
            }
            tmp = tmp.substring(mark+4);
        }
        System.out.println(str1 + "中含有" + total + "个" + str2);

        System.out.println(reverseString(str1));
    }


        public static String reverseString(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length()-1; i >=0 ; i--) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
    }
}