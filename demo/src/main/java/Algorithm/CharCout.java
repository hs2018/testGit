package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class CharCout {
   public static void main(String[] args) {
	   String sourceStr = "a bba1a+";
	 //创建一个容器，用来保存结果，英文字母空格数组和其他字符做key，个数为value
	   Map<String,Integer> map = new HashMap<String,Integer>();
	   //循环字符串中的字符
	   for(int i=0;i<sourceStr.length();i++){
	       //获取字符串第i位的字符
	       String eStr = String.valueOf(sourceStr.charAt(i));
	       //若结果集中没有这个字符，则向结果集中增加这个字符，并初始化这个字符的值为1
	       if(!map.containsKey(eStr)){
	           map.put(eStr, 1);
	       }
	       //如果结果集中已经存在这个字符，则获取这个字符并且加1更新value值
	       else{
	           map.put(eStr,map.get(eStr)+1);
	       }
	   }
	   
	   for(Map.Entry<String, Integer> entry : map.entrySet()){
		   System.out.println("字符 "+entry.getKey()+"的个数:"+entry.getValue());
	   }
   }
}