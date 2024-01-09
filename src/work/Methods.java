package work;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        //filter(Predicate)
          //boolean value function,e->e>10;


        //map(function)-each element operation

//        List<String> names = List.of("Aman","Ankit","Abhinav","Durgesh");
//        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
//        System.out.println(newNames);
//        //or
//        newNames.stream().forEach(e-> System.out.println(e));
//        //or
//        newNames.stream().forEach(System.out::println);
//
//        List<Integer> numbers = List.of(23,20,6,8,9,4);
//        List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
//        System.out.println(newNumbers);
//
//
//        //sort
//        numbers.stream().sorted().forEach(System.out::println);
//
//        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
//        System.out.println("min "+integer);
//
//        Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
//        System.out.println("max "+integer1);
//
        //Pankaj Sir Notes
        //        Predicate<Integer> val = y->y%2==0;
//        boolean result = val.test(10);
//        System.out.println(result);

//        Predicate<String> val = str->str.equals("mike");
//       boolean result = val.test("aashif");
//        System.out.println(result);

//        List<Integer> numbers = Arrays.asList(10,12,1,5,16,19,20);
//        List<Integer> evenNumbers = numbers.stream().filter(n->n%2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

//        List<Integer> numbers = Arrays.asList(10,12,1,5,16,19,20);
//        List<Integer> oddNumbers = numbers.stream().filter(n->n%2 != 0).collect(Collectors.toList());
//        System.out.println(oddNumbers);

        List<String> names = Arrays.asList("mike","adam","mike","stallin");
        List<String> data1 = names.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        List<String> data2 = names.stream().filter(s->s.equals("mike")).collect(Collectors.toList());
        List<String> data3 = names.stream().filter(s->s.endsWith("n")).collect(Collectors.toList());
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);

        Function<Integer,Integer> result = i->i+10;
        Integer val = result.apply(30);
        System.out.println(val);

        List<Integer> data = Arrays.asList(10,20,30,60,90);
        List<Integer> newNumber = data.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(newNumber);

//        List<String> name = Arrays.asList("mike","stallin","adam","hari","aashif");
//        List<String> newData = name.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> name = Arrays.asList("mike","stallin","adam","hari","aashif");
//        List<String> newData = name.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

        List<Integer> name = Arrays.asList(15,3,60,70,90);
        List<Integer> newData = name.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);

        List<Integer> num = Arrays.asList(15,3,60,100,1,15,100,60);
        List<Integer> rdnum = num.stream().distinct().collect(Collectors.toList());
        System.out.println(rdnum);



    }

}
