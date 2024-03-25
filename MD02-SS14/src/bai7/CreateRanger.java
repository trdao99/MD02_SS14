package bai7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CreateRanger {
    public static void main(String[] args) {
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();

        IntStream.range(num1, num2 + 1).forEach(System.out::println);
    }
}