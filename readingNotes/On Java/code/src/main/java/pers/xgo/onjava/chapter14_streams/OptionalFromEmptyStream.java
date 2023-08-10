package pers.xgo.onjava.chapter14_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalFromEmptyStream {
    public static void main(String[] args) {
        System.out.println(Stream.<String>empty().findFirst());
        System.out.println(Stream.<String>empty().findAny());
        System.out.println(Stream.<String>empty().max(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty().min(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty().reduce((s1, s2) -> s1 + s2));
        System.out.println(IntStream.empty().average());
    }
}
/* OUTPUT:
Optional.empty
Optional.empty
Optional.empty
Optional.empty
Optional.empty
OptionalDouble.empty
 */