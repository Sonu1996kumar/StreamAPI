package work;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
               new Employee("mike",30,"chennai") ,
                new Employee("adam",25,"chennai") ,
                new Employee("stallin",31,"pune") ,
                new Employee("sam",34,"bengaluru")
        );

       List<Employee> emps =  employees.stream().filter(emp->emp.getAge()>30).collect(Collectors.toList());
       for(Employee e:emps){
           System.out.println(e.getName());
           System.out.println(e.getCity());
           System.out.println(e.getAge());
       }
       //q2
        List<String> names = Arrays.asList("assif","kaushal","hari","anish");

      List<String> newName=names.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
      //newName.forEach(n-> System.out.println(n));

        for(String n:newName){
            System.out.println(n);
        }

        //q3
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> number = num.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
       number.forEach(n-> System.out.println(n));

       //q4
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100,"USD"),
                new Transaction(105,"RUPAYA"),
                new Transaction(200,"RIYAL"),
                new Transaction(300,"RUPAYA"),
                new Transaction(400,"USD"),
                new Transaction(200,"USD")

        );

        double totalSum = transactions.stream().filter(t->t.getCurrency().equals("RUPAYA")).mapToDouble(Transaction::getAmt).sum();
        System.out.println(totalSum);

        //Group by
        Map<String,List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e->e.getCity()));
        System.out.println(collect);


//        Map<Integer,List<Employee>> col=employees.stream().collect(Collectors.groupingBy(e->e.getAge()));
//        System.out.println(col);
//        //m1:bas address hi aa rha hai group ke baad
//        col.forEach((age,employeeList)-> System.out.println("Employee with age "+ age + ":" + employeeList));
//
//
//        //m2 by sir
//        for(Map.Entry<Integer,List<Employee>> entry : col.entrySet()){
//            int age= entry.getKey();
//            List<Employee> employeeWithAge = entry.getValue();
//            System.out.println("age: "+age+"----");
//
//            for(Employee e: employeeWithAge){
//                System.out.println(e.getCity());
//                System.out.println(e.getName());
//           }
   //     }

        for(Map.Entry<String,List<Employee>> entry : collect.entrySet()){
           String  city= entry.getKey();
           List<Employee> employeeWithCity = entry.getValue();
           System.out.println("city: "+city+"----");

           for(Employee e: employeeWithCity){
               System.out.println(e.getAge());
               System.out.println(e.getName());
          }
                }

    }
}
