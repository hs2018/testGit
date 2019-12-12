package Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
 * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
 */
public class CountNumber {
 
 //定义一个方法，用于判断连续字母的个数
 public static String zipStr(String iniString){
  if(iniString == null || iniString.length()==0) {
              return null;
          }
          StringBuilder sb = new StringBuilder();
          int len = iniString.length();
          for(int i=0;i<len;i++) {
              int count = 1;
              while((i+1)<len && iniString.charAt(i) == iniString.charAt(i+1)){
                  count++;
                  i++;
              }
              if(count>=1){
                  sb.append(iniString.charAt(i));
                  sb.append(count);
              }else{
                  sb.append(iniString.charAt(i));
              }
          }
          if(sb.length() < iniString.length()){
              return sb.toString();
          }
          return iniString;
  }
   public static void main(String[] args) {
   String str="wwwwelcometonowcoderrrrrfdagsdfgdfgsgreahcvbsthshrthsfdage";
       String str1="aabcccccaaa";
   String str2=CountNumber.zipStr(str);    
   System.out.println(str2);      
  }   
}