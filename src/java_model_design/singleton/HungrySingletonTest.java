package java_model_design.singleton;

/**
 * @program: IdeaProjects
 * @className: HungrySingleton
 * @description:
 * @author:
 * @create: 2022-12-01 22:50
 * @Version 1.0
 **/
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(hungrySingleton);
    }
}

/**
 * 饿汉模式编写
 * JVM保证线程安全并且只会完成一次
 */
class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
