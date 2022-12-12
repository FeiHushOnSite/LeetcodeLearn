package java_model_design.factory_model;

/**
 * @program: leetcode
 * @className: ChatFactory1
 * @description:
 * @author:
 * @create: 2022-11-28 15:36
 * @Version 1.0
 **/
public class ChatFactory1 {

    public Chat createChat(String tools) {
        if ("QQ".equals(tools)) {
            return new QQ();
        } else if ("WeiXin".equals(tools)) {
            return new WeiXin();
        } else {
            return null;
        }
    }
}
