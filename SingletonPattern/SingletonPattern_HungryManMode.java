package SingletonPattern;

/**
 * @author xiaoma
 * @create 2020-02-24 15:30:57
 * @desc ... 单例模式（饿汉式==JVM在加载这个类时马上创建唯一的单例实例）
 */
public class SingletonPattern_HungryManMode {
    private static SingletonPattern_HungryManMode uniqueInstance = new SingletonPattern_HungryManMode();

    private SingletonPattern_HungryManMode() {};

    public static SingletonPattern_HungryManMode getInstance() {
        return uniqueInstance;
    }
}

class ThreadTestSingletonPattern_HungryManMode implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "...." + SingletonPattern_HungryManMode.getInstance());
        }
    }

    public static void main(String[] args) {
        ThreadTestSingletonPattern_HungryManMode x = new ThreadTestSingletonPattern_HungryManMode();
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

