package java_model_design.watch_module;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @className: WechatGroupSubject
 * @description: 微信群聊（具体主题）
 * @author:
 * @create: 2022-11-28 11:09
 * @Version 1.0
 **/
public class WechatGroupSubject implements Subject {

    //微信
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加群聊用户
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除群聊用户
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有用户
     * @param message
     */
    @Override
    public void notify(String message) {
        observers.forEach(e -> e.update(message));
    }
}
