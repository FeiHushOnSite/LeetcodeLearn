package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @className: LeiBoMouse
 * @description:
 * @author:
 * @create: 2022-11-29 10:43
 * @Version 1.0
 **/
public class LeiBoMouse implements ProduceMouse{

    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标 --" + name + "," + type);
    }
}
