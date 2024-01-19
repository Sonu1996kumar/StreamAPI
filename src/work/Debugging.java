package work;

public class Debugging {
    public static void main(String[] args) {
        Debugging debugging =new Debugging();
        System.out.println(100);
        System.out.println(200);
        int val = debugging.test();
        System.out.println(val);
    }
//    public  int test(){
//        int x = 100;
//        return x*x;
//    }

    public int test(){
        int otp = SampleTest.test1();
        return otp;
    }
}
