package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: ReplaceStrFromKeyWord
 * @description:
 * @author:
 * @create: 2023-01-12 09:40
 * @Version 1.0
 **/
public class ReplaceStrFromKeyWord {

    public static void main(String[] args) {
        String request = "(name)is(age)yearsold";
        String key;
        boolean addKey = true;
        for (int i = 0; i < request.length(); i++) {
            char a = request.charAt(i);
            if(a == '(')
            System.out.print(a + "\t");
        }
    }

    public static void replaceStrFromKeyWord() {

    }
}
