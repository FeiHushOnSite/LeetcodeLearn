package java_model_design.factory_model;

/**
 * @program: leetcode
 * @className: ChatFactory2
 * @description:
 * @author:
 * @create: 2022-11-28 15:38
 * @Version 1.0
 **/
public class ChatFactory2 {

    public Chat createQQChat() {
        return new QQ();
    }

    public Chat createWeiXinChat() {
        return new WeiXin();
    }
}
