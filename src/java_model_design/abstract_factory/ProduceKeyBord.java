package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @interfaceName: ProduceKeyBord
 * @description:
 * @author:
 * @create: 2022-11-29 10:35
 * @Version 1.0
 **/
public interface ProduceKeyBord {
    /**
     * 约定键盘生产的规格数据
     *
     * @param name  名称
     * @param color 颜色
     */
    void produceKeyBord(String name, String color);
}
