package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @className: Lenovo01Factory
 * @description:
 * @author:
 * @create: 2022-11-29 10:39
 * @Version 1.0
 **/
public class Lenovo01Factory implements AComputerFactory{


    @Override
    public ProduceKeyBord createKeyBord() {
        // 使用雷柏的键盘
        return new LeiBoKeyBord();
    }

    @Override
    public ProduceMouse createMouse() {
        // 使用雷柏的鼠标
        return new LeiBoMouse();
    }
}
