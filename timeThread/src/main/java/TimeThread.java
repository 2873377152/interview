import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：TianZhuang
 * @PackageName：PACKAGE_NAME
 * @className ：TimeThread
 * @date ：Created 2021/5/31 17:37
 * @description：编写TimeThread，负责计时，并打出当前的时间,输出小时分钟秒钟，时间格式要求为：12:35:28。并做测试。
 */
public class TimeThread extends Thread {

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
    @Override
    public void run() {
        while (true){
            String str=simpleDateFormat.format(new Date());
            System.out.println(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//测试
    public static void main(String[] args) {
        TimeThread thread=new TimeThread();
        thread.start();
    }

}
