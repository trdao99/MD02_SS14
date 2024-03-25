package bai8;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckEvenNum {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1000)).limit(100).sorted().collect(Collectors.toList());
        Optional<Boolean> even = Optional.of(random.stream().anyMatch(num -> num % 2 == 0));
        System.out.println("số chẵn trong danh sách: "+ random.stream().filter(num -> num%2==0).findFirst().get()+" "+ even.orElseThrow(() -> new RuntimeException("Không có số chẵn")));

    }
}