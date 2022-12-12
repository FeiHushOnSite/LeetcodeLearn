package java_model_design.factory_model;

/**
 * @program: leetcode
 * @className: FactoryTest
 * @description:
 * @author:
 * @create: 2022-11-28 16:05
 * @Version 1.0
 **/
public class FactoryTest {
    public static void main(String[] args) {
        //1.使用单方法工厂模式进行测试
        ChatFactory1 chatFactory1 = new ChatFactory1();
        String seqNo = "1";
        Chat weiXin1 = chatFactory1.createChat("WeiXin");
        weiXin1.chatting(seqNo);
        Chat qq1 = chatFactory1.createChat("QQ");
        qq1.chatting(seqNo);
        Chat moMo = chatFactory1.createChat("MoMo");
        if(moMo == null) {
            System.out.println("创建陌陌聊天工具实例失败");
        } else {
            moMo.chatting(seqNo);
        }

        System.out.println("============分割线=============");

        //2。使用多工厂模式进行测试
        ChatFactory2 chatFactory2 = new ChatFactory2();
        seqNo = "2";
        Chat weiXin2 = chatFactory2.createWeiXinChat();
        weiXin2.chatting(seqNo);
        Chat qq2 = chatFactory2.createQQChat();
        qq2.chatting(seqNo);

        System.out.println("============分割线=============");

        //3。使用静态工厂模式进行测试
        seqNo = "3";
        Chat weiXin3 = ChatFactory3.createWeiXinChat();
        weiXin3.chatting(seqNo);
        Chat qq3 = ChatFactory3.createQQChat();
        qq3.chatting(seqNo);

        //对比静态工厂模式最佳，省了工厂实例的创建
    }
}
