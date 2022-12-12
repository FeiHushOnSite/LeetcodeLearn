package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @interfaceName: ProduceMouse
 * @description:
 * @author:
 * @create: 2022-11-29 10:37
 * @Version 1.0
 **/
public interface ProduceMouse {

    /**
     * 约定鼠标生产规格数据
     *
     * @param name 名称
     * @param type 类型
     */
    void produceMouse(String name, String type);
}
