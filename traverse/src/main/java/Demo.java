import java.io.File;

/**
 * @author ：TianZhuang
 * @PackageName：PACKAGE_NAME
 * @className ：Demo
 * @date ：Created 2021/5/31 18:13
 * @description：aaa
 */
public class Demo {

    public static void main(String[] args) {
          test();
    }

    public static void test() {

        File[] files = new File("D:\\test\\src").listFiles();
        try {
            for (int i = 0; i <=files.length; i++) {
                if (files[i].getName().replaceAll("(.jpg|.png|.bmp|.gif)+", "").length() != files[i].getName().length()) {
                    System.out.println(files[i].getName());
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


    }

}
