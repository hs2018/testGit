package Algorithm;

public class ReverseString {
 static String getString(String s){
  StringBuilder sb=new StringBuilder();
  for(int i=s.length()-1;i>=0;i--){
   sb.append(s.charAt(i));
  }
  return sb.toString();
 }
   public static void main(String[] args) {
 String s="this is english";
 String s1=ReverseString.getString(s);
 System.out.println(s1);
 }

}