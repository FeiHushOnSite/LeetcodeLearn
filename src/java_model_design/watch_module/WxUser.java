package java_model_design.watch_module;

/**
 * @program: leetcode
 * @className: WxUser
 * @description:
 * @author:
 * @create: 2022-11-28 11:05
 * @Version 1.0
 **/
public class WxUser implements Observer {

    //用户名
    private String username;

    public WxUser(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println("用户【"+ this.username + "】接收到消息:" + message);
    }
}
