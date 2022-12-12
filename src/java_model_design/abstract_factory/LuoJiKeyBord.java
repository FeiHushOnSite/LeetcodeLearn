package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @className: LuoJiKeyBord
 * @description:
 * @author:
 * @create: 2022-11-29 10:42
 * @Version 1.0
 **/
public class LuoJiKeyBord implements ProduceKeyBord{

    @Override
    public void produceKeyBord(String name, String color) {
        System.out.println("罗技键盘 --" + name + "," + color);
    }
}
