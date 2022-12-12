package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @className: LeiBoKeyBord
 * @description:
 * @author:
 * @create: 2022-11-29 10:41
 * @Version 1.0
 **/
public class LeiBoKeyBord implements ProduceKeyBord{

    @Override
    public void produceKeyBord(String name, String color) {
        System.out.println("雷柏键盘 --" + name + "," + color);
    }
}
