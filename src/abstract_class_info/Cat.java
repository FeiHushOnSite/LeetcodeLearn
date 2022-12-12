package abstract_class_info;

/**
 * @program: leetcode
 * @className: Cat
 * @description:
 * @author:
 * @create: 2022-11-29 11:09
 * @Version 1.0
 **/
public class Cat extends Pet{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.color + "的" + this.name + "吃小鱼");
    }
}
