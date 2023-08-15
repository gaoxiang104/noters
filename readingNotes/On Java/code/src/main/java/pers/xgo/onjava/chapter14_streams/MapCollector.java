package pers.xgo.onjava.chapter14_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Pair {
    public final Character c;
    public final Integer i;

    public Pair(Character c, Integer i) {
        this.c = c;
        this.i = i;
    }

    public Character getC() {
        return c;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Pair(" + c + ", " + i + ")";
    }
}

class RandomPair {
    Random rand = new Random(47);
    // 一个无限大大迭代器，指向随机生成大大写字母：
    Iterator<Character> capChars = rand.ints(65, 91)
            .mapToObj(i -> (char) i)
            .iterator();

    public Stream<Pair> stream() {
        return rand.ints(100, 1000)
                .distinct()
                .mapToObj(i -> new Pair(capChars.next(), i));
    }
}

public class MapCollector {
    public static void main(String[] args) {
        Map<Integer, Character> map =
                new RandomPair().stream()
                        .limit(8)
                        .collect(Collectors.toMap(Pair::getI, Pair::getC));
        System.out.println(map);

        Stream<Character> stream = StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(new RandomPair().capChars, Spliterator.ORDERED),
                false);
        System.out.println(stream.count());


    }
}
