package leetcode_algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @program: LeetcodeLearn
 * @className: DestCity
 * @description:
 * @author:
 * @create: 2024-09-27 09:51
 * @Version 1.0
 **/
public class DestCity {

    static String CASE = "[[\"pYyNGfBYbm\",\"wxAscRuzOl\"],[\"kzwEQHfwce\",\"pYyNGfBYbm\"]]";
    public String destCity(List<List<String>> paths) {
        Set<String> citiesA = paths.stream().map(e -> e.get(0)).collect(Collectors.toSet());
        for (List<String> path : paths) {
            if (!citiesA.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
//        String first = paths.stream().map(e -> e.stream().findFirst()).map(Optional::get).findAny().get();
//        String last = paths.stream().skip(paths.size() - 1).map(e -> e.stream().skip(e.size() - 1).findFirst().get()).findAny().get();
//        return first.equals(last) ? paths.stream().map(e -> e.stream().skip(e.size() - 1).findAny()).map(Optional::get).findAny().get() : last;
    }
    public static void main(String[] args) {
        DestCity destCity = new DestCity();

//        String res = destCity.destCity(Arrays.asList(Arrays.asList("London", "New York"),
//                Arrays.asList("New York", "Lima"),
//                Arrays.asList("Lima", "Sao Paulo")));

        String res = destCity.destCity(Arrays.asList(Arrays.asList("pYyNGfBYbm", "wxAscRuzOl"),
                Arrays.asList("kzwEQHfwce", "pYyNGfBYbm")));

//        List<List<String>> list = Arrays.asList(Arrays.asList("pYyNGfBYbm", "wxAscRuzOl"));
//        String s = list.stream().map(e -> e.stream().skip(e.size() - 1).findAny().get()).findAny().get();
        System.out.println(res);
    }
}

