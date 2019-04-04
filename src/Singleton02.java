/**
 * 单例模式
 *
 *
 * 懒汉式（非线程安全）
 *
 * 所谓 “ 懒汉式” 就是说单例实例在第一次被使用时构建，而不是在JVM在加载这个类时就马上创建此唯一的单例实例。
 */
public class Singleton02 {

    private static Singleton02 uniqueInstance;

    private Singleton02(){}

    //没有加入synchronized关键字的版本是线程不安全的
    public static Singleton02 getInstance(){

        //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (uniqueInstance == null){
            uniqueInstance = new Singleton02();
        }

        return uniqueInstance;
    }
}
