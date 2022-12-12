package java_model_design.factory_model;

/**
 * @program: leetcode
 * @className: ChatFactory3
 * @description:
 * @author:
 * @create: 2022-11-28 16:03
 * @Version 1.0
 **/
public class ChatFactory3 {

    public static Chat createQQChat() {
        return new QQ();
    }

    public static Chat createWeiXinChat() {
        return new WeiXin();
    }
}
