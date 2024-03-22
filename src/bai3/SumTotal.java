package bai3;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class SumTotal {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1000)).limit(100).sorted().toList();
        System.out.println(random.stream().reduce(0,Integer::sum));;

    }
}
