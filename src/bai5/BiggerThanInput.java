package bai5;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class BiggerThanInput {
    public static void main(String[] args) {
        System.out.println("input:");
         int num = new Scanner(System.in).nextInt();
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1000)).limit(100).sorted().toList();
        random.stream().filter(t -> t>num).forEach(System.out::println);
    }
}
