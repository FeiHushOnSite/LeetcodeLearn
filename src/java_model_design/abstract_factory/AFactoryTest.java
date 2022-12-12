package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @className: AFactoryTest
 * @description:
 * @author:
 * @create: 2022-11-29 10:45
 * @Version 1.0
 **/
public class AFactoryTest {

    // 用户需要购买联想的电脑，但要求键盘和鼠标都是雷柏的，于是便找到了对应的01电脑组装工厂进行生产
    Lenovo01Factory lenovo01Factory = new Lenovo01Factory();

    ProduceKeyBord keyboard1 = lenovo01Factory.createKeyBord();

    ProduceMouse mouse1 = lenovo01Factory.createMouse();


}
