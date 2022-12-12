package java_model_design.factory_model;

/**
 * @program: leetcode
 * @className: Weixin
 * @description:
 * @author:
 * @create: 2022-11-28 15:34
 * @Version 1.0
 **/
public class WeiXin implements Chat{

    @Override
    public void chatting(String seqNo) {
        System.out.println("使用微信进行聊天 -- " + seqNo);
    }
}
