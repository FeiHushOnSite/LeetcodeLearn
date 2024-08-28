package leetcode_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: LeetcodeLearn
 * @className: GetImportantEmp
 * @description:
 *                         id = 1
 *                      importance = 5
 *                      |           \
 *                     |             \
 *                    |               \
 *                   |                 \
 *                 id = 2             id = 3
 *              important = 3      important = 3
 * 深度优先算法。根据给定的员工编号找到员工，从该员工开始遍历，对于每个员工，将其重要性加到总和中
 * 然后对该员工的每个直系下属继续遍历，直到所有下属遍历完毕，此时的总和即为给定的员工及其所有下属的重要性之和
 * 由于给定的员工编号，且每个员工的编号都不相同，因此可以使用哈希表存储每个员工编号和对应的员工，即可通过员工编号得到对应员工
 * @author:
 * @create: 2024-08-26 11:19
 * @Version 1.0
 **/
public class GetImportantEmp {

    public static Map<Integer, Employee> map = new HashMap<Integer, Employee>();

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(Employee.of(1, 5, Arrays.asList(2, 3)),
                Employee.of(2, 3, new ArrayList<>()),
                Employee.of(3, 3, new ArrayList<>()));

        int importance = getImportance(list, 1);
        System.out.println(importance);
    }

    public static int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    public static int dfs(int id) {
        Employee employee = map.get(id);
        int total = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        for (Integer subId : subordinates) {
            total += dfs(subId);
        }
        return total;
    }

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getImportance() {
            return importance;
        }

        public void setImportance(int importance) {
            this.importance = importance;
        }

        public List<Integer> getSubordinates() {
            return subordinates;
        }

        public void setSubordinates(List<Integer> subordinates) {
            this.subordinates = subordinates;
        }

        public static Employee of(int id, int importance, List<Integer> subordinates) {
            Employee employee = new Employee();
            employee.setId(id);
            employee.setImportance(importance);
            employee.setSubordinates(subordinates);
            return employee;
        }
    }

    ;
}
