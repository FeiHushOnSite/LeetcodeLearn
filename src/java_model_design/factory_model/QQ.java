package java_model_design.factory_model;

/**
 * @program: leetcode
 * @className: QQ
 * @description:
 * @author:
 * @create: 2022-11-28 15:33
 * @Version 1.0
 **/
public class QQ implements Chat{

    @Override
    public void chatting(String seqNo) {
        System.out.println("适用QQ进行聊天 -- " + seqNo);
    }
}
