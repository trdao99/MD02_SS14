package bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("dap", "amh", "bao"));
        strings.stream().sorted().forEach(System.out::println);

    }
}
