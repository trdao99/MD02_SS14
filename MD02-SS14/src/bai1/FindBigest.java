package bai1;
import java.util.*;
import java.util.stream.Stream;

public class FindBigest {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(() -> new Random().nextInt(1000)).limit(100).sorted().toList();
        Optional<Integer> max = random.stream().max(Comparator.comparingInt(o -> o));
        System.out.println("Số lớn nhất trong danh sách: " + max.orElseThrow(() -> new RuntimeException("ko co")));
    }
}
