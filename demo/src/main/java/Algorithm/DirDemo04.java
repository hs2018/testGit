package Algorithm;

import java.io.File;

/*
 * 递归：方法自己调自己
   打印子孙级目录和文件的名称(了解，但要能写出来)
 */
public class DirDemo04 {
 
	public static void main(String[] args) {
	File src=new File("F:\\360Downloads");
	
	printName(src,1);
	}
	
	public static void printName(File src,int deep){
		//控制层次感
		for(int i=0;i<deep;i++){
			System.out.print("-");
		}
		
		System.out.println(src.getAbsolutePath());
		if(null==src||!src.exists()){//递归头
			return;
		}else if(src.isDirectory()){//目录
			for(File s:src.listFiles()){//递归体
				 printName(s,deep+1);
			}
		}
	}
 
}