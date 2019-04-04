/**
 * 单例模式
 *
 *
 * 懒汉式（双重检查加锁版）
 *
 * 利用双重检查加锁（double-checked locking），
 * 首先检查是否实例已经创建，
 * 如果尚未创建，“才”进行同步。这样以来，只有一次同步
 */
public class Singleton04 {

    private volatile static Singleton04 uniqueInstance;

    private Singleton04() {}

    public static Singleton04 getInstance() {

        //检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance == null) {

            //只有第一次才彻底执行这里的代码
            synchronized(Singleton04.class) {

                //进入同步代码块后，再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton04();
                }
            }
        }
        return uniqueInstance;
    }
}
