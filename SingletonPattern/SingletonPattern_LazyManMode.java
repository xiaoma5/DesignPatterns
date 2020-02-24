package SingletonPattern;

/**
 * @author xiaoma
 * @create 2020-02-24 14:46:11
 * @desc ... 单例模式（懒汉式==在需要对象时才创建）
 * 双重检查加锁（因为synchronized会严重影响性能，这样可以保证synchronized只执行一次）
 */
public class SingletonPattern_LazyManMode {
    private volatile static SingletonPattern_LazyManMode uniqueInstance;

    private SingletonPattern_LazyManMode() {};

    public static SingletonPattern_LazyManMode getInstance() {
        if (null == uniqueInstance) {
            synchronized (SingletonPattern_LazyManMode.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new SingletonPattern_LazyManMode();
                }
            }
        }
        return uniqueInstance;
    }
}

class ThreadTestSingletonPattern_LazyManMode implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "...." + SingletonPattern_LazyManMode.getInstance());
        }
    }

    public static void main(String[] args) {
        ThreadTestSingletonPattern_LazyManMode x = new ThreadTestSingletonPattern_LazyManMode();
        Thread t0 = new Thread(x);
        Thread t1 = new Thread(x);
        Thread t2 = new Thread(x);
        Thread t3 = new Thread(x);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
