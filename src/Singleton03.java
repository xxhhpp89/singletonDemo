/**
 * 单例模式
 *
 *
 * 懒汉式（synchronized关键字线程安全版）
 */
public class Singleton03 {

    private static Singleton03 uniqueInstance;

    private Singleton03(){}

    public static synchronized Singleton03 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton03();
        }

        return uniqueInstance;
    }
}
