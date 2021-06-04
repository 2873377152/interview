import java.util.Collection;

/**
 * @author ：TianZhuang
 * @PackageName：PACKAGE_NAME
 * @className ：Collection370
 * @date ：Created 2021/5/29 18:41
 * @description：检测任意集合是否包含指定元素的泛型方法
 */
public class Collection370 {
    public static<E> boolean contain(Collection<E> c, Object obj) {
        for(E element:c){
            if(element.equals(obj)){
                return true;
                return false;
            }
        }
    }
}

