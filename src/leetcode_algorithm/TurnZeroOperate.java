package leetcode_algorithm;

/**
 * @program: leetcode
 * @className: TurnZeroOperate
 * @description: 将数字变成 0 的操作次数
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 * 输入：num = 14
 * 输出：6
 * 解释：
 * 步骤 1) 14 是偶数，除以 2 得到 7 。
 * 步骤 2） 7 是奇数，减 1 得到 6 。
 * 步骤 3） 6 是偶数，除以 2 得到 3 。
 * 步骤 4） 3 是奇数，减 1 得到 2 。
 * 步骤 5） 2 是偶数，除以 2 得到 1 。
 * 步骤 6） 1 是奇数，减 1 得到 0 。
 * 链接：<a href="https://leetcode.cn/problems/number-of-steps-to-reduce-a-number-to-zero">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: 来源：力扣（LeetCode）
 * @create: 2022-10-31 15:57
 * @Version 1.0
 **/
public class TurnZeroOperate {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int res = 0;
        while(num > 0) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            res++;
        }
        return res;
    }
}
