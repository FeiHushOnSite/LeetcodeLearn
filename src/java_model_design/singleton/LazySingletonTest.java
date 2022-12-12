package java_model_design.singleton;

/**
 * @program: IdeaProjects
 * @className: LazySingletonTest
 * @description:
 * @author:
 * @create: 2022-12-01 22:25
 * @Version 1.0
 **/
public class LazySingletonTest {

    public static void main(String[] args) {
        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}
class LazySingleton {
    private volatile static LazySingleton instance;

    //避免外部进行实例创建
    public LazySingleton() {
    }

    /**
     * volalite 对应的指令空间不会发生重排序,会按照既定的顺序执行
     * double check 双重检查 加锁优化
     * @return
     */
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                    //1 字节码层
                    //JIT just in time 指令重排
                    //2 初始化
                    //3 引用赋值
                }
            }
        }
        return instance;
    }
}