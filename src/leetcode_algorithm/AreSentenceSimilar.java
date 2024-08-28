package leetcode_algorithm;

import java.util.Arrays;

/**
 * @program: LeetcodeLearn
 * @className: AreSentenceSimilar
 * @description: 两个句子按照空格分隔得到的字符串数组，一定能通过过往的其中的一个字符串插入某个字符串数组（可以为空）
 * 得到另外一个字符串数组，通过双指针完成。i 表示两个字符串数组从左开始，最多有i个字符串相同。j表示剩下字符串数组从右开始
 * 最多有j个字符串相同，如果i + j 正好是某个 字符串长度，那么原字符串就是相似
 * @author:
 * @create: 2023-01-16 16:37
 * @Version 1.0
 **/
public class AreSentenceSimilar {

    public static void main(String[] args) {
        String sentence1 = "Ogn WtWj HneS";
        String sentence2 = "Ogn WtWj HneS";
        System.out.println(areSentenceSimilar(sentence1, sentence2));
    }

    private static boolean areSentenceSimilar(String sentence1, String sentence2) {
        String[] word1 = sentence1.split(" ");
        String[] word2 = sentence2.split(" ");
        Arrays.stream(word1).forEach(System.out::println);
        Arrays.stream(word2).forEach(System.out::println);
        int i = 0, j = 0;
        while(i < word1.length && i < word2.length && word1[i].equals(word2[i])){
            i++;
        }

        while(j < word1.length - 1 && j < word2.length - 1&& word1[word1.length - j - i].equals(word2[word2.length - j - 1])) {
            j++;
        }
        return i + j == Math.min(word1.length, word2.length);
    }
}
