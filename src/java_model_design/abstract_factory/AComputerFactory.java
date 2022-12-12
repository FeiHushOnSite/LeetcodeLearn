package java_model_design.abstract_factory;

/**
 * @program: leetcode
 * @interfaceName: AComputerFactory
 * @description:
 * @author:
 * @create: 2022-11-29 10:34
 * @Version 1.0
 **/
public interface AComputerFactory {

    ProduceKeyBord createKeyBord();
    ProduceMouse createMouse();
}
