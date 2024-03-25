package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Toupper {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String s = new String();
            s = "chucai: "+ i;
            strings.add(s);
        }
        System.out.println(strings);
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
