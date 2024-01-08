package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //Q)create a List and Filter all even numbers from List

        List<Integer> list1 = List.of(2,4,50,21,22,67);
        //this list is immutable

        //this is mutable
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(67);

        //immutable
        List<Integer> list3 = Arrays.asList(23,45,12,666,67);

        //list1
        //without stream
        List<Integer> listEven = new ArrayList<>();

        for(Integer i: list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        //using stream api
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newList1);


    }

}
