package leetcode_TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: IdeaProjects
 * @className: LevelOrder
 * @description:
 * @author:
 * @create: 2022-12-06 13:35
 * @Version 1.0
 **/
public class LevelOrder {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.convertArrToTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> lists = levelOrder(treeNode);
        lists.forEach(System.out::print);
        lists.stream()
                .flatMap(e -> e
                        .stream()
                        .map(Integer::doubleValue))
                .forEach(System.out::println);
        test("测试 检测 测", "ads");
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        //创建一个队列
        Queue<TreeNode> queue = new LinkedList<>();
        //把根节点加入到队列中
        queue.offer(root);
        //如果队列不为空就一直要循环
        while(!queue.isEmpty()) {
            //记录每层有多少个节点
            int levelCount = queue.size();
            List<Integer> mList = new ArrayList<>();
            while(levelCount-- > 0) {
                TreeNode cur = queue.poll(); //出队
                mList.add(cur.val);
                //左右子树如果不为空的，就加入到队列中
                if(cur.left != null)
                    queue.offer(cur.left);
                if(cur.right != null)
                    queue.offer(cur.right);
            }
            res.add(mList);
        }
        return res;
    }

    public static void test(String ... value) {
        System.out.println(Arrays.toString(value));
    }
}
