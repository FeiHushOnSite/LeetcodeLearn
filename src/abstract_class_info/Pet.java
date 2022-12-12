package abstract_class_info;

/**
 * @program: leetcode
 * @className: Pet
 * @description:
 * @author:
 * @create: 2022-11-29 11:07
 * @Version 1.0
 **/
public abstract class Pet {

    protected String name;

    protected String color;

    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //抽象方法： 1. 用abstract修饰，2 没有方法体，直接用分号结束 3 抽象方法需要在子类中重写
    public abstract void eat();
}
