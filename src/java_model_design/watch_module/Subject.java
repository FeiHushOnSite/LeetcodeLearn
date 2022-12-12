package java_model_design.watch_module;

/**
 * @program: leetcode
 * @interfaceName: Subject
 * @description: 抽象主题
 * @author:
 * @create: 2022-11-28 10:55
 * @Version 1.0
 **/
public interface Subject {

    /**
     * 增加订阅者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 增加订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 增加订阅者更新信息
     * @param message
     */
    void notify(String message);
}
