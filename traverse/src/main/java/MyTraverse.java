import org.junit.Test;

import java.io.File;
import java.util.LinkedList;

/**
 * @author ：TianZhuang
 * @PackageName：PACKAGE_NAME
 * @className ：MyTraverse
 * @date ：Created 2021/5/31 17:59
 * @description：遍历指定文件夹下所有图片
 */
public class MyTraverse {
    @Test
    public void traverseFolder1() {
        String path = "D:\\test\\src";
        int fileNum = 0;
        int folderNum = 0;
        int foldeNum = 0;
        File file = new File(path);
        if (file.exists()) {
            LinkedList list = new LinkedList();

//list()方法是返回某个目录下的所有文件和目录的文件名，返回的是String数组
//listFiles()方法是返回某个目录下所有文件和目录的绝对路径，返回的是File数组

            File[] files = file.listFiles();

            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("文件夹:" + file2.getAbsolutePath());
                    list.add(file2);
                    foldeNum++;
                } else {
                    System.out.println("文件:" + file2.getAbsolutePath());
                    fileNum++;
                }
            }

            File temp_file;

            while (!list.isEmpty()) {
                temp_file = (File) list.removeFirst();//删除第一个元素，也就是找到数组中的第一个元素返回一个File去判断，说白了就是循环分别找到每个文件下面对应的是文件还是文件夹，如果循环下一级还是文件夹则继续循环直到结束(思想就是一层一层去判断查找知道找到所有的文件和文件夹，不明白看下面的例子。)
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {//如果是个目录(文件夹)则返回true
                        System.err.println("文件夹:" + file2.getAbsolutePath());
                        list.add(file2);
                        folderNum++;
                    } else {//输出文件
                        System.out.println("文件:" + file2.getAbsolutePath());//返回文件的完整路径。
                        fileNum++;
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        System.out.println("文件夹共有:" + folderNum + ",文件共有:" + fileNum);

    }

}
