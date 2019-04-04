/**
 * 单例模式
 *
 *
 * 饿汉式（枚举方式）
 *
 * 这是实现单例模式的最佳方法
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化
 */
public enum Singleton06 {

    //定义一个枚举的元素，它就是 Singleton 的一个实例
    INSTANCE;

    public void doSomeTing(){
        System.out.println("枚举方法实现单例");
    }

}
