package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        //filter(Predicate)
          //boolean value function,e->e>10;


        //map(function)-each element operation

        List<String> names = List.of("Aman","Ankit","Abhinav","Durgesh");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);
        //or
        newNames.stream().forEach(e-> System.out.println(e));
        //or
        newNames.stream().forEach(System.out::println);

        List<Integer> numbers = List.of(23,20,6,8,9,4);
        List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumbers);


        //sort
        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min "+integer);

        Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max "+integer1);
    }
}
