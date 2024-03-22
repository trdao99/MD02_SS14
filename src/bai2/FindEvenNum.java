package bai2;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class FindEvenNum {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1000)).limit(100).sorted().toList();
        random.stream().filter((num) -> num%2==0).forEach(System.out::println);
    }
}
