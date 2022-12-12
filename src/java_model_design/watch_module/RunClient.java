package java_model_design.watch_module;

/**
 * @program: leetcode
 * @className: RunClient
 * @description:
 * @author:
 * @create: 2022-11-28 11:18
 * @Version 1.0
 **/
public class RunClient {

    public static void main(String[] args) {
        WxUser zhangsan = new WxUser("zhangsan");
        WxUser wangwu = new WxUser("wangwu");
        WxUser lisi = new WxUser("lisi");

        //创建群聊（主题），将三个用户添加到群聊中
        WechatGroupSubject wechatGroupSubject = new WechatGroupSubject();
        wechatGroupSubject.attach(zhangsan);
        wechatGroupSubject.attach(wangwu);
        wechatGroupSubject.attach(lisi);

        //通知所有用户
        wechatGroupSubject.notify("hello world");
        System.out.println("----------------------------");
        //把wangwu踢出群聊
        wechatGroupSubject.detach(wangwu);
        wechatGroupSubject.notify("wangwu 被踢出群聊");
    }
}
