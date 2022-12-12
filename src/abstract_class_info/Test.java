package abstract_class_info;

/**
 * @program: leetcode
 * @className: Test
 * @description:
 * @author:
 * @create: 2022-11-29 11:10
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Pet pet = new Cat("花花","白色");
        pet.eat();
        System.out.println(pet.name);
        System.out.println(pet.color);
    }
}
