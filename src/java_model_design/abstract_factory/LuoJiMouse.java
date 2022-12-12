package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @className: LuoJiMouse
 * @description:
 * @author:
 * @create: 2022-11-29 10:44
 * @Version 1.0
 **/
public class LuoJiMouse implements ProduceMouse{

    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标 --" + name + "," + type);
    }
}
