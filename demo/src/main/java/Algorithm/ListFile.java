package Algorithm;

import java.io.File;

public class ListFile {
    public static void dir(File f) {
        //获得当前路径下的所有文件和文件夹
        File[] allFiles = f.listFiles();
        //循环所有路径
        int i = 0;
        for (i = 0; i < allFiles.length; i++) {
            //如果是文件夹
            if (allFiles[i].isDirectory()) {
                //递归调用
                dir(allFiles[i]);
            } else { //文件
                //执行操作，例如输出文件名
                System.out.println(allFiles[i].getName());
            }
        }
    }


    public static void main(String[] args) {
        File src=new File("F:\\360Downloads");
      ListFile.dir(src);
    }
}