package leetcode_algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @className: CountMatches
 * @description: 给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 *
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 *
 * @author:
 * @create: 2022-11-28 09:58
 * @Version 1.0
 **/
public class CountMatches {

    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();

        List<String> item = new ArrayList<>();
        item.add("phone");
        item.add("blue");
        item.add("pixel");
        List<String> item1 = new ArrayList<>(); //"computer","silver","lenovo"
        item1.add("computer");
        item1.add("silver");
        item1.add("lenovo");
        List<String> item2 = new ArrayList<>(); //"phone","gold","iphone"
        item2.add("phone");
        item2.add("gold");
        item2.add("iphone");

        result.add(item);
        result.add(item1);
        result.add(item2);

        result.forEach(System.out::println);

        int i = countMatches(result, "color", "silver");
        System.out.println(i);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int index = -1;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
//        res = countMatches(items, index, ruleValue, res);
        for (List<String> item : items) {
            if(!item.isEmpty()) {
                if(item.get(index).equals(ruleValue)) {
                    res++;
                }
            }
        }
        return res;
    }

    public static int countMatches(List<List<String>> items, int ruleKey, String ruleValue, int res) {
        for (List<String> item : items) {
            if(!item.isEmpty()) {
                if(item.get(ruleKey).equals(ruleValue)) {
                    res++;
                }
            }
        }
        return res;
    }
}
