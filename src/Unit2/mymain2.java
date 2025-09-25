package Unit2;

public class mymain2 {
    public static void main(String[] args) {
        Thread1 th=new Thread1();
        Thread2 th2=new Thread2();
        th.start();
        th2.start();
    }
}
