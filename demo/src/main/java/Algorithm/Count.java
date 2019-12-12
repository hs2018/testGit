package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String str = "Look to the skies above London and you'll see the usual suspects rainclouds, plane and pigeons. But by the end of the year, you might just see something else.";
        str = str.replace('\'', ' ');//将'号用空格替换
        str = str.replace(',', ' ');//将逗号用空格替换
        str = str.replace('.', ' ');//将句号用空格替换

        String[] strings = str.split("\\s+");   // “\\s+”代表一个或多个空格，是正则表达式
//      String[] strings = str.split(" +"); // “ +”在我的机器上也能代表一个或多个空格

        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();//存储每个不重复的单词

        for(String s : strings){
            if(map.containsKey(s)){//如果map中已经包含该单词，则将其个数+1
                int x = map.get(s);
                x++;
                map.put(s, x);
            }else{  //如果map中没用包含该单词，代表该单词第一次出现，则将其放入map并将个数设置为1
                map.put(s, 1);
                list.add(s);//将其添加到list中，代表它是一个新出现的单词
            }
        }

        int max=0;//记录出现次数最多的那个单词的出现次数
        String maxString = null;//记录出现次数最多的那个单词的值
        /*
         * 从list中取出每个单词，在map中查找其出现次数
         * 并没有真正排序，而只是记录下出现次数最多的那个单词
         */
        for(String s : list){
            int x = map.get(s);
            if(x>max){
                maxString = s;
                max = x;
            }
        }

        System.out.println("字符串："+maxString+"出现次数："+max);

        long end = System.currentTimeMillis();

        System.out.println("共耗时：" + (end - start) + "毫秒");


        /**
         * 
         */
        String str1 = "tathishahathis";
        String str2 = "this";
        int total = 0;
        for (String tmp = str1; tmp != null && tmp.length() >= str2.length(); ) {
            if (tmp.indexOf(str2) == 0) {
                total++;
            }
            tmp = tmp.substring(1);
        }
        System.out.println(str1 + "中含有" + total + "个" + str2);
    }
}