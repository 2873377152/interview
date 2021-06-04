/**
 * @author ：TianZhuang
 * @PackageName：PACKAGE_NAME
 * @className ：Test99
 * @date ：Created 2021/5/31 17:26
 * @description：99乘法表
 */
public class Test99 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int resut=i*j;
                System.out.print(" "+i+"*"+j+"="+resut+"\t");
                if(i==j){
                    System.out.println("\n");
                }
            }

        }
    }
}
