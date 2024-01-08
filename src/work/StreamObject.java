package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Strem API - collection process
        //collection / group of object par bhi kaam karta hai

        //1-blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));

        //2-array,object,collection
        String names[] = {"Durgesh","Uttam","Ankit","Divya"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e-> System.out.println(e));

        //3
        Stream<Object> streamBuilder = Stream.builder().build();

        //4
        IntStream stream = Arrays.stream(new int[]{2,4,65,3,564});
        stream.forEach(e-> System.out.println(e));


        //5-mostly use,list,Set
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(11);

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(e-> System.out.println(e));
    }
}
