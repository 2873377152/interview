import java.util.Scanner;

/**
 * @author ：TianZhuang
 * @PackageName：PACKAGE_NAME
 * @className ：Sort
 * @date ：Created 2021/5/30 17:34
 * @description：冒泡排序
 */
public class Sort {
    public static void main(String[] args) {
            sort();
    }

    public static void sort(){
        Scanner sc=new Scanner(System.in);
        int sort[]=new int[10];
        int temp;
        System.out.println("请输入十个数：");
        for(int i=0;i<sort.length;i++){
            sort[i]=sc.nextByte();
        }
        for(int i=0;i<sort.length-1;i++){
            for(int j=0;j<sort.length-i-1;j++){
                    if(sort[j]<sort[j+1]){
                        temp=sort[j];
                        sort[j]=sort[j+1];
                        sort[j+1]=temp;
                    }
            }
        }
        System.out.println("排列后的顺序是");
        for (int i:
             sort) {
            System.out.println(i+"     ");
        }
    }
}
