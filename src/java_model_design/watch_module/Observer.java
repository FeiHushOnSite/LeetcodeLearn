package java_model_design.watch_module;

/**
 * @program: leetcode
 * @interfaceName: Observer
 * @description: 抽象观察者
 * @author:
 * @create: 2022-11-28 10:54
 * @Version 1.0
 **/
public interface Observer {

    void update(String message);
}
